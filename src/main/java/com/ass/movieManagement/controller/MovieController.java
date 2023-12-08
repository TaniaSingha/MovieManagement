package com.ass.movieManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ass.movieManagement.service.MovieService;

/**
 * Handles HTTP requests related to movie management.
 * @author Tania Singha
 */

@RestController
public class MovieController 
{
	@Autowired
	private MovieService service;
	
	
	/**
     * Endpoint to fetch movie details from TMDB and store movie details into MySql DB.
     *
     * @return returns a response entity indicating the success of fetching and storing movie details.
     */
	@PostMapping("/fetch-and-store")
    public ResponseEntity<String> fetchAndStoreMovieDetails() 
	
	{
        service.fetchAndStoreMovieDetails();
        return ResponseEntity.ok("Movie details fetched and stored successfully");
    }

}
