import java.util.Scanner;
public class Question2 {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        while( row <= n){
             int value = 1;
             while (value <= row){
                 System.out.println(value);
                 value++;

             }
        }
    }
}
