package com.pac.cc;

// Coin.java
public class Coin {
    private String country;
    private double denomination;
    private int yearOfMinting;
    private double currentValue;
    private String acquiredDate;

    // Constructor
    public Coin(String country, double denomination, int yearOfMinting, double currentValue, String acquiredDate) {
        this.country = country;
        this.denomination = denomination;
        this.yearOfMinting = yearOfMinting;
        this.currentValue = currentValue;
        this.acquiredDate = acquiredDate;
    }

    // Getters and Setters
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getDenomination() {
        return denomination;
    }

    public void setDenomination(double denomination) {
        this.denomination = denomination;
    }

    public int getYearOfMinting() {
        return yearOfMinting;
    }

    public void setYearOfMinting(int yearOfMinting) {
        this.yearOfMinting = yearOfMinting;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public String getAcquiredDate() {
        return acquiredDate;
    }

    public void setAcquiredDate(String acquiredDate) {
        this.acquiredDate = acquiredDate;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "country='" + country + '\'' +
                ", denomination=" + denomination +
                ", yearOfMinting=" + yearOfMinting +
                ", currentValue=" + currentValue +
                ", acquiredDate='" + acquiredDate + '\'' +
                '}';
    }
}
