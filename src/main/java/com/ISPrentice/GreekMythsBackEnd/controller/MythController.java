package com.ISPrentice.GreekMythsBackEnd.controller;

import com.ISPrentice.GreekMythsBackEnd.models.Myth;
import com.ISPrentice.GreekMythsBackEnd.repository.myths.MythRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/myths")
public class MythController {

    @Autowired
    MythRepository mythRepository;

    @GetMapping
    public List<Myth> getAllMyths(){
        return mythRepository.findAll();
    }

}
