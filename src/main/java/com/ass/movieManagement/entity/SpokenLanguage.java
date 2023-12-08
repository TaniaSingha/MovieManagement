package com.ass.movieManagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Spoken_Language")
public class SpokenLanguage 
{
	@Id
	@GenericGenerator(name="auto",strategy = "increment")
	@GeneratedValue(generator="auto")

    private Long language_id;

    private String english_name;
    private String iso_639_1;
    private String name;
	
    
    
    public SpokenLanguage(Long id, String englishName, String iso6391, String name) {
		super();
		this.language_id = id;
		this.english_name = englishName;
		this.iso_639_1 = iso6391;
		this.name = name;
	}



	public SpokenLanguage() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Long getId() {
		return language_id;
	}



	public void setId(Long id) {
		this.language_id = id;
	}



	public String getEnglishName() {
		return english_name;
	}



	public void setEnglishName(String englishName) {
		this.english_name = englishName;
	}



	public String getIso6391() {
		return iso_639_1;
	}



	public void setIso6391(String iso6391) {
		this.iso_639_1 = iso6391;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
    
    
    
    
    
    

}
