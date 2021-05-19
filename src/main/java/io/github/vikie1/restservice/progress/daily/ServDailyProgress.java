package io.github.vikie1.restservice.progress.daily;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.vikie1.restservice.todolist.ServTodo;

@Service
public class ServDailyProgress {
    
    @Autowired
    DailyProgressRepo progressRepo;

    @Autowired
    ServTodo servTodo;

    // public void addDailyProgressFromToDo(String id) {
    //     List<ToDoList> toDoLists = servTodo.getAToDo(id);
    //     List<DailyProgress> progresses = (List) toDoLists;
    //     if (!toDoLists.equals(null)) {//
    //     // //     //progresses.addAll((ArrayList) toDoLists);
    //     // //     progresses = 
    //     // //     progressRepo.saveAll(progresses);f(toDoLists);
    //     // progresses.addAll(ToDoList extends <DailyProgress>)
    //     } else {
    //         return ;
    //     }
    //     progressRepo.saveAll(progresses);
    // }

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
