package com.yoandypv.restconsulappmovie.service.dto.movie;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class movieResponse {
    public String status;

    @JsonProperty("data")
    public List<movie> movies;
}
