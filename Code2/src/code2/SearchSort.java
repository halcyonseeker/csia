
package code2;

import java.util.ArrayList;

/**
 *
 * @author apotheosis
 */
public class SearchSort {
    
    public ArrayList <Person> search(ArrayList<Person> peopleArrayList, String searchTerm){
        ArrayList<Person> searchResultArrayList = new ArrayList<Person>();
        for(int i = 0; i < peopleArrayList.size(); i++){   
           if(peopleArrayList.get(i).getName().equalsIgnoreCase(searchTerm)){
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
            }
        }
        return queryResultArrayList;
    }
}
