package ru.spring.boot.dao.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.spring.boot.dao.entities.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Integer> {
}
