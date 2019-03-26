/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code2;

import java.util.ArrayList;

/**
 *
 * @author apotheosis
 */
public class Person {
    private String name = "not set yet";
    private String age = "not set yet";
    private String date = "not set yet";
    private String month = "not set yet";
    private String year = "not set yet";
    private String[] email = {"not set yet"}; 
    private String[] phone = {"not set yet"}; 
    private String organization = "not set yet";
    //private String[] category = {"not set yet"}; 
    private String category = "not set yet";
    //Address homeAddress = new Address();
    private String street = "not set yet";
    private String state = "not set yet";
    private String country = "not set yet";
    private String zip = "not set yet";
    private String notes = "not set yet";
    
    
    
    public Person (){
        
    }
    
    
    
    public Person (String name, String age, String date, String month, String year, String[] email, String[] phone, String organization, String categoryArrayList, String street, String state, String country, String zip, String notes){
        this.name = name;
        this.age = age;
        this.date = date;
        this.month = month;
        this.year = year;
        this.email = email;
        this.phone = phone;
        this.organization = organization;
        this.category = categoryArrayList;
        //this.homeAddress = homeAddress;
        this.street = street;
        this.state = state;
        this.country = country;
        this.zip = zip;
        this.notes = notes;
        
    }
   


    
    
    public void setName (String name){
        this.name = name;
    }
    public void setAge (String age){
        this.age = age;
    }
    
    public void setDate (String date){
        this.date = date;
    }
    public void setMonth (String month){
        this.month = month;
    }
    public void setYear (String year){
        this.year = year;
    }
    public void setEmail (String[] email){
        this.email = email;
    }
    public void setPhone (String[] phone){
        this.phone = phone;
    }
    public void setOrganization (String organization){
        this.organization = organization;
    }
    public void setCategory (String categoryArrayList){
        this.category = categoryArrayList;
    }
    public void setDescription (String notes){
        this.notes = notes;
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
    
    
    
    public String getName(){
        return name;
    }
    public String getAge (){
        return age;
    }
    
    public String getDate (){
        return date;
    }
    public String getMonth (){
        return month;
    }
    public String getYear(){
        return year;
    }
    public String[] getEmail (){
        return email;
    }
    public String[] getPhone (){
        return phone;
    }
    public String getOrganization (){
        return organization;
    }
    public String getCategory (){
        return category;
    }
    public String getNotes (){
        return notes;
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
    public String getZip(){
        return zip;
    }
    

}
