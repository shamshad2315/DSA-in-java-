import java.util.*;

public class Question28 {
    public static void main(String[]  args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> List = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List.add(sc.nextInt());
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            String operation = sc.next();

            if (operation.equals("insert")) {

                int index = sc.nextInt();
                int value = sc.nextInt();

                List.add(index,value );
            }else if(operation.equals("deletes")) {
                int index = sc.nextInt();
                List.remove(index);
            }
        }
        for( int num : List){
            System.out.println(num + " ");
        }
        sc.close();
    }
}
