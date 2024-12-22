package com.example.JS_HW5.service;
import com.example.JS_HW5.entity.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    Task createTask(Task task);
    List<Task> findAllTask();
    Optional<Task> findTaskById(Long id);
    Task updateTask(Long id, Task task);
    void deleteTask(Long id);
    List<Task> findByAuthor(String author);
    List<Task> findByStatus(String status);
}
