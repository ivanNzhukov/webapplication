package ru.spring.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.spring.boot.dao.forms.MenuForm;
import ru.spring.boot.services.MenuService;

@Controller
@RequestMapping(path = "/menus")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping(path = "")
    public String getAllMenu(Model model) {
        model.addAttribute("menus", menuService.findAll());
        model.addAttribute("form", new MenuForm());
        return "menus";
    }

    @GetMapping(path = "/{id}")
    public String getOneMenu(@PathVariable Integer id, Model model) {
        model.addAttribute("menu", menuService.getById(id));
        return "menu";
    }

    @PostMapping("")
    public String addMenu(@ModelAttribute MenuForm form, Model model) {
        menuService.saveNew(form);
        return "redirect:/" + getAllMenu(model);
    }
/*    @PostMapping("/")
    public String addMenu(@ModelAttribute MenuForm form, Model model) {
        menuService.saveAdditionalMenu(form);
        return "redirect:/" + getAllMenu(model);
    }*/

    @PutMapping("/")
    public String updateMenu(@ModelAttribute MenuForm form, Model model) {
        menuService.updateMenu(form);
        return "redirect:/" + getAllMenu(model);
    }
}
