package com.gulsah.moviedb.movierecommendationcore.service;

import com.gulsah.moviedb.movierecommendationcore.util.MoviePaths;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * Created by GulsahCoskun on 3.02.2018.
 */
@Service
public class MovieUrlService {

    public String popularMovieUrl(){
        StringBuffer url = new StringBuffer();
        url.append(MoviePaths.POPULAR_MOVIES.getUrl());

        Random random = new Random();
        String randomPageNumber = String.valueOf(random.nextInt(50) +1);

        url.replace(url.length()-1, url.length(),randomPageNumber);

        return url.toString();
    }


    public String moviesAtCinemaUrl(){
        StringBuffer url  = new StringBuffer();
        url.append(MoviePaths.MOVIES_IN_CINEMAS.getUrl());
        Date currentDate = new Date();

        Calendar oneWeekAfter = Calendar.getInstance();
        oneWeekAfter.add(Calendar.WEEK_OF_YEAR,1);
        Date dateWeekAfter = oneWeekAfter.getTime();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        url.replace(url.length()-10,url.length(),dateFormat.format(dateWeekAfter));
        url.replace(url.length()-46,url.length()-36,dateFormat.format(currentDate));

        return url.toString();
    }


}
