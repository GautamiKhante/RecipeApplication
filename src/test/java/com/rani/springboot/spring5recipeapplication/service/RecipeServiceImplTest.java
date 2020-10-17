package com.rani.springboot.spring5recipeapplication.service;

import com.rani.springboot.spring5recipeapplication.domain.Recipe;
import com.rani.springboot.spring5recipeapplication.repositories.RecipeRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class RecipeServiceImplTest {

    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @BeforeEach
    public void setup() throws Exception{
        MockitoAnnotations.initMocks(this);
        recipeService =new RecipeServiceImpl(recipeRepository);
    }
    @Test
    public void getRecipes() throws Exception{
        Recipe recipe = new Recipe();
        HashSet recipeData = new HashSet();
        recipeData.add(recipe);

        Mockito.when(recipeRepository.findAll()).thenReturn(recipeData);

        Set<Recipe> recipes = recipeService.getRecipes();
        assertEquals(recipes.size(), 1);
        Mockito.verify(recipeRepository, Mockito.times(1)).findAll();
    }

}