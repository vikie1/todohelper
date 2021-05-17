package io.github.vikie1.restservice.progress.daily;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.vikie1.restservice.todolist.ServTodo;
import io.github.vikie1.restservice.todolist.ToDoList;

@Service
public class ServDailyProgress {
    
    @Autowired
    DailyProgressRepo progressRepo;

    @Autowired
    ServTodo servTodo;

    public void addDailyProgressFromToDo(String id) {
        List<DailyProgress> progresses = new ArrayList<>();
        List<ToDoList> toDoLists = servTodo.getAToDo(id);
        if (!toDoLists.equals(null)) {
            progresses.add((DailyProgress) toDoLists);
        } else {
            return ;
        }
        progressRepo.saveAll(progresses);
    }

    public void addMiscallenousProgress(DailyProgress progress){
        progressRepo.save(progress);
    }

    public List<Object> getDailyProgress() {
        List<Object> objects = new ArrayList<>();
        progressRepo.findAll().forEach(objects :: add);
        return objects;
    }
    
    public void deleteProgress() {
        progressRepo.deleteAll();
    }
}
