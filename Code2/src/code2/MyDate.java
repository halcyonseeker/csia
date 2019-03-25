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
public class MyDate {
    private String date = "not set yet";
    private String month = "not set yet";
    private String year = "net set yet"; 
    
    
    public MyDate (){
        
    }
    
    public MyDate (String date, String month, String year) {
        this.date = date;
        this.month = month;
        this.year = year;
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
    

    public String date (){
        return date;
    }
    public String month (){
        return month;
    }
    public String year (){
        return year;
    }
}
