
package com.weather.api.model.weather;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Hour {

    private long time_epoch;
    private String time;
    private long temp_c;
    private double temp_f;
    private long is_day;

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    private Condition condition;
    private double wind_mph;
    private double wind_kph;
    private long wind_degree;
    private String wind_dir;
    private long pressure_mb;
    private double pressure_in;
    private long precip_mm;
    private long precip_in;
    private long humidity;
    private long cloud;
    private double feelslike_c;
    private double feelslike_f;
    private double windchill_c;
    private double windchill_f;
    private long heatindex_c;
    private double heatindex_f;
    private double dewpoint_c;
    private double dewpoint_f;
    private long will_it_rain;
    private long chance_of_rain;
    private long will_it_snow;
    private long chance_of_snow;
    private long vis_km;
    private long vis_miles;
    private double gust_mph;
    private double gust_kph;
    private long uv;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Hour() {
    }

    /**
     * 
     * @param feelslike_c
     * @param feelslike_f
     * @param wind_degree
     * @param windchill_f
     * @param windchill_c
     * @param temp_c
     * @param temp_f
     * @param cloud
     * @param wind_kph
     * @param wind_mph
     * @param humidity
     * @param dewpoint_f
     * @param will_it_rain
     * @param uv
     * @param heatindex_f
     * @param dewpoint_c
     * @param is_day
     * @param precip_in
     * @param heatindex_c
     * @param wind_dir
     * @param gust_mph
     * @param pressure_in
     * @param chance_of_rain
     * @param gust_kph
     * @param precip_mm
     * @param condition
     * @param will_it_snow
     * @param vis_km
     * @param time_epoch
     * @param time
     * @param chance_of_snow
     * @param pressure_mb
     * @param vis_miles
     */
    public Hour(long time_epoch,Condition condition, String time, long temp_c, double temp_f, long is_day, double wind_mph, double wind_kph, long wind_degree, String wind_dir, long pressure_mb, double pressure_in, long precip_mm, long precip_in, long humidity, long cloud, double feelslike_c, double feelslike_f, double windchill_c, double windchill_f, long heatindex_c, double heatindex_f, double dewpoint_c, double dewpoint_f, long will_it_rain, long chance_of_rain, long will_it_snow, long chance_of_snow, long vis_km, long vis_miles, double gust_mph, double gust_kph, long uv) {
        super();
        this.time_epoch = time_epoch;
        this.time = time;
        this.temp_c = temp_c;
        this.temp_f = temp_f;
        this.is_day = is_day;
        this.condition = condition;
        this.wind_mph = wind_mph;
        this.wind_kph = wind_kph;
        this.wind_degree = wind_degree;
        this.wind_dir = wind_dir;
        this.pressure_mb = pressure_mb;
        this.pressure_in = pressure_in;
        this.precip_mm = precip_mm;
        this.precip_in = precip_in;
        this.humidity = humidity;
        this.cloud = cloud;
        this.feelslike_c = feelslike_c;
        this.feelslike_f = feelslike_f;
        this.windchill_c = windchill_c;
        this.windchill_f = windchill_f;
        this.heatindex_c = heatindex_c;
        this.heatindex_f = heatindex_f;
        this.dewpoint_c = dewpoint_c;
        this.dewpoint_f = dewpoint_f;
        this.will_it_rain = will_it_rain;
        this.chance_of_rain = chance_of_rain;
        this.will_it_snow = will_it_snow;
        this.chance_of_snow = chance_of_snow;
        this.vis_km = vis_km;
        this.vis_miles = vis_miles;
        this.gust_mph = gust_mph;
        this.gust_kph = gust_kph;
        this.uv = uv;
    }

    public long getTime_epoch() {
        return time_epoch;
    }

    public void setTime_epoch(long time_epoch) {
        this.time_epoch = time_epoch;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public long getTemp_c() {
        return temp_c;
    }

    public void setTemp_c(long temp_c) {
        this.temp_c = temp_c;
    }

    public double getTemp_f() {
        return temp_f;
    }

    public void setTemp_f(double temp_f) {
        this.temp_f = temp_f;
    }

    public long getIs_day() {
        return is_day;
    }

    public void setIs_day(long is_day) {
        this.is_day = is_day;
    }



    public double getWind_mph() {
        return wind_mph;
    }

    public void setWind_mph(double wind_mph) {
        this.wind_mph = wind_mph;
    }

    public double getWind_kph() {
        return wind_kph;
    }

    public void setWind_kph(double wind_kph) {
        this.wind_kph = wind_kph;
    }

    public long getWind_degree() {
        return wind_degree;
    }

    public void setWind_degree(long wind_degree) {
        this.wind_degree = wind_degree;
    }

    public String getWind_dir() {
        return wind_dir;
    }

    public void setWind_dir(String wind_dir) {
        this.wind_dir = wind_dir;
    }

    public long getPressure_mb() {
        return pressure_mb;
    }

    public void setPressure_mb(long pressure_mb) {
        this.pressure_mb = pressure_mb;
    }

    public double getPressure_in() {
        return pressure_in;
    }

    public void setPressure_in(double pressure_in) {
        this.pressure_in = pressure_in;
    }

    public long getPrecip_mm() {
        return precip_mm;
    }

    public void setPrecip_mm(long precip_mm) {
        this.precip_mm = precip_mm;
    }

    public long getPrecip_in() {
        return precip_in;
    }

    public void setPrecip_in(long precip_in) {
        this.precip_in = precip_in;
    }

    public long getHumidity() {
        return humidity;
    }

    public void setHumidity(long humidity) {
        this.humidity = humidity;
    }

    public long getCloud() {
        return cloud;
    }

    public void setCloud(long cloud) {
        this.cloud = cloud;
    }

    public double getFeelslike_c() {
        return feelslike_c;
    }

    public void setFeelslike_c(double feelslike_c) {
        this.feelslike_c = feelslike_c;
    }

    public double getFeelslike_f() {
        return feelslike_f;
    }

    public void setFeelslike_f(double feelslike_f) {
        this.feelslike_f = feelslike_f;
    }

    public double getWindchill_c() {
        return windchill_c;
    }

    public void setWindchill_c(double windchill_c) {
        this.windchill_c = windchill_c;
    }

    public double getWindchill_f() {
        return windchill_f;
    }

    public void setWindchill_f(double windchill_f) {
        this.windchill_f = windchill_f;
    }

    public long getHeatindex_c() {
        return heatindex_c;
    }

    public void setHeatindex_c(long heatindex_c) {
        this.heatindex_c = heatindex_c;
    }

    public double getHeatindex_f() {
        return heatindex_f;
    }

    public void setHeatindex_f(double heatindex_f) {
        this.heatindex_f = heatindex_f;
    }

    public double getDewpoint_c() {
        return dewpoint_c;
    }

    public void setDewpoint_c(double dewpoint_c) {
        this.dewpoint_c = dewpoint_c;
    }

    public double getDewpoint_f() {
        return dewpoint_f;
    }

    public void setDewpoint_f(double dewpoint_f) {
        this.dewpoint_f = dewpoint_f;
    }

    public long getWill_it_rain() {
        return will_it_rain;
    }

    public void setWill_it_rain(long will_it_rain) {
        this.will_it_rain = will_it_rain;
    }

    public long getChance_of_rain() {
        return chance_of_rain;
    }

    public void setChance_of_rain(long chance_of_rain) {
        this.chance_of_rain = chance_of_rain;
    }

    public long getWill_it_snow() {
        return will_it_snow;
    }

    public void setWill_it_snow(long will_it_snow) {
        this.will_it_snow = will_it_snow;
    }

    public long getChance_of_snow() {
        return chance_of_snow;
    }

    public void setChance_of_snow(long chance_of_snow) {
        this.chance_of_snow = chance_of_snow;
    }

    public long getVis_km() {
        return vis_km;
    }

    public void setVis_km(long vis_km) {
        this.vis_km = vis_km;
    }

    public long getVis_miles() {
        return vis_miles;
    }

    public void setVis_miles(long vis_miles) {
        this.vis_miles = vis_miles;
    }

    public double getGust_mph() {
        return gust_mph;
    }

    public void setGust_mph(double gust_mph) {
        this.gust_mph = gust_mph;
    }

    public double getGust_kph() {
        return gust_kph;
    }

    public void setGust_kph(double gust_kph) {
        this.gust_kph = gust_kph;
    }

    public long getUv() {
        return uv;
    }

    public void setUv(long uv) {
        this.uv = uv;
    }

}
