package com.ISPrentice.GreekMythsBackEnd.repository.myths;

import com.ISPrentice.GreekMythsBackEnd.models.Myth;
import com.ISPrentice.GreekMythsBackEnd.projections.EmbedMyths;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedMyths.class)
public interface MythRepository extends JpaRepository<Myth, Long> {
}
