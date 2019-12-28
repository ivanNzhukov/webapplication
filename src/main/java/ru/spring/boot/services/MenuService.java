package ru.spring.boot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.spring.boot.dao.dto.MenuDto;
import ru.spring.boot.dao.entities.Menu;
import ru.spring.boot.dao.forms.MenuForm;
import ru.spring.boot.dao.repositories.MenuRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;


    public Iterable<Menu> findAll() {
        List<Menu> list = new ArrayList<>();
        for (Menu menu : menuRepository.findAll()) {
            list.add(menu);
        }
        return list;
    }

    public void updateMenu(MenuForm form) {
        if (form != null) {
            menuRepository.save(MenuDto.getMenuFromForm(form));
        }
    }

    public void saveAdditionalMenu(MenuForm form) {
        Menu fromForm;
        Menu fromDB;
        if (form != null) {
            fromForm = MenuDto.getMenuFromForm(form);
            fromDB = getById(fromForm.getId());
            if (fromDB == null) {
                menuRepository.save(fromForm);
            } else {
                Date first = fromForm.getDateUntil();
                Date second = MenuDto.getMaxDate();
                if (first.getTime() < second.getTime()) {
                    fromDB.setDateUntil(fromForm.getDateSince());
                    fromDB.setDateUntil(second);
                } else {
                    fromDB.setDateSince(fromForm.getDateUntil());

                }
            }
        }

    }

    public void saveNew(MenuForm form) {
        if (form != null) {
            menuRepository.save(MenuDto.getMenuFromForm(form));
        }
    }

    public Menu getById(Integer id) {
        return menuRepository.findById(id).orElse(null);
    }
}
