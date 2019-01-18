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
        }

        [HttpGet]
        public ActionResult<List<Todo>> GetAllTodoItems()
        {
            return context.Todo.ToList();
        }

        [HttpGet("{id}")]
        public ActionResult<Todo> GetTodoItem(long id)
        {
            return context.Todo.Find(id);
        }

        [HttpPost]
        public ActionResult<Todo> CreateNewTodo(Todo todo)
        {
            context.Todo.Add(todo);
            context.SaveChanges();
            return CreatedAtAction("GetTodoItem", new { id = todo.Id }, todo);
        }
    }
}
