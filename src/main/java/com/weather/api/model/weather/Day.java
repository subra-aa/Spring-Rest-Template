
package com.weather.api.model.weather;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Day {

    private long maxtemp_c;
    private double maxtemp_f;
    private double mintemp_c;
    private double mintemp_f;
    private double avgtemp_c;
    private double avgtemp_f;
    private long maxwind_mph;
    private double maxwind_kph;
    private long totalprecip_mm;
    private long totalprecip_in;
    private long totalsnow_cm;
    private long avgvis_km;
    private long avgvis_miles;
    private long avghumidity;
    private long daily_will_it_rain;
    private long daily_chance_of_rain;
    private long daily_will_it_snow;
    private long daily_chance_of_snow;
    private Condition condition;
    private long uv;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Day() {
    }

    /**
     * 
     * @param avgvis_km
     * @param uv
     * @param avgtemp_f
     * @param avgtemp_c
     * @param daily_chance_of_snow
     * @param maxtemp_c
     * @param maxtemp_f
     * @param mintemp_c
     * @param avgvis_miles
     * @param daily_will_it_rain
     * @param mintemp_f
     * @param totalprecip_in
     * @param totalsnow_cm
     * @param avghumidity
     * @param condition
     * @param maxwind_kph
     * @param maxwind_mph
     * @param daily_chance_of_rain
     * @param totalprecip_mm
     * @param daily_will_it_snow
     */
    public Day(long maxtemp_c, double maxtemp_f, double mintemp_c, double mintemp_f, double avgtemp_c, double avgtemp_f, long maxwind_mph, double maxwind_kph, long totalprecip_mm, long totalprecip_in, long totalsnow_cm, long avgvis_km, long avgvis_miles, long avghumidity, long daily_will_it_rain, long daily_chance_of_rain, long daily_will_it_snow, long daily_chance_of_snow, Condition condition, long uv) {
        super();
        this.maxtemp_c = maxtemp_c;
        this.maxtemp_f = maxtemp_f;
        this.mintemp_c = mintemp_c;
        this.mintemp_f = mintemp_f;
        this.avgtemp_c = avgtemp_c;
        this.avgtemp_f = avgtemp_f;
        this.maxwind_mph = maxwind_mph;
        this.maxwind_kph = maxwind_kph;
        this.totalprecip_mm = totalprecip_mm;
        this.totalprecip_in = totalprecip_in;
        this.totalsnow_cm = totalsnow_cm;
        this.avgvis_km = avgvis_km;
        this.avgvis_miles = avgvis_miles;
        this.avghumidity = avghumidity;
        this.daily_will_it_rain = daily_will_it_rain;
        this.daily_chance_of_rain = daily_chance_of_rain;
        this.daily_will_it_snow = daily_will_it_snow;
        this.daily_chance_of_snow = daily_chance_of_snow;
        this.condition = condition;
        this.uv = uv;
    }

    public long getMaxtemp_c() {
        return maxtemp_c;
    }

    public void setMaxtemp_c(long maxtemp_c) {
        this.maxtemp_c = maxtemp_c;
    }

    public double getMaxtemp_f() {
        return maxtemp_f;
    }

    public void setMaxtemp_f(double maxtemp_f) {
        this.maxtemp_f = maxtemp_f;
    }

    public double getMintemp_c() {
        return mintemp_c;
    }

    public void setMintemp_c(double mintemp_c) {
        this.mintemp_c = mintemp_c;
    }

    public double getMintemp_f() {
        return mintemp_f;
    }

    public void setMintemp_f(double mintemp_f) {
        this.mintemp_f = mintemp_f;
    }

    public double getAvgtemp_c() {
        return avgtemp_c;
    }

    public void setAvgtemp_c(double avgtemp_c) {
        this.avgtemp_c = avgtemp_c;
    }

    public double getAvgtemp_f() {
        return avgtemp_f;
    }

    public void setAvgtemp_f(double avgtemp_f) {
        this.avgtemp_f = avgtemp_f;
    }

    public long getMaxwind_mph() {
        return maxwind_mph;
    }

    public void setMaxwind_mph(long maxwind_mph) {
        this.maxwind_mph = maxwind_mph;
    }

    public double getMaxwind_kph() {
        return maxwind_kph;
    }

    public void setMaxwind_kph(double maxwind_kph) {
        this.maxwind_kph = maxwind_kph;
    }

    public long getTotalprecip_mm() {
        return totalprecip_mm;
    }

    public void setTotalprecip_mm(long totalprecip_mm) {
        this.totalprecip_mm = totalprecip_mm;
    }

    public long getTotalprecip_in() {
        return totalprecip_in;
    }

    public void setTotalprecip_in(long totalprecip_in) {
        this.totalprecip_in = totalprecip_in;
    }

    public long getTotalsnow_cm() {
        return totalsnow_cm;
    }

    public void setTotalsnow_cm(long totalsnow_cm) {
        this.totalsnow_cm = totalsnow_cm;
    }

    public long getAvgvis_km() {
        return avgvis_km;
    }

    public void setAvgvis_km(long avgvis_km) {
        this.avgvis_km = avgvis_km;
    }

    public long getAvgvis_miles() {
        return avgvis_miles;
    }

    public void setAvgvis_miles(long avgvis_miles) {
        this.avgvis_miles = avgvis_miles;
    }

    public long getAvghumidity() {
        return avghumidity;
    }

    public void setAvghumidity(long avghumidity) {
        this.avghumidity = avghumidity;
    }

    public long getDaily_will_it_rain() {
        return daily_will_it_rain;
    }

    public void setDaily_will_it_rain(long daily_will_it_rain) {
        this.daily_will_it_rain = daily_will_it_rain;
    }

    public long getDaily_chance_of_rain() {
        return daily_chance_of_rain;
    }

    public void setDaily_chance_of_rain(long daily_chance_of_rain) {
        this.daily_chance_of_rain = daily_chance_of_rain;
    }

    public long getDaily_will_it_snow() {
        return daily_will_it_snow;
    }

    public void setDaily_will_it_snow(long daily_will_it_snow) {
        this.daily_will_it_snow = daily_will_it_snow;
    }

    public long getDaily_chance_of_snow() {
        return daily_chance_of_snow;
    }

    public void setDaily_chance_of_snow(long daily_chance_of_snow) {
        this.daily_chance_of_snow = daily_chance_of_snow;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public long getUv() {
        return uv;
    }

    public void setUv(long uv) {
        this.uv = uv;
    }

}
