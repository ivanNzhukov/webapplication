package ru.spring.boot.dao.dto;

import ru.spring.boot.dao.entities.Person;
import ru.spring.boot.dao.forms.PersonForm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class PersonDto {

    public static Person getPerson(Map<String, String> map) {

        Person person = new Person();
        person.setAge(Integer.parseInt(map.get("age")));
        person.setName(map.get("name"));
        person.setSurname(map.get("surname"));
        person.setEmail(map.get("email"));

        Date date = null;
        try {
            date = new SimpleDateFormat("dd.MM.yyyy").parse(map.get("birthDate")); // TODO обработать исключение и добавить другие форматы. А также в ВЕБ сделать проверку на то, что текущая дата более даты рождения минимум на 10 лет ( типо сами ведь дети в ресторан не придут
        } catch (ParseException e) {
            e.printStackTrace();
        }
        person.setBirthDate(date);
        person.setPhoneNumber(map.get("phoneNumber"));
        return person;
    }


    public static Person getPersonFromForm(PersonForm form) {
        Person person = new Person();
        person.setAge(form.getAge());
        person.setName(form.getName());
        person.setSurname(form.getSurname());
        person.setEmail(form.getEmail());
        person.setBirthDate(form.getBirthDate());
        person.setPhoneNumber(form.getPhoneNumber());
        return person;
    }
}
