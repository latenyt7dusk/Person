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
public abstract class Person {
    
    private String S,F,M,E,T;
    
    /**
     * @param Firstname
     * @param Middlename
     * @param Surname
     * @param Extensionname
     * @param Title
     */
    public void setName(String Firstname,String Middlename,String Surname, String Extensionname,String Title){
        S = Surname;
        M = Middlename;
        F = Firstname;
        E = Extensionname;
        T = Title;
    }
    
    public void setFirstname(String Firstname){
        F = Firstname;
    }
    public void setMiddlename(String Middlename){
        M = Middlename;
    }
    public void setSurname(String Surname){
        S = Surname;
    }
    public void setExtensionname(String Extensionname){
        E = Extensionname;
    }
    public void setTitle(String Title){
        T = Title;
    }
    public String getFirstname(){
        return F;
    }
    public String getMiddlename(){
        return M;
    }
    public String getSurname(){
        return S;
    }
    public String getExtensionname(){
        return E;
    }
    public String getTitle(){
        return T;
    }
    
    
}
