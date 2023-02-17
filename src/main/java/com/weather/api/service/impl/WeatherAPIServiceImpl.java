package com.weather.api.service.impl;

import com.weather.api.exception.handler.WeatherForecastNotFoundException;
import com.weather.api.model.ListData;
import com.weather.api.model.WeatherRoot;
import com.weather.api.model.response.WeatherAPIResponse;
import com.weather.api.service.WeatherAPIService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

@Slf4j
@RequiredArgsConstructor
@Service
public class WeatherAPIServiceImpl implements WeatherAPIService {

    private final RestTemplate restTemplate;
    private final Environment environment;


    @Override
    public String getWeatherForecast() {



        String apiUrl = environment.getProperty("weather.api.url");


        HttpHeaders headers = new HttpHeaders();
        headers.set("X-RapidAPI-Key", "7427b896d7mshe3d475b9864c08ep12cee9jsn2ec6e4a4a5f1");
        headers.set("X-RapidAPI-Host", "weatherapi-com.p.rapidapi.com");

        HttpEntity<Void> requestEntity = new HttpEntity<>(headers);

        ResponseEntity<String> response = restTemplate.exchange(
                apiUrl, HttpMethod.GET, requestEntity, String.class);


        return response.getBody();
    }





}
