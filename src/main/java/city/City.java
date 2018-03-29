package city;

public class City {

    private String cityName;
    private String timeZone;

    public City() {
    }

    
    public City(String cityName) {
        this.cityName = cityName;
    }

    public City(String cityName, String timeZone) {
        this.cityName = cityName;
        this.timeZone = timeZone;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

}
