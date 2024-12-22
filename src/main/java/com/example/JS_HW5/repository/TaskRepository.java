package com.example.JS_HW5.repository;
import com.example.JS_HW5.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{
    List<Task> findByAuthor(String author);
    List<Task> findByStatus(String status);
// добавить изменение статуса задачи
}
