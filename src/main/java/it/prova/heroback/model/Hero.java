package it.prova.heroback.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hero")
public class Hero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "name")
	private String name;

//	@Column(name = "potere")
//	private String potere;
//	
//	@Column(name = "forza")
//	private Integer forza;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

//	public String getPotere() {
//		return potere;
//	}
//
//	public void setPotere(String potere) {
//		this.potere = potere;
//	}
//
//	public Integer getForza() {
//		return forza;
//	}
//
//	public void setForza(Integer forza) {
//		this.forza = forza;
//	}
	
	

}
