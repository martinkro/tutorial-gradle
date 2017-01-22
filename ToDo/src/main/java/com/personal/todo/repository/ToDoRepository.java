package com.personal.todo.repository;

import com.personal.todo.model.ToDoItem;
import java.util.Collection;
import java.util.*;

public interface ToDoRepository{
    List<ToDoItem> findAll();
    ToDoItem findById(Long id);
    Long insert(ToDoItem item);
    void update(ToDoItem item);
    void delete(ToDoItem item);
}