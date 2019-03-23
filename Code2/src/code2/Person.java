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
public class Person {
    private String name = "not set yet";
    private int age = -99;
    private String[] email = {"not set yet"}; //possibly ArrayList
    private String[] phone = {"not set yet"}; //possibly ArrayList
    MyDate birthday = new MyDate();
    private String organization = "not set yet";
    private String[] category = {"not set yet"}; //ArrayList
    Address homeAddress = new Address();
    private String notes = "not set yet";
    
    
    
    public Person (){
        
    }
    
    
    
    public Person (String name, int age, String[] email, String[] phone, MyDate birhday, String organization, String[] category, Address homeAddress, String notes){
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.birthday = birthday;
        this.organization = organization;
        this.category = category;
        this.homeAddress = homeAddress;
        this.notes = notes;
    }

    Person(String text, int parseInt, MyDate d, String[] email, String[] phone, String text0, Address a, String[] category, String text1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void setName (String name){
        this.name = name;
    }
    public void setAge (int age){
        this.age = age;
    }
    public void setEmail (String[] email){
        this.email = email;
    }
    public void setPhone (String[] phone){
        this.phone = phone;
    }
    public void setBirthday (MyDate birthday){
        this.birthday = birthday;
    }
    public void setOrganization (String organization){
        this.organization = organization;
    }
    public void setCategory (String[] category){
        this.category = category;
    }
    public void sethomeAddress (Address homeAddress){
        this.homeAddress = homeAddress;
    }
    public void setDescription (String notes){
        this.notes = notes;
    }
    
    
    
    public String getName(){
        return name;
    }
    public int getAge (){
        return age;
    }
    public String[] getEmail (){
        return email;
    }
    public String[] getPhone (){
        return phone;
    }
    public MyDate getBirthday (){
        return birthday;
    }
    public String getOrganization (){
        return organization;
    }
    public String[] getCategory (){
        return category;
    }
    public Address getHomeAddress (){
        return homeAddress;
    }
    public String getNotes (){
        return notes;
    }
    

}
