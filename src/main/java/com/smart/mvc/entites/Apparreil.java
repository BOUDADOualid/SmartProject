package com.smart.mvc.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;




@Entity
public class Apparreil implements Serializable {
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private int numberOfPins;
    
	
	@ManyToOne()
	@JoinColumn(name ="id_emplacement")
	private Emplacement empl;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfPins() {
		return numberOfPins;
	}

	public void setNumberOfPins(int numberOfPins) {
		this.numberOfPins = numberOfPins;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
  

}
