package src.repositories;

import org.springframework.data.repository.CrudRepository;
import src.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
