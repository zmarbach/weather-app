package com.improving.weather.client;

public class City{
    private Weather[] weather;
    private MainMetrics main;
    private Wind wind;
    private String name;

    public City(){
    }

    public City(Weather[] weather, MainMetrics main, Wind wind, String name) {
        this.weather = weather;
        this.main = main;
        this.wind = wind;
        this.name = name;
    }

    public Weather[] getWeather() {
        return weather;
    }

    public void setWeather(Weather[] weather) {
        this.weather = weather;
    }

    public MainMetrics getMain() {
        return main;
    }

    public void setMain(MainMetrics main) {
        this.main = main;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}