package com.sofka.AppProject.dao;

import com.sofka.AppProject.dto.CategoryDTO;
import com.sofka.AppProject.entity.Category;
import com.sofka.AppProject.entity.Task;
import com.sofka.AppProject.repository.CategoryRepository;
import com.sofka.AppProject.repository.TaskRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AppDAO implements AppDAOInterface{

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private  ModelMapper modelMapper;

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
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public List<CategoryDTO> findAllCategory() {
        return categoryRepository.findAll().stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Category> findCategoryById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public Optional<Task> findTaskById(Long id) {
        return taskRepository.findById(id);
    }

    private CategoryDTO convertEntityToDto(Category category){
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO = modelMapper.map(category, CategoryDTO.class);
        return categoryDTO;
    }

    private Category convertDtoToEntity(CategoryDTO categoryDTO){
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        Category category = new Category();
        category = modelMapper.map(categoryDTO, Category.class);
        return category;
    }
}
