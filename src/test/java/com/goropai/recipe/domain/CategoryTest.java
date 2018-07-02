package com.goropai.recipe.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryTest {
    Category category;
    Long idValue = 4L;
    String descriptionValue = "Test description";

    @Before
    public void setUp() {
        category = new Category();
        category.setId(idValue);
        category.setDescription(descriptionValue);
    }

    @Test
    public void getId() {
        assertEquals(idValue, category.getId());
    }

    @Test
    public void getDescription() {
        assertEquals(descriptionValue, category.getDescription());
    }

    @Test
    public void getRecipes() {
    }
}