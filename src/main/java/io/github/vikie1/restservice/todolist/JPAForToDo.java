package io.github.vikie1.restservice.todolist;

import org.springframework.data.repository.CrudRepository;

public interface JPAForToDo extends CrudRepository<ToDoList, String>{
    
}
