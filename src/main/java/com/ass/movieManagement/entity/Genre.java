package com.ass.movieManagement.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Genre")
public class Genre implements Serializable
{
	
	@Id
	 @GenericGenerator(name="auto",strategy = "increment")
	@GeneratedValue(generator="auto")
    private Long genre_id;

	 private Integer id;
	
    private String name;

	public Genre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Genre(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    
    
    


}
