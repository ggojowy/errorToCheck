package com.example.springhttp2;

import com.example.springhttp2.domain.service.CVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cv")
public class CVController {


    @Autowired
    private CVService service;

    @GetMapping
    public  String get(Model model){
    model.addAttribute("cv",service.getCv());
    return "get-cv";

}
}
