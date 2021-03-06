package com.sofka.AppProject.dao;

import com.sofka.AppProject.dto.CategoryDTO;
import com.sofka.AppProject.dto.TaskDTO;
import com.sofka.AppProject.entity.Category;
import com.sofka.AppProject.entity.Task;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface AppDAOInterface {
    List<CategoryDTO> findAllCategory();

    CategoryDTO createCategory(Category category);

    CategoryDTO createTask(Task task);

    TaskDTO updateTask(Task task);

    void deleteTask(Long id);

    void deleteCategory(Long id);



}
