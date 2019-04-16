package com.ISPrentice.GreekMythsBackEnd.controller;

import com.ISPrentice.GreekMythsBackEnd.models.Titan;
import com.ISPrentice.GreekMythsBackEnd.repository.titans.TitanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/titans")
public class TitanController {

    @Autowired
    TitanRepository titanRepository;

    @GetMapping
    public List<Titan> getAllTitans(){
        return titanRepository.findAll();
    }

}
