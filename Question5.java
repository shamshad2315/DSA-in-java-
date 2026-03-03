package pattern;

public class Question5 {
    public static void main(String[] args) {
        int nums = 1;
        for(int i = 1; i <= 4; i++) {   // 4 rows
            for(int j = 1; j <= 4; j++) {
                System.out.print(nums + " ");
                nums++;
            }
            System.out.println();   // next line        
    }
    
}
}
