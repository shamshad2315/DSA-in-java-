package pattern;
import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {   // n rows
            for(int j = 1; j <= n; j++) {   // print 123…
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();                    // close scanner
    }
}