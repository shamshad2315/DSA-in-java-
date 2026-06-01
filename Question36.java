// Generics Topics
import java.util.ArrayList;
import java.util.List;

public class Question36 {

    public static void main(String[] args ){

        List l = new ArrayList();

        l.add(23);
        l.add(24);
        l.add(55);

        System.out.println(l);
        int m = (int)l.get(0);

        System.out.println(m);
    }

}
