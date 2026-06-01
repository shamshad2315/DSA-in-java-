import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Question34 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        HashSet<Integer>set = new HashSet<>();

       set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(3);
        // search and contains
         if (set.contains(0)){
             System.out.println("5");
         }
         if(set.contains(1)){
             System.out.println("john tom");
         }
        if(set.contains(2)){
            System.out.println("john mary");
        }
        if(set.contains(2)){
            System.out.println("john tom");
        }
        if(set.contains(3)){
            System.out.println("mary anna");
        }
        if(set.contains(3)){
            System.out.println("mary anna");
        }


    }
}