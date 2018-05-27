package myspring.springframework.cookapp.repositories;

import myspring.springframework.cookapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
