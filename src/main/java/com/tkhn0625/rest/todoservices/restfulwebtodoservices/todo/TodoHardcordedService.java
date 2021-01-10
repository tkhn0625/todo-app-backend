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
}
