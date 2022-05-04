package com.sofka.AppProject.repository;

import com.sofka.AppProject.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
