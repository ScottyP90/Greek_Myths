package com.ISPrentice.GreekMythsBackEnd.projections;

import com.ISPrentice.GreekMythsBackEnd.models.Hero;
import com.ISPrentice.GreekMythsBackEnd.models.Myth;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedHero", types = Hero.class)
public interface EmbedHero {
    long getId();
    String getHeroName();
    String getShortDescription();
    String getDescription();
    List<Myth> getMyths();
}
