
package com.weather.api.model.weather;

import javax.annotation.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
public class Forecastday {

    private String date;
    private long date_epoch;
    private Day day;
    private Astro astro;
    private List<Hour> hour;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Forecastday() {
    }

    /**
     * 
     * @param date
     * @param astro
     * @param date_epoch
     * @param hour
     * @param day
     */
    public Forecastday(String date, long date_epoch, Day day, Astro astro, List<Hour> hour) {
        super();
        this.date = date;
        this.date_epoch = date_epoch;
        this.day = day;
        this.astro = astro;
        this.hour = hour;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getDate_epoch() {
        return date_epoch;
    }

    public void setDate_epoch(long date_epoch) {
        this.date_epoch = date_epoch;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public Astro getAstro() {
        return astro;
    }

    public void setAstro(Astro astro) {
        this.astro = astro;
    }

    public List<Hour> getHour() {
        return hour;
    }

    public void setHour(List<Hour> hour) {
        this.hour = hour;
    }

}
