package com.tkhn0625.rest.todoservices.restfulwebtodoservices.todo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
    private long id;
    private String username;
    private String description;
    private Date tergetDate;
    private boolean isDone;
}
