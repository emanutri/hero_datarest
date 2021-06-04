package it.prova.heroback;

import org.springframework.data.rest.core.config.Projection;

import it.prova.heroback.model.Hero;

@Projection(name = "hero", types = Hero.class)
public interface HeroProjection {
	
	Long getId();
	
	String getName();
	 
}
