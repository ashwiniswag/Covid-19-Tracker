package com.example.covid_19tracker;

public class CountryModel {
    private String flag,country,deaths,todayDeaths,cases,todayCases,recovered,critial,active;

    public CountryModel(String flag, String country, String deaths, String todayDeaths, String cases, String todayCases, String recovered, String critial, String active) {
        this.flag = flag;
        this.country = country;
        this.deaths = deaths;
        this.todayDeaths = todayDeaths;
        this.cases = cases;
        this.todayCases = todayCases;
        this.recovered = recovered;
        this.critial = critial;
        this.active = active;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDeaths() {
        return deaths;
    }

    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    public String getTodayDeaths() {
        return todayDeaths;
    }

    public void setTodayDeaths(String todayDeaths) {
        this.todayDeaths = todayDeaths;
    }

    public String getCases() {
        return cases;
    }

    public void setCases(String cases) {
        this.cases = cases;
    }

    public String getTodayCases() {
        return todayCases;
    }

    public void setTodayCases(String todayCases) {
        this.todayCases = todayCases;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    public String getCritial() {
        return critial;
    }

    public void setCritial(String critial) {
        this.critial = critial;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
}
