package com.ISPrentice.GreekMythsBackEnd.repository.gods;

import com.ISPrentice.GreekMythsBackEnd.models.God;
import com.ISPrentice.GreekMythsBackEnd.projections.EmbedGod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedGod.class)
public interface GodRepository extends JpaRepository<God, Long> {
}
