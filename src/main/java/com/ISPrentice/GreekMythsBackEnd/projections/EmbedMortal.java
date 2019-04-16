package com.ISPrentice.GreekMythsBackEnd.projections;

import com.ISPrentice.GreekMythsBackEnd.models.Mortal;
import com.ISPrentice.GreekMythsBackEnd.models.Myth;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedMortal", types = Mortal.class)
public interface EmbedMortal {
    long getId();
    String getMortalName();
    String getShortDescription();
    String getDescription();
    List<Myth> getMyths();
}
