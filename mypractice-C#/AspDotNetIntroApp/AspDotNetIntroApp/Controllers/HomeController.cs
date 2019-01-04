using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;

namespace AspDotNetIntroApp.Controllers
{
    public class HomeController : Controller
    {
        public String Index()
        {
            return "Hello from the Controller!";
        }
    }
}
