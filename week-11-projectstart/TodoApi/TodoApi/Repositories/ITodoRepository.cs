using System.Collections.Generic;
using TodoApi.Models;

namespace TodoApi.Repositories
{
    public interface ITodoRepository
    {
        List<Todo> GetAllTodo();
        Todo GetTodoById(long id);
        void CreateTodo(Todo todo);
        void UpdateTodo(Todo todo);
        void DeleteTodo(long id);
    }
}
