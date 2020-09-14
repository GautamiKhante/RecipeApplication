package com.rani.springboot.spring5recipeapplication.repositories;

import com.rani.springboot.spring5recipeapplication.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {


    Optional<Category> findByDescription(String description);
}
