// example showing the concept of interface

interface Movable{
    default void display(){
        System.out.println("display method called");
    }
    static void show(){
        System.out.println("show method called");
    }
}
class Demo16 implements Movable{
    public static void main(String args[]){
      Movable obj = new Demo16();
      obj.display();
      Movable.show();
    }
}