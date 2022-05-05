package com.sofka.AppProject.controller;

import com.sofka.AppProject.entity.Category;
import com.sofka.AppProject.entity.Task;
import com.sofka.AppProject.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class Controller {

    @Autowired
    private CategoryService service;

    @GetMapping
    public List<Category> getAllCategorys(){
        return service.findAllCategory();
    }

    @PostMapping("create/category")
    public Category createCategory(@RequestBody Category category){
        return service.createCategory(category);
    }

    @PostMapping("create/task")
    public Category createTask(@RequestBody Task task){
        return service.createTask(task);
    }

    @PutMapping("update/task")
    public Category updateTask(@RequestBody Task task){
        return service.updateTask(task);
    }

    @DeleteMapping("delete/category")
    public void deleteCategory(@RequestBody Category category){
        service.deleteCategory(category);
    }

    @DeleteMapping("delete/task")
    public void deleteTask(@RequestBody Task task){
        service.deleteTask(task);
    }

}