package com.ISPrentice.GreekMythsBackEnd.repository.monsters;

import com.ISPrentice.GreekMythsBackEnd.models.Monster;
import com.ISPrentice.GreekMythsBackEnd.projections.EmbedMonster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedMonster.class)
public interface MonsterRepository extends JpaRepository<Monster, Long> {
}
