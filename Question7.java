package pattern;
       
public class Question7 {
   
    public static void main(String[] args) {
int nums = 1;
        System.out.println("Enter the number of rows:" );
        for (int i =1 ; i <=4; i++){
            for (int j =1; j<= i; j++){
                System.out.print(nums + " ");
                nums++;
            }
            System.out.println();
        }

    }
}
