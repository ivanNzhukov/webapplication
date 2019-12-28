package ru.spring.boot.dao.dto;

import ru.spring.boot.dao.entities.Recipe;
import ru.spring.boot.dao.forms.RecipeForm;

public class RecipeDto {

    public static Recipe getRecipeFromForm(RecipeForm form) {
        Recipe recipe = new Recipe();
        recipe.getGoods().addAll(form.getGoods());
        recipe.setName(form.getName());
        return recipe;
    }
}
