package com.ISPrentice.GreekMythsBackEnd.controller;

import com.ISPrentice.GreekMythsBackEnd.models.Mortal;
import com.ISPrentice.GreekMythsBackEnd.repository.mortals.MortalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/mortals")
public class MortalController {

    @Autowired
    MortalRepository mortalRepository;

    @GetMapping
    public List<Mortal> getAllMortals(){
        return mortalRepository.findAll();
    }

}
