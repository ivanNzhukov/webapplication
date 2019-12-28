package ru.spring.boot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.spring.boot.dao.dto.GoodsDto;
import ru.spring.boot.dao.entities.Goods;
import ru.spring.boot.dao.forms.GoodsForm;
import ru.spring.boot.dao.repositories.GoodsRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsService implements Services<Goods> {

    @Autowired
    private GoodsRepository goodsRepository;


    @Override
    public Iterable<Goods> findAll() {
        List<Goods> list = new ArrayList<>();
        for (Goods good : goodsRepository.findAll()) {
            list.add(good);
        }
        return list;
    }

    @Override
    public void save(Goods goods) {
        goodsRepository.save(goods);
    }

    @Override
    public Goods getById(Integer id) {
        return goodsRepository.findById(id).orElse(null);
    }

    public void saveFromForm(GoodsForm form) {
        Goods fromForm;
        Goods fromDB;
        if (form != null) {
            fromForm = GoodsDto.getGoodsFromForm(form);
            fromDB = goodsRepository.findByName(fromForm.getName());
            if (fromDB != null) {
                fromDB.setWeight(GoodsDto.sumWeight(fromDB, fromForm));
                save(fromDB);
            } else {
                save(fromForm);
            }
        }

    }
}
