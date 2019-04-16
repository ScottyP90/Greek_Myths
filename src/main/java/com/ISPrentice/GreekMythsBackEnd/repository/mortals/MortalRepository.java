package com.ISPrentice.GreekMythsBackEnd.repository.mortals;

import com.ISPrentice.GreekMythsBackEnd.models.Mortal;
import com.ISPrentice.GreekMythsBackEnd.projections.EmbedMortal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedMortal.class)
public interface MortalRepository extends JpaRepository<Mortal, Long> {
}
