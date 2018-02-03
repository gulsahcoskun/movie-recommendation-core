package com.gulsah.moviedb.movierecommendationcore.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by GulsahCoskun on 3.02.2018.
 */
@JsonIgnoreProperties
public class Genre {

    private int id;
    private String name;

    public Genre() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
