//public class Question38 {
//    static void main() {
//
////        int n = 5;
////
////        for (int row = 0; row <= 4; row++) {
////            // for each row -> columns
////            for (int col = 0; col <= n; col++) {
////                System.out.print(" * ");
////            }
////            //move the next line or row
////            System.out.println();
////        }
////        int n = 3;
////         for( int row = 1 ; row <= n;row++) {
////
////
////                 System.out.print(" * ");
////             }
////             System.out.println();
//
////        int n =  5 ;
////
////        for( int row = 1;row <= n;row++){
////            // for each row
////             for(int col = 1; col <=  row ; col++ ) {
////
////                 System.out.print(" * ");
////             }
////             //moving the row
////            System.out.println();
////
////        }
//        int n = 5;
//         for(int row = 1 ; row <= n ;row++ ){
//
//             //space
//             for(int col = 1; col < n-row; col++) {
//                 System.out.print(" ");
//             }
//                 //star print
//                 for(int col = 1; col <= n ;col++){
//                     System.out.print(" * ");
//                 }
//                 System.out.println( );
//             }
//         }
//
//         }
//
//
public class Question38 {
    static void main() {
//int n = 5;
//
//for(int row = 1; row <= n ; row++) {
//
//    //for each row <- variable columns
//
//    for (int col = 1; col <= n - row + 1; col++) {
//
//        System.out.print(" * ");
//
//    }
//
//    System.out.println();
//
//}
//
//    }
//
// }
//
//
        int n = 5;

        for (int row = 1; row <= n; row++) {

            // spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            // stars
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}



