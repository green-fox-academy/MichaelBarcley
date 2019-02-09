using TodoApi.Models;

namespace TodoApi.Services
{
    public interface ILoginService
    {
        User Authenticate(string username, string password);
    }
}
