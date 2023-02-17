
package com.weather.api.model.weather;

import javax.annotation.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
public class Forecast {

    private List<Forecastday> forecastday;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Forecast() {
    }

    /**
     * 
     * @param forecastday
     */
    public Forecast(List<Forecastday> forecastday) {
        super();
        this.forecastday = forecastday;
    }

    public List<Forecastday> getForecastday() {
        return forecastday;
    }

    public void setForecastday(List<Forecastday> forecastday) {
        this.forecastday = forecastday;
    }

}
