// example showing the concept of interface
interface Showable extends Movable{
    void display();
}
interface Movable{
    void move();
}
class Demo6 implements Showable{
    @Override 
    public void display(){
        System.out.println("display method called");
    }
    @Override 
    public void move(){
        System.out.println("move method called");
    }
    public static void main(String args[]){
     Showable obj = new Demo6();
     obj.display(); 
     obj.move();
    }
}