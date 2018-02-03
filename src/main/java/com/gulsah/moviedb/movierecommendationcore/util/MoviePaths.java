package com.gulsah.moviedb.movierecommendationcore.util;

/**
 * Created by GulsahCoskun on 3.02.2018.
 */
public enum MoviePaths {

    POPULAR_MOVIES("https://api.themoviedb.org/3/discover/movie?api_key=d760d6621116ba910962866f41970162&language=en-US&sort_by=popularity.desc&include_adult=false&include_video=false&page=3"),
    MOVIES_IN_CINEMAS("https://api.themoviedb.org/3/discover/movie?api_key=d760d6621116ba910962866f41970162&language=en-US&primary_release_date.gte=2014-09-15&primary_release_date.lte=2014-10-22"),
    HIGHEST_RATED_MOVIES(""),
    BEST_OF_GENRES(""),
    MOVIES_TO_COME("");


    private String url;

    MoviePaths(String url) {
        this.url = url;
    }


    public String getUrl() {
        return url;
    }
}
