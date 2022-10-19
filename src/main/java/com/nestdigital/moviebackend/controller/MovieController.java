package com.nestdigital.moviebackend.controller;

import com.nestdigital.moviebackend.dao.MovieDao;
import com.nestdigital.moviebackend.model.MovieModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    private MovieDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path="/movieadd",consumes = "application/json",produces = "application/json")
    public String Movie(@RequestBody MovieModel movie){
        System.out.println(movie.toString());
        dao.save(movie);
        return "{status:'success'}";

    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewmovie")
    public List<MovieModel> viewmovie(){
        return (List<MovieModel>) dao.findAll();
    }

}
