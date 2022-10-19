package com.nestdigital.moviebackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "movies")
public class MovieModel {

    @Id
    @GeneratedValue
    private int id;
    private String moviename;
    private int releasedyear;
    private String language;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public int getReleasedyear() {
        return releasedyear;
    }

    public void setReleasedyear(int releasedyear) {
        this.releasedyear = releasedyear;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public MovieModel(int id, String moviename, int releasedyear, String language) {
        this.id = id;
        this.moviename = moviename;
        this.releasedyear = releasedyear;
        this.language = language;
    }

    public MovieModel() {
    }
}
