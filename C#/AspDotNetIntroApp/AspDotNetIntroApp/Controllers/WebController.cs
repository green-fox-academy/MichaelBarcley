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
        static int counter;

        [HttpGet("greeting")]
        public IActionResult Greeting(string name)
        {
            counter++;

            Greeting greeting = new Greeting()
            {
                Id = counter,
                Content = name
            };
            if (name == null)
            {
                greeting.Content = "dear User";
            }

            return View(greeting);
        }
    }
}
