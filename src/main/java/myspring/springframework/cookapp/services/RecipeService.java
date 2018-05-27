package myspring.springframework.cookapp.services;


import myspring.springframework.cookapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
