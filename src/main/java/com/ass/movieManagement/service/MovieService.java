package com.ass.movieManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ass.movieManagement.entity.Movie;
import com.ass.movieManagement.repository.MovieRepository;

@Service
public class MovieService 
{
	@Autowired
	private MovieRepository repository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	private static final String TMDB_API_KEY = "089b8fb88d96db0da9ae37881b1cfe5f";
    private static final String TMDB_API_BASE_URL = "https://api.themoviedb.org/3";
    
    
    /**
     * Fetches movie details from an external API and stores them in the database.
     */
    
    public void fetchAndStoreMovieDetails() 
    {
    	String apiUrl = TMDB_API_BASE_URL + "/movie/11?api_key=" + TMDB_API_KEY;

        ResponseEntity<Movie> response = restTemplate.getForEntity(apiUrl, Movie.class);

        if (response.getStatusCode().is2xxSuccessful()) 
        {
            Movie movie = response.getBody();
            if (movie != null) {
                repository.save(movie);
            }
        }
    	

    	
    	
    	
        }
    	
    	
    
    
    
    
    
    
    
    
	

}
