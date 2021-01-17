package com.tkhn0625.rest.todoservices.restfulwebtodoservices.todo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoHardcordedService {

    private static List<Todo> todos = new ArrayList<>();
    private static int idCounter = 0;

    static {
        todos.add(new Todo(++idCounter,"tkhn0625","description of tkhn0625", new Date() ,false));
        todos.add(new Todo(++idCounter,"ryo1029","description of ryo1029", new Date() ,false));
        todos.add(new Todo(++idCounter,"hnfs0718","description of hnfs0718", new Date() ,false));
    }

    public List<Todo> findAll(){
        return todos;
    }
    public Todo save(Todo todo) {
        if(todo.getId()==-1 || todo.getId()==0){
            todo.setId(++idCounter);
            todos.add(todo);
        }else {
            deleteById(todo.getId());
            todos.add(todo);
        }
        return null;
    }

    public Todo deleteById(long id) {
        Todo todo = findById(id);
        if(todo==null) return null;
        if(todos.remove(todo)) return todo;
        return null;
    }

    public Todo findById(long id) {
        for(Todo todo:todos){
            if(todo.getId()==id){
                return todo;
            }
        }
        return null;
    }
}
