// example showing the concept of interface

interface Movable{
    void display();
}
@FunctionalInterface
interface Showable extends Movable{
    void display();
}
class Demo21 implements Showable{
    @Override
    public void display(){
        System.out.println("display method called...");
    }
    public static void main(String args[]){
      Showable obj = new Demo21();
      obj.display();
    }
}