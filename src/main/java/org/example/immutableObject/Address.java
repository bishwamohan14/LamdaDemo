package org.example.immutableObject;

// mutable class
public class Address {
    private String cityName;
    private String state;

    private String country;


    public Address(String cityName, String state,String country) {
        this.cityName = cityName;
        this.state = state;
        this.country=country;
    }

    public Address(Address address) {
        this(address.getCityName(), address.getState(), address.getCountry());
    }

    public String getCityName() {
        return cityName;
    }


    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "cityName='" + cityName + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
