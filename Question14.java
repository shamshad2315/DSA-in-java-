///*class parent {
//    void show (){
//        System.out.println("this is parent class ");
//    }
//}
//class child extends parent{
//    void show (){
//        System.out.println("this is child class ");
//    }
//}
//public class Question14 {
//    public static void main(String[] args) {
//        parent  obj = new parent();
//        obj.show ();
//    }
//}
//
//
// */
///*class Animal {
//    void eat(){
//        System.out.println("eating...");
//    }
//}
//class Dog extends Animal {
//    void brack(){
//        System.out.println("eating...");
//    }
//}
//class Cat extends Animal{
//    void  meow (){
//        System.out.println("meow...");
//    }
//}
//public class Question14 {
//    public static void main(String[] args) {
//        Dog d = new Dog();
//        Cat c = new Cat();
//        d.eat();
//        d.brack();
//        c.eat();
//        c.meow();
//    }
//}
//
// */
///*interface A {
//    void show ();
//}
//interface B {
//    void display ();
//}
//class c implements A,B {
//    public void show() {
//        System.out.println("this is show method");
//    }
//    public void display() {
//        System.out.println("this is display method");
//    }
//}
//public class Question14 {
//    public static void main(String[] args) {
//        c obj = new c();
//        obj.show();
//        obj.display();
//    }
//}
//
// */
///*class Animal {
//
//    protected void sound() {
//        System.out.println("Animal Sound");
//    }
//}
//
//class Dog extends Animal {
//
//    void bark() {
//        sound();
//    }
//}
//public class Question14 {
//    public static void main(String[] args) {
//        Animal a = new Animal();
//        Dog d = new Dog();
//        a.sound(); // Output: Animal Sound
//        d.bark();    // Output: Animal Sound
//    }
//}
//
//
// */
///*class Demo {
//
//    private int x = 10;
//
//    void show() {
//        System.out.println(x);
//    }
//}
//class dod  extends Demo {
//    void display(){
//        System.out.println(x);
//    }
//}
//
//public class Question14 {
//    public static void main(String[] args) {
//
//        Demo d = new Demo();
//
//        d.show();
//    }
//}
//
// */
//class Student {
//
//    int id;
//    String name;
//
//    Student() {
//        id = 101;
//        name = "Student";
//    }
//
//     void display() {
//         System.out.println("id: " + id);
//         System.out.println("name: " + name);
//    }
//}
//
//public class Question14 {
//    public static void main(String[] args) {
//
//        Student s1 = new Student();
//    }
//}
   // method overloading

class Animal {
    void sound() {

        System.out.println("Animal makes a sound...");
    }
}
class dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks...");
    }
}
public class Question14 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();
        dog dog = new dog();
        dog.sound();
    }
}