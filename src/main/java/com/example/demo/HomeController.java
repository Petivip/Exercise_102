package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public  String myPage(Model model){
        model.addAttribute("firvar","This is the first variable");
        model.addAttribute("secvar","This is the second variable");
        return "twoVarTemplate";
    }
}
