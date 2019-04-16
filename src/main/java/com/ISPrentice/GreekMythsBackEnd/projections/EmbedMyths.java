package com.ISPrentice.GreekMythsBackEnd.projections;

import com.ISPrentice.GreekMythsBackEnd.Interface.IHumans;
import com.ISPrentice.GreekMythsBackEnd.Interface.IImmortals;
import com.ISPrentice.GreekMythsBackEnd.models.Monster;
import com.ISPrentice.GreekMythsBackEnd.models.Myth;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedMyths", types = Myth.class)
public interface EmbedMyths {
    long getId();
    String getTitle();
    String getShortDescription();
    String getDescription();
    List<IImmortals> getImmortals();
    List<IHumans> getHumans();
    List<Monster> getMonsters();
}
