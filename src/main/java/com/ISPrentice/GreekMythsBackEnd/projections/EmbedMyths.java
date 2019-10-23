package com.ISPrentice.GreekMythsBackEnd.projections;

import com.ISPrentice.GreekMythsBackEnd.models.*;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedMyths", types = Myth.class)
public interface EmbedMyths {
    long getId();
    String getTitle();
    String getShortDescription();
    String getDescription();
    List<God> getGods();
    List<Titan> getTitans();
    List<Hero> getHeroes();
    List<Mortal> getMortal();
    List<Monster> getMonsters();
}
