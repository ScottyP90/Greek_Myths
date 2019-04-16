package com.ISPrentice.GreekMythsBackEnd.projections;

import com.ISPrentice.GreekMythsBackEnd.models.Myth;
import com.ISPrentice.GreekMythsBackEnd.models.Titan;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedTitan", types = Titan.class)
public interface EmbedTitan {
    long getId();
    String getTitanName();
    String getTitle();
    String getShortDescription();
    String getDescription();
    List<Myth> getMyths();
}
