/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia;

/**
 *
 * @author apotheosis
 */
public class Date {
    private String[] day = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    private byte date = -25;
    private String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private int year = -999; 
    
    
    public Date (){
        
    }
    
    public Date (String[] day, byte date, String[] month, int year) {
        this.day = day;
        this.date = date;
        this.month = month;
        this.year = year;
    }
    
    
    public void setDay (String[] day){
        this.day = day;
    }    
    public void setDate (byte date){
        this.date = date;
    }
    public void setMonth (String[] month){
        this.month = month;
    }
    public void setYear (int year){
        this.year = year;
    }
    
    
    public String[] getDay (){
        return day;
    }
    public byte date (){
        return date;
    }
    public String[] month (){
        return month;
    }
    public int year (){
        return year;
    }
    
}
