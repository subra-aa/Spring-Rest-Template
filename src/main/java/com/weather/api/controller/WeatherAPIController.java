package com.weather.api.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.weather.api.exception.handler.InvalidZipcodeException;
import com.weather.api.model.response.WeatherAPIResponse;
import com.weather.api.model.weather.Weather;
import com.weather.api.service.WeatherAPIService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.Map;
import java.util.Objects;

@Slf4j
@RequiredArgsConstructor
@RestController
@Tag(name = "Weather API controller with Lombok", description = "Weather API with lombok features")
public class WeatherAPIController {

    private final WeatherAPIService service;

    @Operation(summary = "Swagger documentation url", hidden = true)
    @GetMapping
    ResponseEntity<Void> redirect() {
        return ResponseEntity.status(HttpStatus.FOUND)
                .location(URI.create("swagger-ui-custom.html"))
                .build();
    }


    @Operation(summary = "Get a Weather forecast by Zipcode")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the data",
                    content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = WeatherAPIResponse.class))}),
            @ApiResponse(responseCode = "400", description = "Invalid Zipcode", content = @Content),
            @ApiResponse(responseCode = "404", description = "Weather forecast not found", content = @Content),
            @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content)
    })
    @GetMapping("/weather")
    public ResponseEntity<Weather> getWeatherForecastZipcode() {
        String weatherAPIResponse = service.getWeatherForecast();
        Weather weather = null;

        try {
            weather = new ObjectMapper().readValue(weatherAPIResponse, Weather.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        log.info("*** Weather forecast :: {}", weatherAPIResponse);
        return ResponseEntity.ok().body(weather);
    }


}
