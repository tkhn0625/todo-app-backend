package com.tkhn0625.rest.todoservices.restfulwebtodoservices;

import com.tkhn0625.rest.todoservices.restfulwebtodoservices.todo.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoJpaRepository extends JpaRepository<Todo,Long> {
    List<Todo> findByUsername(String username);
}
