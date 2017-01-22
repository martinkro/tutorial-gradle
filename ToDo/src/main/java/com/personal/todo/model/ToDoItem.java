package com.personal.todo.model;

public class ToDoItem implements Comparable<ToDoItem>{
    private Long id;
    private String name;
    private boolean completed;
    
    public void setId(Long id){
        this.id = id;
    }
    
    public Long getId(){
        return id;
    }
    
    public int compareTo(ToDoItem item){
        if (item.id == this.id) return 0;
        if (item.id > this.id) return -1;
        if (item.id < this.id) return 1;
        return 1;
    }
}