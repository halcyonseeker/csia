/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code2;

/**
 *
 * @author apotheosis
 */
public class Address {
    private String street = "not set yet";
    private String state = "not set yet";
    private String country = "not set yet";
    private String zip = "not set yet";
    
      
    
    public Address (){
        
    }
    
    
    public Address (String street, String state, String country, String zip){
        this.street = street;
        this.state = state;
        this.country = country;
        this.zip = zip;
    }
    
    
    
    public void setStreet (String street){
       this.street = street; 
    }
    public void setState (String state){
        this.state = state;
    }
    public void setCountry (String country){
        this.country = country;
    }
    public void setZip (String zip){
        this.zip = zip;
    }
    
    
    
    public String getStreet (){
        return street;
    }
    public String getState (){
        return state;
    }
    public String getCountry (){
        return country;
    }
    public String getZip (){
        return zip;
    }
}
