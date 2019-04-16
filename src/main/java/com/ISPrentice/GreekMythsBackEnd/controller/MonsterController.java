package com.ISPrentice.GreekMythsBackEnd.controller;

import com.ISPrentice.GreekMythsBackEnd.models.Monster;
import com.ISPrentice.GreekMythsBackEnd.repository.monsters.MonsterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/monsters")
public class MonsterController {

    @Autowired
    MonsterRepository monsterRepository;

    @GetMapping
    public List<Monster> getAllMonsters(){
        return monsterRepository.findAll();
    }

}
