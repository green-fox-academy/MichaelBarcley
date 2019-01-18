using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using TodoApi.Models;

namespace TodoApi.Repositories
{
    public class TodoRepository : ITodoRepository
    {
        private readonly TodoContext context;

        public TodoRepository(TodoContext context)
        {
            this.context = context;
        }

        public void CreateTodo(Todo todo)
        {
            context.Todo.Add(todo);
            context.SaveChanges();
        }

        public void DeleteTodo(long id)
        {
            context.Todo.Remove(GetTodoById(id));
            context.SaveChanges();
        }

        public List<Todo> GetAllTodo()
        {
            return context.Todo.ToList();
        }

        public Todo GetTodoById(long id)
        {
            return context.Todo.Find(id);
        }

        public void UpdateTodo(Todo todo)
        {
            context.Entry(todo).State = EntityState.Modified;
            context.SaveChanges();
        }
    }
}
