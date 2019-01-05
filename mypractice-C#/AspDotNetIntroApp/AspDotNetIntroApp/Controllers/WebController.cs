using AspDotNetIntroApp.Models;
using Microsoft.AspNetCore.Mvc;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace AspDotNetIntroApp.Controllers
{
    [Route("web")]
    public class WebController : Controller
    {
        [HttpGet("greeting")]
        public IActionResult Greeting()
        {
            var greeting = new Greeting()
            {
                Id = 1,
                Content = "from the model"
            };

            return View(greeting);
        }
    }
}
