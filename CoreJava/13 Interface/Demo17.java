// example showing the concept of interface

interface Movable{
    default void display(){
        System.out.println("display method called");
        show1();
        show2();
    }
    static void show1(){
        System.out.println("show1 method called");
        System.out.println("statement 1");
        System.out.println("statement 2");
        System.out.println("statement 3");
    }
    static void show2(){
        System.out.println("show2 method called");
        System.out.println("statement 1");
        System.out.println("statement 2");
        System.out.println("statement 3");
    }
}
class Demo17 implements Movable{
    public static void main(String args[]){
      Movable obj = new Demo17();
      obj.display();
    }
}