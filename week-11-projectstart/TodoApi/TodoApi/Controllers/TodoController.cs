using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using TodoApi.Models;
using TodoApi.Repositories;

namespace TodoApi.Controllers
{
    [Route("api/todo")]
    [ApiController]
    public class TodoController : ControllerBase
    {
        private readonly TodoContext context;

        public TodoController(TodoContext context)
        {
            this.context = context;

            if (this.context.Todo.Count() < 2)
            {
                this.context.Todo.Add(new Todo { Name = "Buy milk" });
                this.context.Todo.Add(new Todo { Name = "Go home", Description = "Tram 4-6, then M4", IsUrgent = true });
                this.context.SaveChanges();
            }
        }

        [HttpGet]
        public List<Todo> GetAllTodoItems()
        {
            return context.Todo.ToList();
        }

        [HttpGet("{id}")]
        public Todo GetTodoItem(long id)
        {
            return context.Todo.Find(id);
        }
    }
}
