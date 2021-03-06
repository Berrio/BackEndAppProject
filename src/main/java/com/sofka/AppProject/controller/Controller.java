package com.sofka.AppProject.controller;

import com.sofka.AppProject.dao.AppDAOInterface;
import com.sofka.AppProject.dto.CategoryDTO;
import com.sofka.AppProject.dto.TaskDTO;
import com.sofka.AppProject.entity.Category;
import com.sofka.AppProject.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/")
@CrossOrigin(origins = "http://localhost:3000/")
public class Controller {

    @Autowired
    private AppDAOInterface service;

    @GetMapping
    public List<CategoryDTO> getAllCategorys() {
        return service.findAllCategory();
    }


    @PostMapping("create/category")
    public CategoryDTO createCategory(@RequestBody Category category) {
        return service.createCategory(category);
    }

    @PostMapping("create/task")
    public CategoryDTO createTask(@RequestBody Task task) {
        return service.createTask(task);
    }

    @PutMapping("update/task")
    public TaskDTO updateTask(@RequestBody Task task) {
        return service.updateTask(task);
    }

    @DeleteMapping("delete/category/{id}")
    public void deleteCategory(@PathVariable Long id) {
        service.deleteCategory(id);
    }

    @DeleteMapping("delete/task/{id}")
    public void deleteTask(@PathVariable Long id) {
        service.deleteTask(id);
    }

}