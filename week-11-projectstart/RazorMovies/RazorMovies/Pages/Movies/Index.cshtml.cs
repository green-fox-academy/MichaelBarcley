using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Microsoft.EntityFrameworkCore;
using RazorMovies.Models;

namespace RazorMovies.Pages.Movies
{
    public class IndexModel : PageModel
    {
        private readonly RazorMovies.Models.RazorMoviesContext _context;

        public IndexModel(RazorMovies.Models.RazorMoviesContext context)
        {
            _context = context;
        }

        public IList<Movie> Movie { get;set; }

        public async Task OnGetAsync()
        {
            Movie = await _context.Movie.ToListAsync();
        }
    }
}
