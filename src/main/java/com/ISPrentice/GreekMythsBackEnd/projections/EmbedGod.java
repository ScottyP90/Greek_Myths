package com.ISPrentice.GreekMythsBackEnd.projections;

import com.ISPrentice.GreekMythsBackEnd.models.God;
import com.ISPrentice.GreekMythsBackEnd.models.Myth;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedGod", types = God.class)
public interface EmbedGod {
    long getId();
    String getGodName();
    String getTitle();
    String getDomain();
    String getShortDescription();
    String getDescription();
    List<Myth> getMyths();
}
