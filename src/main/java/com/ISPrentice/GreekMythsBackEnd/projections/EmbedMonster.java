package com.ISPrentice.GreekMythsBackEnd.projections;

import com.ISPrentice.GreekMythsBackEnd.models.Monster;
import com.ISPrentice.GreekMythsBackEnd.models.Myth;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedMonster", types = Monster.class)
public interface EmbedMonster {
    long getId();
    String getMonsterName();
    String getShortDescription();
    String getDescription();
    List<Myth> getMyths();
}
