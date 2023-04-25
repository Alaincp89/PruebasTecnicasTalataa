package com.yoandypv.restconsulappmovie.controller;

import com.yoandypv.restconsulappmovie.service.MovieService;
import com.yoandypv.restconsulappmovie.service.dto.movie.movieResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService teamService) {
        this.movieService = teamService;
    }

    @GetMapping("/movies/{id}")
    public movieResponse findAll(@RequestHeader( name = "x-token") String access_token) {
      return this.movieService.findAll(access_token);
    }
}
