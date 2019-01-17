using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.EntityFrameworkCore;

namespace RazorMovies.Models
{
    public class RazorMoviesContext : DbContext
    {
        public RazorMoviesContext (DbContextOptions<RazorMoviesContext> options)
            : base(options)
        {
        }

        public DbSet<RazorMovies.Models.Movie> Movie { get; set; }
    }
}
