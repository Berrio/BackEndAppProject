package com.sofka.AppProject.controller;

import com.sofka.AppProject.dao.AppDAOInterface;
import com.sofka.AppProject.dto.CategoryDTO;
import com.sofka.AppProject.entity.Category;
import com.sofka.AppProject.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class Controller {

    @Autowired
    private AppDAOInterface service;

    @GetMapping
    public List<CategoryDTO> getAllCategorys(){
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
    public void deleteCategory(@RequestBody Long id){
        service.deleteCategory(id);
    }

    @DeleteMapping("delete/task")
    public void deleteTask(@RequestBody Long id){
        service.deleteTask(id);
    }

}