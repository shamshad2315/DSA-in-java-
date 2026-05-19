import java.sql.SQLOutput;

/*class Question10{
    void eat(){
        System.out.println("eating...");
    }
 }
 class Dog extends Question10 {
     void bark() {
         System.out.println("barking...");
     }
 }

     public static void main(String[] args) {
         Dog d = new Dog();
         d.bark();
         d.eat();
     }
 */
 /*interface Animal {
     void sound();   // abstract method
 }

  class   Dog implements Animal {
     public void sound() {
         System.out.println("Dog barks");
     }
 }

public class Question10 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}

  */
 /*class Animal{
     void eat(){
         System.out.println("eating...");
     }
 }
 class Dog extends Animal {
     void bark() {
         System.out.println("barking...");
     }
 }
 public class Question10 {
     public static void main(String[] args) {
         Dog d = new Dog();
         d.bark();
         d.eat();
     }
 }

  */
 // multilevel inheritance
 /*class Animal {
        void eat() {
            System.out.println("eating...");
        }
 }
    class Dog extends Animal {
        void bark() {
            System.out.println("barking...");
        }
 }
    class Puppy extends Dog {
        void weep() {
            System.out.println("weeping...");
        }
    }
 public class Question10 {
        public static void main(String[] args) {
            Dog d = new Dog();
            d.bark();
            d.eat();
            Puppy p = new Puppy();
            p.weep();
            p.bark();
            p.eat();
        }
    }*/
 // threading
 /*class MyThread extends Thread {
     public void run() {
         System.out.println("Thread chal raha hai");
     }

     public static void main(String[] args) {
         MyThread t = new MyThread();
         t.start();
     }
 }*/
 // Stoping a thread
 /*class MyThreading extends Thread{
     public void run (){
         while (!isInterrupted()){
             System.out.println("thread running ...");
         }
         System.out.println("Thread stopped ...");
     }
 }
  public class Question10 {
      public static void main(String[] args) throws InterruptedException {
          MyThreading t = new MyThreading();
          t.start();
          t.interrupt();
      }
  }*/
 //threads
/* class Mythreads extends Thread {
     public void run () {
         System.out.println(" thread is rinning ...");
     }
 }
 public class Question10 {
     public static void main(String[] args) {
          Mythreads mythreads = new Mythreads();
            mythreads.start();
     }
 }*/
// stopping a thread
/*class MyThread extends Thread {
    public void run (){
        while (!isInterrupted()){
            System.out.println("thread is running ...");
        }
        System.out.println("thread is stopped ...");
    }
}
public class Question10 {
    public static void main(String[] args ){
        MyThread t1 = new MyThread();
        t1.start();
        t1.interrupt();
    }
}
 */
// blocking a thread
class MyThread extends Thread {
    public void run() {
        try {
            System.out.println("thread is running ...");
            Thread.sleep(2000);
            System.out.println("thread is running after sleep ...");

        }
        catch (InterruptedException e) {
            System.out.println("thread is interrupted ...");
        }
    }}
public class Question10 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        t1.interrupt();
    }
}