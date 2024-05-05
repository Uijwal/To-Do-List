package com.uijwal.Tasks.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "ToDo")
public class Task {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String title = "";


    @Column(nullable = false)
    private LocalDateTime createdTime = LocalDateTime.now();


    @Column
    private boolean done;

    @PrePersist
    protected void onCreate() {
        createdTime = LocalDateTime.now();
    }

    public Task() {
    }

    public Task(int id, String title, LocalDateTime createdTime, boolean done) {
        this.id = id;
        this.title = title;
        this.createdTime = createdTime;
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }


}

