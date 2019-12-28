package ru.spring.boot.dao.dto;

import ru.spring.boot.dao.entities.Menu;
import ru.spring.boot.dao.forms.MenuForm;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MenuDto {

    public static Menu getMenuFromForm(MenuForm form) {
        Menu menu = new Menu();
        menu.getRecipes().addAll(form.getRecipes());
        menu.setDate(new Date(System.currentTimeMillis()));
        menu.setDateSince(form.getDateSince());
        if (form.getDateUntil() == null) {
            menu.setDateUntil(MenuDto.getMaxDate());
        } else {
            menu.setDateUntil(form.getDateUntil());
        }
        menu.setName(form.getName());
        menu.setId(form.getId());
        return menu;
    }

    public static Date getMaxDate() {

        GregorianCalendar cal = new GregorianCalendar();
        cal.getMaximum(Calendar.YEAR);
        return cal.getTime();
    }
}
