package com.tkhn0625.rest.todoservices.restfulwebtodoservices;

import com.tkhn0625.rest.todoservices.restfulwebtodoservices.todo.Todo;
import com.tkhn0625.rest.todoservices.restfulwebtodoservices.todo.TodoHardcordedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TodoResource {

    @Autowired
    private TodoHardcordedService todoService;

    @GetMapping("/users/{username}/todos")
    public List<Todo> getAllTodos(@PathVariable String username){
        return todoService.findAll();
    }
}
