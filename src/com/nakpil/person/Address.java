/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nakpil.person;
/**
 *
 * @author HERU
 */
public abstract class Address {
    
    private String Lo,Ct,Co,Zi,Cc;
    
    /**
     *
     * @param Location
     *      Exact Location on City
     */
    public void setLocation(String Location){
        Lo = Location;
    }
    public void setCity(String City){
        Ct = City;
    }
    public void setCountry(String Country){
        Co = Country;
    }
    public void setZipcode(String Zipcode){
        Zi = Zipcode;
    }
    public void setCountryCode(String Countrycode){
        Cc = Countrycode;
    }
    public String getLocation(){
        return Lo;
    }
    public String getCity(){
        return Ct;
    }
    public String getCountry(){
        return Co;
    }
    public String getZipCode(){
        return Zi;
    }
    public String getCountryCode(){
        return Cc;
    }
}
