package com.ass.movieManagement.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Movie_Details")
public class Movie implements Serializable
{
	  @Id
	  @GenericGenerator(name="auto",strategy = "increment")
		@GeneratedValue(generator="auto")
	    private Long id;
	    private boolean adult;
	    private String backdrop_path;
		
	    
	    @ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "collection_id")
	    private BelongsToCollection belongs_to_collection;

	    private long budget;

	    @ManyToMany(cascade = CascadeType.ALL)
	    @JoinColumn(name = "genre_id")
	    private List<Genre> genres;

	    private String homepage;
	   

	   @Column(name = "imdb_id", unique = true) 
	    private String imdb_id;

	    private String original_language;
	    private String original_title;
	    private String overview;
	    private double popularity;
	    private String poster_path;

	    @ManyToMany(cascade = CascadeType.ALL)
	   @JoinColumn(name = "Production_company_id")
	    private List<ProductionCompany> production_companies;

	    @ManyToMany(cascade = CascadeType.ALL)
	   @JoinColumn(name = "id")
	    private List<ProductionCountry> production_countries;

	    private String release_date;
	    private long revenue;
	    private int runtime;

	    @ManyToMany(cascade = CascadeType.ALL)
	    @JoinColumn(name = "language_id")
	    private List<SpokenLanguage> spoken_languages;

	    private String status;
	    private String tagline;
	    private String title;
	    private boolean video;
	    private double vote_average;
	    private int vote_count;

	    
   
	    public Movie() {
			super();
			// TODO Auto-generated constructor stub
		}



   public Movie(Long id, boolean adult, String backdrop_path, BelongsToCollection belongs_to_collection, long budget,
				List<Genre> genres, String homepage,  String imdbId, String originalLanguage,
				String originalTitle, String overview, double popularity, String posterPath,
				List<ProductionCompany> productionCompanies, List<ProductionCountry> productionCountries,
				String releaseDate, long revenue, int runtime, List<SpokenLanguage> spokenLanguages, String status,
				String tagline, String title, boolean video, double voteAverage, int voteCount) 
   
   {
			super();
			this.id = id;
			this.adult = adult;
			this.backdrop_path = backdrop_path;
			this.belongs_to_collection = belongs_to_collection;
			this.budget = budget;
			this.genres = genres;
			this.homepage = homepage;
			
			this.imdb_id = imdbId;
			this.original_language = originalLanguage;
			this.original_title = originalTitle;
			this.overview = overview;
			this.popularity = popularity;
			this.poster_path = posterPath;
			this.production_companies = productionCompanies;
			this.production_countries = productionCountries;
			this.release_date = releaseDate;
			this.revenue = revenue;
			this.runtime = runtime;
			this.spoken_languages = spokenLanguages;
			this.status = status;
			this.tagline = tagline;
			this.title = title;
			this.video = video;
			this.vote_average = voteAverage;
			this.vote_count = voteCount;
		}



public Long getId() {
	return id;
}



public void setId(Long id) {
	this.id = id;
}



public boolean isAdult() {
	return adult;
}



public void setAdult(boolean adult) {
	this.adult = adult;
}



public String getBackdropPath() {
	return backdrop_path;
}



public void setBackdropPath(String backdrop_path) {
	this.backdrop_path = backdrop_path;
}



public BelongsToCollection getBelongsToCollection() {
	return belongs_to_collection;
}



public void setBelongsToCollection(BelongsToCollection belongsToCollection) {
	this.belongs_to_collection = belongsToCollection;
}



public long getBudget() {
	return budget;
}



public void setBudget(long budget) {
	this.budget = budget;
}



public List<Genre> getGenres() {
	return genres;
}



public void setGenres(List<Genre> genres) {
	this.genres = genres;
}



public String getHomepage() {
	return homepage;
}



public void setHomepage(String homepage) {
	this.homepage = homepage;
}





public String getImdbId() {
	return imdb_id;
}



public void setImdbId(String imdbId) {
	this.imdb_id = imdbId;
}



public String getOriginalLanguage() {
	return original_language;
}



public void setOriginalLanguage(String originalLanguage) {
	this.original_language = originalLanguage;
}



public String getOriginalTitle() {
	return original_title;
}



public void setOriginalTitle(String originalTitle) {
	this.original_title = originalTitle;
}



public String getOverview() {
	return overview;
}



public void setOverview(String overview) {
	this.overview = overview;
}



public double getPopularity() {
	return popularity;
}



public void setPopularity(double popularity) {
	this.popularity = popularity;
}



public String getPosterPath() {
	return poster_path;
}



public void setPosterPath(String posterPath) {
	this.poster_path = posterPath;
}



public List<ProductionCompany> getProductionCompanies() {
	return production_companies;
}



public void setProductionCompanies(List<ProductionCompany> productionCompanies) {
	this.production_companies = productionCompanies;
}



public List<ProductionCountry> getProductionCountries() {
	return production_countries;
}



public void setProductionCountries(List<ProductionCountry> productionCountries) {
	this.production_countries = productionCountries;
}



public String getReleaseDate() {
	return release_date;
}



public void setReleaseDate(String releaseDate) {
	this.release_date = releaseDate;
}



public long getRevenue() {
	return revenue;
}



public void setRevenue(long revenue) {
	this.revenue = revenue;
}



public int getRuntime() {
	return runtime;
}



public void setRuntime(int runtime) {
	this.runtime = runtime;
}



public List<SpokenLanguage> getSpokenLanguages() {
	return spoken_languages;
}



public void setSpokenLanguages(List<SpokenLanguage> spokenLanguages) {
	this.spoken_languages = spokenLanguages;
}



public String getStatus() {
	return status;
}



public void setStatus(String status) {
	this.status = status;
}



public String getTagline() {
	return tagline;
}



public void setTagline(String tagline) {
	this.tagline = tagline;
}



public String getTitle() {
	return title;
}



public void setTitle(String title) {
	this.title = title;
}



public boolean isVideo() {
	return video;
}



public void setVideo(boolean video) {
	this.video = video;
}



public double getVoteAverage() {
	return vote_average;
}



public void setVoteAverage(double voteAverage) {
	this.vote_average = voteAverage;
}



public int getVoteCount() {
	return vote_count;
}



public void setVoteCount(int voteCount) {
	this.vote_count = voteCount;
}



		
	    
	    
	    
	    

}
