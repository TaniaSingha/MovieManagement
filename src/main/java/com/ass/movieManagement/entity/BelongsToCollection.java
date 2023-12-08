package com.ass.movieManagement.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Belongs_To_Collection")
public class BelongsToCollection implements Serializable
{

	@Id
	@GenericGenerator(name="auto",strategy = "increment")
	@GeneratedValue(generator="auto")
    private Long collection_id;

   private Long id;
    private String name;
    private String poster_path;
    private String backdrop_path;
	
    
    
    public BelongsToCollection() {
		super();
		// TODO Auto-generated constructor stub
	}



	public BelongsToCollection(Long collection_id,  Long id, String name, String poster_Path, String backdrop_Path) {
		super();
		this.collection_id = collection_id;
		this.id=id;
		this.name = name;
		this.poster_path = poster_Path;
		this.backdrop_path = backdrop_Path;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}






	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPoster_Path() {
		return poster_path;
	}



	public void setPoster_Path(String posterPath) {
		this.poster_path = posterPath;
	}



	public String getBackdrop_Path() {
		return backdrop_path;
	}



	public void setBackdrop_Path(String backdropPath) {
		this.backdrop_path = backdropPath;
	}



	public Long getCollection_id() {
		return collection_id;
	}



	public void setCollection_id(Long collection_id) {
		this.collection_id = collection_id;
	}
    
    
    
    

	
}
