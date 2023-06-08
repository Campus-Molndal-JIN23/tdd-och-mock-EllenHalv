package org.campusmolndal;

public class Weather {

    private String city;
    private double temp;
    private int humidity;
    private int clouds;

    public Weather(String city, double temp, int humidity, int clouds) {
        this.city = city;
        this.temp = temp;
        this.humidity = humidity;
        this.clouds = clouds;
    }

    public String getCity() {
        return this.city;
    }

    public double getTemp() {
        return this.temp;
    }

    public int getHumidity() {
        return this.humidity;
    }

    public int getClouds() {
        return this.clouds;
    }

    public String toString() {
        return "Weather: " + this.city + ", " + this.temp + ", " + this.humidity + ", " + this.clouds;
    }
}
