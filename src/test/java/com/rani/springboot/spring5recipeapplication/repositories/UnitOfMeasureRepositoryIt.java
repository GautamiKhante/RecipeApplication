package com.rani.springboot.spring5recipeapplication.repositories;

import com.rani.springboot.spring5recipeapplication.domain.UnitOfMeasure;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
class UnitOfMeasureRepositoryIt {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;


    @BeforeEach
    public void setUp() throws Exception {


    }

    @Test
    void findByDescription() throws Exception {
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Tablespoon");
        assertEquals("Tablespoon", unitOfMeasure.get().getDescription());
    }
}