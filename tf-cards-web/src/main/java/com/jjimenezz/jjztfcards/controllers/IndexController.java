package com.jjimenezz.jjztfcards.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class IndexController {

    public String getIdx(Model model) {
        List<Integer> prices = List.of(100, 200, 75, 45);
        model.addAttribute("prices", prices);
        return "index";
    }

}
