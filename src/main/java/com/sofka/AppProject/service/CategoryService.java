package com.sofka.AppProject.service;

import com.sofka.AppProject.dto.CategoryDTO;
import com.sofka.AppProject.entity.Category;
import com.sofka.AppProject.entity.Task;


import java.util.List;

public interface CategoryService {

    Category createCategory(Category category);

    Category createTask(Task task);

    Category updateTask(Task task);

    void deleteTask(Task task);

    void deleteCategory(Category category);

    List<CategoryDTO> findAllCategory();
}
