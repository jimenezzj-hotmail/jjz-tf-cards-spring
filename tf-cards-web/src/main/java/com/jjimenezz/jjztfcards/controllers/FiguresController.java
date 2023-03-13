package com.jjimenezz.jjztfcards.controllers;

import com.jjimenezz.jjztfcards.services.IFigureService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = {"/figures"})
public class FiguresController {

    private final IFigureService figuresService;

    public FiguresController(IFigureService figuresService) {
        this.figuresService = figuresService;
    }

    @RequestMapping(path = {"/list", "", "/"})
    public String getFiguresList(Model model) {
        var figures = this.figuresService.getAll();
        model.addAttribute("figures", figures);
        System.out.println("-----> /figures/list " + figures);
        return "figures/list";
    }

}
