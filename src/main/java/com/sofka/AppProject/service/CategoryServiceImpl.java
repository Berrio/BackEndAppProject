package com.sofka.AppProject.service;
import com.sofka.AppProject.dao.AppDAO;
import com.sofka.AppProject.dao.AppDAOInterface;
import org.modelmapper.ModelMapper;
import com.sofka.AppProject.dto.CategoryDTO;
import com.sofka.AppProject.entity.Category;
import com.sofka.AppProject.entity.Task;
import com.sofka.AppProject.repository.CategoryRepository;
import com.sofka.AppProject.repository.TaskRepository;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class CategoryServiceImpl implements AppDAOInterface {


    @Autowired
    private AppDAO appDAO;

    @Override
    public Category createCategory(Category category) {
        return appDAO.createCategory(category);
    }

    @Override
    public Category createTask(Task task) {

            return appDAO.createTask(task);
    }

    @Override
    public Category updateTask(Task task) {
        return appDAO.updateTask(task);
    }

    @Override
    public void deleteTask(Long id) {
        appDAO.deleteTask(id);
    }

    @Override
    public void deleteCategory(Long id) {
        appDAO.deleteTask(id);
    }

    @Override
    public List<CategoryDTO> findAllCategory() {
        return appDAO.findAllCategory();
    }

    @Override
    public Optional<Category> findCategoryById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Task> findTaskById(Long id) {
        return Optional.empty();
    }
}
