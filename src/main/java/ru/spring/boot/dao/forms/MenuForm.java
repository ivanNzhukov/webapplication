package ru.spring.boot.dao.forms;

import org.springframework.format.annotation.DateTimeFormat;
import ru.spring.boot.dao.entities.Recipe;

import java.util.Date;
import java.util.List;

public class MenuForm {

    private Integer id;
    private String name;
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private Date date;
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private Date dateSince;
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private Date dateUntil;
    private List<Recipe> recipes;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDateSince() {
        return dateSince;
    }

    public void setDateSince(Date dateSince) {
        this.dateSince = dateSince;
    }

    public Date getDateUntil() {
        return dateUntil;
    }

    public void setDateUntil(Date dateUntil) {
        this.dateUntil = dateUntil;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
