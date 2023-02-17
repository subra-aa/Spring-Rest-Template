
package com.weather.api.model.weather;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Current {

    private long last_updated_epoch;
    private String last_updated;
    private long temp_c;
    private double temp_f;
    private long is_day;
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
    private long vis_km;
    private long vis_miles;
    private long uv;
    private double gust_mph;
    private double gust_kph;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Current() {
    }

    /**
     * 
     * @param feelslike_c
     * @param uv
     * @param last_updated
     * @param feelslike_f
     * @param wind_degree
     * @param last_updated_epoch
     * @param is_day
     * @param precip_in
     * @param wind_dir
     * @param gust_mph
     * @param temp_c
     * @param pressure_in
     * @param gust_kph
     * @param temp_f
     * @param precip_mm
     * @param cloud
     * @param wind_kph
     * @param condition
     * @param wind_mph
     * @param vis_km
     * @param humidity
     * @param pressure_mb
     * @param vis_miles
     */
    public Current(long last_updated_epoch, String last_updated, long temp_c, double temp_f, long is_day, Condition condition, double wind_mph, double wind_kph, long wind_degree, String wind_dir, long pressure_mb, double pressure_in, long precip_mm, long precip_in, long humidity, long cloud, double feelslike_c, double feelslike_f, long vis_km, long vis_miles, long uv, double gust_mph, double gust_kph) {
        super();
        this.last_updated_epoch = last_updated_epoch;
        this.last_updated = last_updated;
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
        this.vis_km = vis_km;
        this.vis_miles = vis_miles;
        this.uv = uv;
        this.gust_mph = gust_mph;
        this.gust_kph = gust_kph;
    }

    public long getLast_updated_epoch() {
        return last_updated_epoch;
    }

    public void setLast_updated_epoch(long last_updated_epoch) {
        this.last_updated_epoch = last_updated_epoch;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
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

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
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

    public long getUv() {
        return uv;
    }

    public void setUv(long uv) {
        this.uv = uv;
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

}
