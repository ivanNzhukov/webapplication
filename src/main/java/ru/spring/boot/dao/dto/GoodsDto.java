package ru.spring.boot.dao.dto;

import ru.spring.boot.dao.entities.Goods;
import ru.spring.boot.dao.forms.GoodsForm;

import java.util.Map;

public class GoodsDto {


    public static Goods getGoods(Map<String, String> map) {

        Goods goods = new Goods();
        goods.setName(map.get("name"));
        goods.setWeight(Double.parseDouble(map.get("weight")));
        return goods;
    }

    public static Goods getGoodsFromForm(GoodsForm form) {

        Goods goods = new Goods();
        goods.setName(form.getName());
        goods.setWeight(form.getWeight());
        return goods;
    }

    public static Double sumWeight(Goods first, Goods second) {
        return first.getWeight() + second.getWeight();
    }
}
