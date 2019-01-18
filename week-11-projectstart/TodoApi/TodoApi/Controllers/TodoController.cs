using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
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
            return Ok(context.Todo.ToList());
        }

        [HttpGet("{id}")]
        public ActionResult<Todo> GetTodoItem(long id)
        {
            return Ok(context.Todo.Find(id));
        }

        [HttpPost]
        public ActionResult<Todo> CreateNewTodo(Todo todo)
        {
            context.Todo.Add(todo);
            context.SaveChanges();
            return CreatedAtAction("GetTodoItem", new { id = todo.Id }, todo);
        }

        [HttpPut("{id}")]
        public ActionResult UpdateTodo(long id, Todo todo)
        {
            if (id != todo.Id)
            {
                return BadRequest();
            }

            context.Entry(todo).State = EntityState.Modified;
            context.SaveChanges();
            return Ok();
        }

        [HttpGet("teapot")]
        public ActionResult easterTeapot()
        {
            return StatusCode(418);
        }
    }
}
