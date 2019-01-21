using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using TodoApi.Models;
using TodoApi.Repositories;

namespace TodoApi.Controllers
{
    [Authorize]
    [Route("api/todo")]
    [ApiController]
    public class TodoController : ControllerBase
    {
        private readonly ITodoRepository repository;

        public TodoController(ITodoRepository repository)
        {
            this.repository = repository;
        }

        [HttpGet]
        public ActionResult<List<Todo>> GetAllTodoItems()
        {
            return Ok(repository.GetAllTodo());
        }

        [HttpGet("{id}")]
        public ActionResult<Todo> GetTodoItem(long id)
        {
            return Ok(repository.GetTodoById(id));
        }

        [HttpPost]
        public ActionResult<Todo> CreateNewTodo(Todo todo)
        {
            repository.CreateTodo(todo);
            return CreatedAtAction("GetTodoItem", new { id = todo.Id }, todo);
        }

        [HttpPut("{id}")]
        public ActionResult UpdateTodo(long id, Todo todo)
        {
            if (id != todo.Id)
            {
                return BadRequest();
            }

            repository.UpdateTodo(todo);
            return Ok();
        }

        [HttpDelete("{id}")]
        public ActionResult<Todo> DeleteTodo(long id)
        {
            if (repository.GetTodoById(id) == null)
            {
                return NotFound();
            }

            repository.DeleteTodo(id);
            return NoContent();
        }

        [HttpGet("teapot")]
        public ActionResult easterTeapot()
        {
            return StatusCode(418);
        }
    }
}
