package com.pac.ccw;



//Coin.java
public class Coin {
  String country;
  String denomination;
  String yearOfMinting;
  String currentValue;
  String acquiredDate;

 // Constructor
 public Coin(String country, String denomination, String yearOfMinting, String currentValue, String acquiredDate) {
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

 public String getDenomination() {
     return denomination;
 }

 public void setDenomination(String denomination) {
     this.denomination = denomination;
 }

 public String getYearOfMinting() {
     return yearOfMinting;
 }

 public void setYearOfMinting(String yearOfMinting) {
     this.yearOfMinting = yearOfMinting;
 }

 public String getCurrentValue() {
     return currentValue;
 }

 public void setCurrentValue(String currentValue) {
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
