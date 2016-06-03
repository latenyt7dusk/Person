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
public abstract class Contact {
    
    private String Te,Mn,Bc,Em;
    
    public void setTelephoneNumber(String Telephone){
        Te = Telephone;
    }
    public void setMobileNumber(String Mobile){
        Mn = Mobile;
    }
    public void setBusinessNumber(String Number){
        Bc = Number;
    }
    public void setEmailAddress(String Address){
        Em = Address;
    }
    public String getTelephoneNumber(){
        return Te;
    }
    public String getMobileNumber(){
        return Mn;
    }
    public String getBusinessNumber(){
        return Bc;
    }
    public String getEmailAddress(){
        return Em;
    }
}
