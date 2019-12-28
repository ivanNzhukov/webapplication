package ru.spring.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.spring.boot.dao.forms.GoodsForm;
import ru.spring.boot.services.GoodsService;

@Controller
@RequestMapping(path = "/goods")
public class GoodsController {

    @Autowired
    private GoodsService service;

    @GetMapping(path = "")
    public String getAllGoods(Model model) {
        model.addAttribute("goods", service.findAll());
        model.addAttribute("form", new GoodsForm());
        return "goods";
    }

    @PostMapping("/add")
    public String addGoods(@ModelAttribute GoodsForm form) {
        service.saveFromForm(form);
        return "redirect:/goods";
    }

}
