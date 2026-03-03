package pattern;

public class Question8 {          // no extra space before name
    public static void main(String[] args) {

        for(int i = 1; i <= 4; i++) {   // 4 rows
            for(int j = 1; j <= i; j++) {
                System.out.print(i);    // print same number
            }
            System.out.println();
        }

    }
}
