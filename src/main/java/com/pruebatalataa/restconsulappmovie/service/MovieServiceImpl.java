package com.yoandypv.restconsulappmovie.service;

import com.yoandypv.restconsulappmovie.service.dto.movie.movieResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class MovieServiceImpl extends AbstractClient implements MovieService {

    public MovieServiceImpl(RestTemplate restTemplate) {
        super(restTemplate);
    }
    @Override
    public movieResponse findAll(String access_token) {
        String uri = baseUrl + "/id";
        HttpEntity<Void> requestEntity = new HttpEntity<>(this.buildAuthToken(access_token));
        ResponseEntity<movieResponse> response = restTemplate.exchange(
                uri, HttpMethod.GET, requestEntity , movieResponse.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            log.info("Successfully user creation: {}", response.getBody().getStatus());
            return response.getBody();
        }
        log.error("Error in user creation - httpStatus was: {}", response.getStatusCode());
        throw new RuntimeException("Error");
    }


}
