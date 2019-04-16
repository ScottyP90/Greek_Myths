package com.ISPrentice.GreekMythsBackEnd.controller;

import com.ISPrentice.GreekMythsBackEnd.models.God;
import com.ISPrentice.GreekMythsBackEnd.repository.gods.GodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/gods")
public class GodController {

    @Autowired
    GodRepository godRepository;

    @GetMapping
    public List<God> getAllGods(){
        return godRepository.findAll();
    }

}
