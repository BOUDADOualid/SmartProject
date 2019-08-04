package com.smart.mvc.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Emplacement  implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	
	private String Description;
	
	@OneToMany(mappedBy="empl")
	private List<Apparreil> apparreils;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
    
	
	
	public List<Apparreil> getApparreils() {
		return apparreils;
	}

	public void setApparreils(List<Apparreil> apparreils) {
		this.apparreils = apparreils;
	}
	
	
	
	
	
}
