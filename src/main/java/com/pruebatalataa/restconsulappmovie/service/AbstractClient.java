package com.yoandypv.restconsulappmovie.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

public abstract class AbstractClient {

    @Value("${https://api.themoviedb.org/")
    protected String baseUrl;

    protected final  RestTemplate restTemplate;

    protected AbstractClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    protected HttpHeaders buildAuthToken(String access_token) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json;charset=utf-8");
        headers.set("Authorization", "Bearer " + access_token);
        return headers;
    }
}
