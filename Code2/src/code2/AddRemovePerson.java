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
public class AddRemovePerson extends MainGUI {
    
    public static void main(String[] args) {
        ArrayList<Person> peopleArrayList = new ArrayList<Person>();
        add();
        remove();
    }
    public static void add(){
        MyDate d = new MyDate(Byte.parseByte(dateCB.getSelectedItem()+""), monthCB.getSelectedItem()+"", Integer.parseInt(yearCB.getSelectedItem()+""));
        Address a = new Address(streetTF.getText()+"", stateTF.getText()+"", countryTF.getText()+"", Integer.parseInt(zipTF.getText()+""));
        String [] email = {firstEmailTF.getText(), secondEmailTF.getText(), thirdEmailTF.getText()};
        String [] phone = {firstPhoneTF.getText(), secondPhoneTF.getText(), thirdPhoneTF.getText()};
        String [] category = {categoryCB.getSelectedItem()+""};
        peopleArrayList.add(new Person(
                nameTF.getText(),
                Integer.parseInt(ageTF.getText()), 
                d,
                email,
                phone,
                organizationTF.getText(),
                a,
                category,
                notesTA.getText()
        ));
        nameTF.setText("");
        ageTF.setText("");
        dateCB.setSelectedIndex(0);
        monthCB.setSelectedIndex(0);
        yearCB.setSelectedIndex(0);
        firstEmailTF.setText("");
        secondEmailTF.setText("");
        thirdEmailTF.setText("");
        firstPhoneTF.setText("");
        secondPhoneTF.setText("");
        thirdPhoneTF.setText("");
        organizationTF.setText("");
        streetTF.setText("");
        stateTF.setText("");
        countryTF.setText("");
        categoryCB.setSelectedIndex(0);
        notesTA.setText("");
        
        
    }
    public static void remove(){
        
    }
    
}
