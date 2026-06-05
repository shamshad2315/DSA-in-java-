public class Question41 {
     public static void main(String[] args){
          //problem *
       //           * *
          //        * . *
            //      * . . *
        //          * * * *


      // solve

         int rows = 5 ;
         int cols = 4;

         for(int row = 1; row <= rows;row++ ){
             //for each rows
             for (int col = 1;col <=cols;col++){
                 System.out.print(" *");
             }
         }
     }
}
