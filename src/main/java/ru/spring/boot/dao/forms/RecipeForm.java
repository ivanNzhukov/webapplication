package ru.spring.boot.dao.forms;

import ru.spring.boot.dao.entities.Goods;

import java.util.List;

public class RecipeForm {
    private String name;
    private List<Goods> goods;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }
}
