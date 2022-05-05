package com.sofka.AppProject.repository;

import org.springframework.beans.factory.annotation.Autowired;

public class CategoryDAO<T> {

    @Autowired
    private CategoryRepository categoryRepository;

    public void nada(T nada){
        categoryRepository.findById(T);
    }
}

