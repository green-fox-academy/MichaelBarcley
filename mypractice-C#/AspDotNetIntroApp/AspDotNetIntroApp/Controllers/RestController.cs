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
        public Greeting Greet()
        {
            counter++;
            return new Greeting(counter, "Hello buddy!");
        }
    }
}
