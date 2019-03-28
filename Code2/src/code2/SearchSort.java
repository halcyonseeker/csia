
package code2;

import java.util.ArrayList;

/**
 *
 * @author apotheosis
 */
public class SearchSort {
    
    public ArrayList <Person> search(ArrayList<Person> peopleArrayList, String searchTerm){
        ArrayList <Person> searchResultArrayList = new ArrayList <Person>();
        System.out.println("declared new array list");
        for(int i = 0; i < peopleArrayList.size(); i++){
            System.out.println(peopleArrayList.size());
            System.out.println(searchTerm);
            if(peopleArrayList.get(i).getName().equalsIgnoreCase(searchTerm)){
                System.out.println("search condition");
                searchResultArrayList.add(peopleArrayList.get(i)); 
            } 
        }
        return searchResultArrayList; 
    }

    
    public ArrayList <Person> query(ArrayList<Person> peopleArrayList, String queryCategory){
        ArrayList<Person> queryResultArrayList = new ArrayList<Person>();
        for(int i = 0; i < peopleArrayList.size(); i++){
            if(peopleArrayList.get(i).getCategory().equals(queryCategory)){
                queryResultArrayList.add(peopleArrayList.get(i));
                System.out.println("Searched");
            }
        }
        return queryResultArrayList;
    }
}
