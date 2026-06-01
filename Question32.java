 import java.util.HashSet;
public class Question32 {
    public static void main(String[] args){
         HashSet<Integer>set = new HashSet<>();

         set.add(1);
         set.add(2);
         set.add(3);
    // search and contains

        if(set.contains(1)){
            System.out.println("set constains");
        }
        if(!set.contains(6)){
            System.out.println("does not contains");
        }
    }
}
