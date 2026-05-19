//public class Question9 {
//    void add(int x, int y) {
//        System.out.println(x + y);
//    }
//    public static void main(String[] args) {
//        Question9 obj = new Question9();
//        obj.add(5, 3);
//    }
//}
//public class Question9 {
//
//    void add()
//    {
//        int a= 10;
//         int b =11;int c;
//          c = a+b;
//        System.out.println(c);
//    }
//    void add( int x, int y ){
//      int c =x+y;
//        System.out.println(c);
//
//    }
//    void add (int x , double y){
//        double c;
//        c = x +y;
//        System.out.println(c);
//    }
//
//    public static void main(String[] args) {
//        Question9 r = new Question9();
//        r.add();
//        r.add(10,30);
//        r.add(5, 39.7);
//    }
//}
public static class Question9 {
        void show() {
            System.out.println("first  number");
        }
    }
    class boy extends Question9 {
        void show() {
            System.out.println("second number");
        }
    }
        public static void main(String[] args) {
            Question9 obj = new Question9();
            obj.show();
        }

