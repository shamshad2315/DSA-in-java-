 public class Question40 {

     public static void main(String[] args) {
         //problem  * * * * * *
         //          *         *
         //          *         *
         //          * * * * * *
         // solve
         int rows = 4;
         int cols = 6;
         //  for each rows
         for (int row = 1; row <= rows; row++) {
             //for each cols

             int col;
             for (col = 1; col <= cols; col++) {
                 System.out.print(" ");

                 if (row == 1 || row == 4 || col == 1 || col == 6) {
                     System.out.print("*");
                 } else {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }

     }
 }
