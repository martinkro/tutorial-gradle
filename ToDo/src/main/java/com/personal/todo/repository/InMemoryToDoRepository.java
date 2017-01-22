package com.personal.todo.repository;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.*;
import java.util.*;

import com.personal.todo.model.ToDoItem;

public class InMemoryToDoRepository implements ToDoRepository{
    private AtomicLong currentId = new AtomicLong();
    private ConcurrentMap<Long,ToDoItem> toDos = new ConcurrentHashMap<Long,ToDoItem>();
    
    public List<ToDoItem> findAll(){
        List<ToDoItem> toDoItems = new ArrayList<ToDoItem>(toDos.values());
        Collections.sort(toDoItems);
        return toDoItems;
    }
    
    public ToDoItem findById(Long id){
        return toDos.get(id);
    }
    
    public Long insert(ToDoItem item){
        Long id = currentId.incrementAndGet();
        item.setId(id);
        toDos.putIfAbsent(id, item);
        return id;
    }
    
    public void update(ToDoItem item){
        toDos.replace(item.getId(),item);
    }
    
    public void delete(ToDoItem item){
        toDos.remove(item.getId());
    }
}