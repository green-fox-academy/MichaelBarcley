using AspDotNetIntroApp.Models;
using Microsoft.AspNetCore.Mvc;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace AspDotNetIntroApp.Controllers
{
    [Route("api")]
    public class RestController : Controller
    {
        static int counter;

        [HttpGet("greeting")]
        public Greeting Greet(String name)
        {
            counter++;
            if (name == null)
            {
                return new Greeting(counter, "Hello User!");
            } else
            {
            return new Greeting(counter, "Hello " + name + "!");
            }
        }
    }
}
