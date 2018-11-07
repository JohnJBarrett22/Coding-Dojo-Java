import java.util.*;

public class ListsOfExceptions{
    public void workTest(){
        ArrayList<Object> workList = new ArrayList<Object>();
        workList.add("22");
        workList.add("Cats in my pasta!");
        workList.add(15);
        workList.add("Or did I cover my cats in pasta?");
        workList.add(99);
    
        try {
            for(int i = 0; i < workList.size(); i++){
                Integer castedValue = (Integer) workList.get(i);
            } 
        } catch(ClassCastException e) {
            System.out.println("Moo");
        }
    
   }
}