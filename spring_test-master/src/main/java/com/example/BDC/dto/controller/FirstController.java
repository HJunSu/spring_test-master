package com.example.BDC.dto.controller;

import com.example.BDC.dto.DataForm;
import com.example.BDC.service.foodservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class FirstController {
    @Autowired
    private foodservice food_service;

    @GetMapping("/hi")
    public String niceToMeetYou(Model model){
        List<DataForm> foodDtoList=food_service.getDataList();
        model.addAttribute("list",foodDtoList);
        return "greetings";
    }

    @GetMapping
    public String post() {
        return "greetings";
    }

    @PostMapping
    public String write(DataForm dataForm){
        food_service.savePost(dataForm);
        return "greetings";
    }

}
