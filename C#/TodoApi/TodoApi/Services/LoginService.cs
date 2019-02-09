using Microsoft.Extensions.Options;
using Microsoft.IdentityModel.Tokens;
using System;
using System.Collections.Generic;
using System.IdentityModel.Tokens.Jwt;
using System.Linq;
using System.Security.Claims;
using System.Text;
using TodoApi.Helpers;
using TodoApi.Models;

namespace TodoApi.Services
{
    public class LoginService : ILoginService
    {
        private List<User> users = new List<User>
        {
            new User { Id = 1, UserName = "admin", UserPassword = "test" }
        };
        private readonly AppSettings appSettings;

        public LoginService(IOptions<AppSettings> appSettings)
        {
            this.appSettings = appSettings.Value;
        }

        public User Authenticate(string username, string password)
        {
            var user = users.SingleOrDefault(x => x.UserName == username && x.UserPassword == password);

            if (user == null)
            {
                return null;
            }

            var tokenHandler = new JwtSecurityTokenHandler();
            var key = Encoding.ASCII.GetBytes(appSettings.SecretDecrypter);
            var tokenDescriptor = new SecurityTokenDescriptor
            {
                Subject = new ClaimsIdentity(new Claim[]
                {
                    new Claim(ClaimTypes.Name, user.Id.ToString())
                }),
                Expires = DateTime.UtcNow.AddHours(2),
                SigningCredentials = new SigningCredentials(new SymmetricSecurityKey(key), SecurityAlgorithms.HmacSha256Signature)
            };
            var token = tokenHandler.CreateToken(tokenDescriptor);
            user.Token = tokenHandler.WriteToken(token);

            user.UserPassword = null;

            return user;
        }
    }
}
