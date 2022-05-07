package com.sofka.AppProject.entity;

import lombok.Data;


import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "Category")
@Table(name = "category")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String category;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    private List<Task> listTask = new ArrayList<>();

    public Category addTask(Task task) {

        this.listTask.add(task);
        return this;

    }
}
