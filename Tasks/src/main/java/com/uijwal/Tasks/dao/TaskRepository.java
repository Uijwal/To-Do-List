package com.uijwal.Tasks.dao;

import com.uijwal.Tasks.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Integer> {

}
