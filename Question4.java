package pattern;
 import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {   // 3 rows
            for(int j = 1; j <= n; j++) {   // print 123
                System.out.print(n-j+1);
            }
            System.out.println();   // next line
        }
    }
    
}
