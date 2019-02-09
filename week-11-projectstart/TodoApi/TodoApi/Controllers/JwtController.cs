using Microsoft.AspNetCore.Mvc;
using TodoApi.Models;
using TodoApi.Services;

namespace TodoApi.Controllers
{
    [Route("api/auth")]
    public class JwtController : Controller
    {
        private ILoginService loginService;

        public JwtController(ILoginService loginService)
        {
            this.loginService = loginService;
        }

        public IActionResult Authenticate([FromBody] User userData)
        {
            var user = loginService.Authenticate(userData.UserName, userData.UserPassword);

            if (user == null)
            {
                return Unauthorized("Username or password incorrect");
            }

            return Ok(user);
        }
    }
}