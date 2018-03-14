package dhbw.wpvs.ows.entity;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("cod")
    @Expose
    private String cod;
    @SerializedName("message")
    @Expose
    private Double message;
    @SerializedName("cnt")
    @Expose
    private Integer cnt;
    @SerializedName("listWeather")
    @Expose
    private java.util.List<ListWeather> listWeather = null;
    @SerializedName("city")
    @Expose
    private City city;

    /**
     * No args constructor for use in serialization
     */
    public Example() {
    }

    /**
     * @param message
     * @param cnt
     * @param cod
     * @param listWeather
     * @param city
     */
    public Example(String cod, Double message, Integer cnt, java.util.List<ListWeather> listWeather, City city) {
        super();
        this.cod = cod;
        this.message = message;
        this.cnt = cnt;
        this.listWeather = listWeather;
        this.city = city;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public Example withCod(String cod) {
        this.cod = cod;
        return this;
    }

    public Double getMessage() {
        return message;
    }

    public void setMessage(Double message) {
        this.message = message;
    }

    public Example withMessage(Double message) {
        this.message = message;
        return this;
    }

    public Integer getCnt() {
        return cnt;
    }

    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }

    public Example withCnt(Integer cnt) {
        this.cnt = cnt;
        return this;
    }

    public java.util.List<ListWeather> getListWeather() {
        return listWeather;
    }

    public void setListWeather(java.util.List<ListWeather> listWeather) {
        this.listWeather = listWeather;
    }

    public Example withList(java.util.List<ListWeather> listWeather) {
        this.listWeather = listWeather;
        return this;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Example withCity(City city) {
        this.city = city;
        return this;
    }

}