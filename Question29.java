import java.util.*;
public class Question29 {
    public static void main(String[] args ){
     // put the elements
        HashMap<String ,Integer> map = new HashMap<>();
        map.put("Shamshad",565865786);
        map.put("sammu", 56785769);
        map.put("harry ",300);

        String key = "sammu";

        if (map.containsKey(key)){
            System.out.println(key + "Found");
            System.out.println("value = "+ map.get(key));
        }else {
            System.out.println("Not Found ");
        }
 System.out.println();

        for (Map.Entry<String ,Integer> entry : map .entrySet() )

    System.out.println(
            "key= " + entry.getKey()
            +"value= " + entry.getKey()
    );
    }
}
