
package com.weather.api.model.weather;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Weather {

    private Location location;
    private Current current;
    private Forecast forecast;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Weather() {
    }

    /**
     * 
     * @param current
     * @param location
     * @param forecast
     */
    public Weather(Location location, Current current, Forecast forecast) {
        super();
        this.location = location;
        this.current = current;
        this.forecast = forecast;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

}
