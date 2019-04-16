package com.ISPrentice.GreekMythsBackEnd.repository.heroes;

import com.ISPrentice.GreekMythsBackEnd.models.Hero;
import com.ISPrentice.GreekMythsBackEnd.projections.EmbedHero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedHero.class)
public interface HeroRepository extends JpaRepository<Hero, Long> {
}
