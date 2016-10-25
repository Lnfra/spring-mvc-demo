package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

  private String firstName;
  private String lastName;
  private String country;
  private LinkedHashMap<String, String> countryOptions; 
  private String favoriteLanguage;
  private LinkedHashMap<String, String> favoriteLanguageOptions;
  private String[] operatingSystems;
  
  public Student(){
    //populate country options: used ISO country code
    countryOptions = createCountryOptions();
    favoriteLanguageOptions = createFavoriteLanguageOptions();
  }
  
  private LinkedHashMap<String, String> createFavoriteLanguageOptions(){
    LinkedHashMap<String,String> options = new LinkedHashMap<>();
    options.put("Java", "Java");
    options.put("C#", "C#");
    options.put("PHP", "PHP");
    options.put("Ruby", "Ruby");
    return options;
  }
  
  private LinkedHashMap<String,String> createCountryOptions(){
    LinkedHashMap<String, String> options = new LinkedHashMap<>();
    options.put("BR", "Brazil");
    options.put("FR", "France");
    options.put("DE", "Germany");
    options.put("IN", "India");
    options.put("US", "United States of America");
    return options;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public LinkedHashMap<String, String> getCountryOptions() {
    return countryOptions;
  }

  public String getFavoriteLanguage() {
    return favoriteLanguage;
  }

  public void setFavoriteLanguage(String favouriteLanguage) {
    this.favoriteLanguage = favouriteLanguage;
  }
  
  public LinkedHashMap<String, String> getFavoriteLanguageOptions(){
    return favoriteLanguageOptions;
  }
  
  public String[] getOperatingSystems(){
    return operatingSystems;
  }
  
  public void setOperatingSystems(String[] operatingSystems){
    this.operatingSystems = operatingSystems;
  }
}
