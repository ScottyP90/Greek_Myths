package com.ISPrentice.GreekMythsBackEnd.repository.titans;

import com.ISPrentice.GreekMythsBackEnd.models.Titan;
import com.ISPrentice.GreekMythsBackEnd.projections.EmbedTitan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedTitan.class)
public interface TitanRepository extends JpaRepository<Titan, Long> {
}
