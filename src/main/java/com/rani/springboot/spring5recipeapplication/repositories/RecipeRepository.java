package com.rani.springboot.spring5recipeapplication.repositories;

import com.rani.springboot.spring5recipeapplication.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
