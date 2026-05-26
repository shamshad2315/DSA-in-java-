import java.util.*;

public class  Question26 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>>List = new ArrayList<>();

        for(int i =0; i<n;i++){
            int d = sc.nextInt();

            ArrayList<Integer> row = new ArrayList<>();
            for(int j = 0 ; j<d; j++){
                row.add(sc.nextInt());
            }
            List.add(row);
        }
        int q = sc.nextInt();
        for(int i= 0;i<q;i++){

            int x = sc.nextInt();
            int y = sc.nextInt();

            try{
                System.out.println(List.get(x - 1).get(y -1));
            }catch(Exception e){
                System.out.println("Error");
            }
        }
        sc.close();
    }
}