// example showing the concept of interface
interface Showable{
    void display();
}
abstract class Movable{
    abstract void move();
}
class Demo7 extends Movable implements Showable{
    @Override 
    public void display(){
        System.out.println("display method called");
    }
    @Override 
    public void move(){
        System.out.println("move method called");
    }
    public static void main(String args[]){
     Showable obj = new Demo7();
     obj.display(); 
     Movable obj1 = new Demo7();
     obj1.move();
    }
}