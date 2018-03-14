package dhbw.wpvs.ows.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListWeather {

    @SerializedName("dt")
    @Expose
    private Integer dt;
    @SerializedName("main")
    @Expose
    private Main main;
    @SerializedName("weather")
    @Expose
    private java.util.List<Weather> weather = null;
    @SerializedName("clouds")
    @Expose
    private Clouds clouds;
    @SerializedName("wind")
    @Expose
    private Wind wind;
    @SerializedName("rain")
    @Expose
    private Rain rain;
    @SerializedName("sys")
    @Expose
    private Sys sys;
    @SerializedName("dt_txt")
    @Expose
    private String dtTxt;
    @SerializedName("snow")
    @Expose
    private Snow snow;

    /**
     * No args constructor for use in serialization
     */
    public ListWeather() {
    }

    /**
     * @param clouds
     * @param dt
     * @param wind
     * @param sys
     * @param snow
     * @param dtTxt
     * @param weather
     * @param rain
     * @param main
     */
    public ListWeather(Integer dt, Main main, java.util.List<Weather> weather, Clouds clouds, Wind wind, Rain rain, Sys sys, String dtTxt, Snow snow) {
        super();
        this.dt = dt;
        this.main = main;
        this.weather = weather;
        this.clouds = clouds;
        this.wind = wind;
        this.rain = rain;
        this.sys = sys;
        this.dtTxt = dtTxt;
        this.snow = snow;
    }

    public Integer getDt() {
        return dt;
    }

    public void setDt(Integer dt) {
        this.dt = dt;
    }

    public ListWeather withDt(Integer dt) {
        this.dt = dt;
        return this;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public ListWeather withMain(Main main) {
        this.main = main;
        return this;
    }

    public java.util.List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(java.util.List<Weather> weather) {
        this.weather = weather;
    }

    public ListWeather withWeather(java.util.List<Weather> weather) {
        this.weather = weather;
        return this;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public ListWeather withClouds(Clouds clouds) {
        this.clouds = clouds;
        return this;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public ListWeather withWind(Wind wind) {
        this.wind = wind;
        return this;
    }

    public Rain getRain() {
        return rain;
    }

    public void setRain(Rain rain) {
        this.rain = rain;
    }

    public ListWeather withRain(Rain rain) {
        this.rain = rain;
        return this;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public ListWeather withSys(Sys sys) {
        this.sys = sys;
        return this;
    }

    public String getDtTxt() {
        return dtTxt;
    }

    public void setDtTxt(String dtTxt) {
        this.dtTxt = dtTxt;
    }

    public ListWeather withDtTxt(String dtTxt) {
        this.dtTxt = dtTxt;
        return this;
    }

    public Snow getSnow() {
        return snow;
    }

    public void setSnow(Snow snow) {
        this.snow = snow;
    }

    public ListWeather withSnow(Snow snow) {
        this.snow = snow;
        return this;
    }

}