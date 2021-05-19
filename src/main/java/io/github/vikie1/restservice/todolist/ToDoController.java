package io.github.vikie1.restservice.todolist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.github.vikie1.restservice.progress.daily.DailyProgress;
import io.github.vikie1.restservice.progress.daily.ServDailyProgress;




@RestController
public class ToDoController {
    
    @Autowired
    ServTodo servTodo;

    @Autowired
    ServDailyProgress servProgress;

    //this method returns all the items in the todo list
    @RequestMapping(value="/todolist", method=RequestMethod.GET)
    public List<ToDoList> outToDoList() {
        return servTodo.getToDos();
    }

    //this method adds/update a todo item in the list
    @RequestMapping(value="/todolist", method=RequestMethod.POST)
    public void addOrUpdateToDoList(@RequestBody ToDoList toDoList) {
        servTodo.addToDos(toDoList);
    }
    
    //delete a to do and update it as progress
    @RequestMapping(value="/todolist/{id}", method=RequestMethod.DELETE)//DONT USE THIS FOR NOW
    public void requestMethodName(@PathVariable String id, @RequestBody DailyProgress progress) {
        servProgress.addMiscallenousProgress(progress);
        servTodo.deleteToDo(id);
    }
    

}
