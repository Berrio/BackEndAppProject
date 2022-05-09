package com.sofka.AppProject.dao;

import com.sofka.AppProject.dto.CategoryDTO;
import com.sofka.AppProject.dto.TaskDTO;
import com.sofka.AppProject.entity.Category;
import com.sofka.AppProject.entity.Task;
import com.sofka.AppProject.repository.CategoryRepository;
import com.sofka.AppProject.repository.TaskRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AppDAO implements AppDAOInterface {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CategoryDTO createCategory(Category category) {
        return convertEntityToDto(categoryRepository.save(category));
    }

    @Override
    public CategoryDTO createTask(Task task) {
        Category category = categoryRepository.findById(task.getFkTasktId()).get();
        category.addTask(task);
        return convertEntityToDto(categoryRepository.save(category));
    }

    @Override
    public TaskDTO updateTask(Task task) {
        return convertTaskEntityToDto(taskRepository.save(task));
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


    private CategoryDTO convertEntityToDto(Category category) {
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO = modelMapper.map(category, CategoryDTO.class);
        return categoryDTO;
    }


    private TaskDTO convertTaskEntityToDto(Task task) {
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        TaskDTO taskDTO = new TaskDTO();
        taskDTO = modelMapper.map(task, TaskDTO.class);
        return taskDTO;
    }



}
