package com.uijwal.Tasks.service;

import com.uijwal.Tasks.dao.TaskRepository;
import com.uijwal.Tasks.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task addTask(Task task) {
        return taskRepository.save(task);
    }

    public Optional<Task> findById(int id) {
        return taskRepository.findById(id);
    }

    public void deleteById(int id) {
        taskRepository.deleteById(id);
    }

    public Iterable<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }


    public Optional<Task> getTaskById(int id) {
        return taskRepository.findById(id);
    }
}
