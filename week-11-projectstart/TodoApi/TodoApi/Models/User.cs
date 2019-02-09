namespace TodoApi.Models
{
    public class User
    {
        public long Id { get; set; }
        public string UserName { get; set; }
        public string UserPassword { get; set; }
        public string Token { get; set; }
    }
}
