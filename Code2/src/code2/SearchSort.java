
package code2;

import java.util.ArrayList;

/**
 *
 * @author apotheosis
 */
public class SearchSort {
    public static void main(String[] args) {
        search(); 
    }
    public static boolean search(ArrayList<Person> peopleArrayList, String searchTerm){
        for(int i = 0; i < peopleArrayList.size(); i++){   
           if(
                   peopleArrayList.getClass().getName().equalsIgnoreCase(searchTerm) //||
                   //peopleArrayList.getClass().getEmail().equalsIgnoreCase(searchTerm) || Array
                   //peopleArrayList.getClass().getPhone().equalsIgnoreCase(searchTerm) || Array
                   //peopleArrayList.getClass().getOrganization().equalsIgnoreCase(searchTerm) ||
                   //peopleArrayList.getClass().getCategory().equalsIgnoreCase(searchTerm)
                   ){
               return true;
           }
       }
    }  
}
