package com.ISPrentice.GreekMythsBackEnd.controller;

import com.ISPrentice.GreekMythsBackEnd.models.Hero;
import com.ISPrentice.GreekMythsBackEnd.repository.heroes.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/heroes")
public class HeroController {

    @Autowired
    HeroRepository heroRepository;

    @GetMapping
    public List<Hero> getAllHeroes(){
        return heroRepository.findAll();
    }

}
