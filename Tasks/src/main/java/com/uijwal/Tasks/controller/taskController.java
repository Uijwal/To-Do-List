package com.uijwal.Tasks.controller;

import com.uijwal.Tasks.model.Task;
import com.uijwal.Tasks.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(value = "/tasks")
public class taskController {

    private final TaskService taskService;

    @Autowired
    public taskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public String showAllTasks(Model model) {
        model.addAttribute("tasks", taskService.getAllTasks());
        return "task_all";
    }

    @PostMapping("/delete/{id}")
    public String deleteTask(@PathVariable int id) {
        taskService.deleteById(id);
        return "redirect:/tasks";
    }

    @PostMapping("/add")
    public String addTask(@ModelAttribute Task task) {
        taskService.addTask(task);
        return "redirect:/tasks";
    }

    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable int id, Model model) {
        Optional<Task> taskOptional = taskService.findById(id);
        if (taskOptional.isPresent()) {
            Task task = taskOptional.get();
            model.addAttribute("task", task);
            return "update_task";
        } else {
            // Handle task not found
            return "redirect:/tasks";
        }
    }

    @PostMapping("/update")
    public String updateTask(@ModelAttribute Task task) {
        taskService.updateTask(task);
        return "redirect:/tasks";
    }
}
