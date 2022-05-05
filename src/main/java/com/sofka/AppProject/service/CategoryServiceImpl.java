package com.sofka.AppProject.service;

import com.sofka.AppProject.entity.Category;
import com.sofka.AppProject.entity.Task;
import com.sofka.AppProject.repository.CategoryRepository;
import com.sofka.AppProject.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{


    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);

    }

    @Override
    public Category createTask(Task task) {
            Category category= categoryRepository.findById(task.getFkTasktId()).get();
            category.addTask(task);
            return categoryRepository.save(category);
    }

    @Override
    public Category updateTask(Task task) {
        taskRepository.deleteById(task.getId());
        taskRepository.save(task);

            return  categoryRepository.findById(task.getId()).get();

    }

    @Override
    public void deleteTask(Task task) {
        taskRepository.deleteById(task.getId());
    }

    @Override
    public void deleteCategory(Category category) {
        categoryRepository.deleteById(category.getId());
    }

    @Override
    public List<Category> findAllCategory() {
        return categoryRepository.findAll();
    }
}
