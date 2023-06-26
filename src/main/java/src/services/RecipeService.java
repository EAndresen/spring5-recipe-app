package src.services;


import src.domain.Recipe;

import java.util.Set;


public interface RecipeService {

    Set<Recipe> getRecipes();
}