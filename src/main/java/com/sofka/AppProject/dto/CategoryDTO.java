package com.sofka.AppProject.dto;

import com.sofka.AppProject.entity.Task;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CategoryDTO {

    private Long id;
    private String category;
    private List<Task> listTask = new ArrayList<>();
}
