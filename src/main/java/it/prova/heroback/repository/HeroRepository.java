package it.prova.heroback.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import it.prova.heroback.HeroProjection;
import it.prova.heroback.model.Hero;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "hero", path = "hero", excerptProjection = HeroProjection.class)
public interface HeroRepository extends PagingAndSortingRepository<Hero, Long> {

	//List<Hero> findByNome(@Param("name") String name);
	
	//void delete(@Param("id") Long id);
	
}
