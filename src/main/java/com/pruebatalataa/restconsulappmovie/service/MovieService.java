package com.yoandypv.restconsulappmovie.service;

import com.yoandypv.restconsulappmovie.service.dto.movie.movieResponse;

public interface MovieService {
  movieResponse findAll(String token);
}
