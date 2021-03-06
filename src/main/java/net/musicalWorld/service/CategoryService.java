package net.musicalWorld.service;

import net.musicalWorld.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getAll();

    Category findById(int id);

    void add(Category category);
}