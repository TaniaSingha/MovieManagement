package com.ass.movieManagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Production_Country")
public class ProductionCountry 
{
	@Id
	 @GenericGenerator(name="auto",strategy = "increment")
	@GeneratedValue(generator="auto")
    private Long id;

    private String iso_3166_1;
    private String name;
	
    
    
    
    public ProductionCountry() {
		super();
		// TODO Auto-generated constructor stub
	}




	public ProductionCountry(Long id, String iso31661, String name) {
		super();
		this.id = id;
		this.iso_3166_1 = iso31661;
		this.name = name;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getIso31661() {
		return iso_3166_1;
	}




	public void setIso31661(String iso31661) {
		this.iso_3166_1 = iso31661;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}
    
    
    
    
    
   
	

}
