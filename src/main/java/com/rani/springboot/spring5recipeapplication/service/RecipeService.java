package com.rani.springboot.spring5recipeapplication.service;

import com.rani.springboot.spring5recipeapplication.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
