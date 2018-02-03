package com.gulsah.moviedb.movierecommendationcore.controller;

import com.gulsah.moviedb.movierecommendationcore.model.Movie;
import com.gulsah.moviedb.movierecommendationcore.model.TMDBResponse;
import com.gulsah.moviedb.movierecommendationcore.service.MovieUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * Created by GulsahCoskun on 3.02.2018.
 */
@RestController
public class MovieDBController {

    @Autowired
    MovieUrlService urlService;

    @GetMapping("/movies/popular-movies/")
    public Movie[] getPopularMovies(){
        ResponseEntity<TMDBResponse> responseEntity = new RestTemplate().
                getForEntity(urlService.popularMovieUrl(),TMDBResponse.class);

        return responseEntity.getBody().getResults();
    }

    @GetMapping("/movies/current-movies/")
    public Movie[] getMoviesInCinemas(){
        ResponseEntity<TMDBResponse> responseEntity = new RestTemplate().
                getForEntity(urlService.moviesAtCinemaUrl(),TMDBResponse.class);

        return responseEntity.getBody().getResults();
    }

}
