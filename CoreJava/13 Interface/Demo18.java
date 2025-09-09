// example showing the concept of interface
// this example needs jdk 9 (jdk 1.9 or above)
interface Movable{
    default void display(){
        System.out.println("display method called");
        show1();
        show2();
    }
    static void show1(){
        System.out.println("show1 method called");
        Movable obj = new Movable(){};
        printData();
    }
    static void show2(){
        System.out.println("show2 method called");
        printData();
    }
    static private void printData(){
        System.out.println("statement 1");
        System.out.println("statement 2");
        System.out.println("statement 3");
    }
}
class Demo18 implements Movable{
    public static void main(String args[]){
      Movable obj = new Demo18();
      obj.display();
    }
}