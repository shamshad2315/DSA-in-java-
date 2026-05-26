
 import java.util.ArrayList;
 import java.util.Collections;

public class Question24 {
public static void main(String[] args){
    ArrayList<Integer> List = new ArrayList<>();
    //add elements
    List.add(0);
    List.add(2);
    List.add(3);
    List.add(5);

    System.out.println(List);

    // set elements
    List.set(0, 4);
     System.out.println(List);
     //delete elements
    List.remove(1);
    System.out.println(List);

    //Size elements
    int size = List.size();
    System.out.println(size);

    //loops elements
    for(int i =0 ;i<List.size(); i++){
         System.out.println(List.get(i));
    }
    System.out.println();

    //sorting elements
    Collections.sort(List);
    System.out.println(List);
}
}
