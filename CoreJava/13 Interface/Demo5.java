// example showing the concept of interface
interface Showable{
    void display();
}
interface Movable{
    void move();
}
class Demo5 implements Showable,Movable{
    @Override 
    public void display(){
        System.out.println("display method called");
    }
    @Override 
    public void move(){
        System.out.println("move method called");
    }
    public static void main(String args[]){
     Showable obj = new Demo5();
     obj.display();   
     Movable obj1 = new Demo5();
     obj1.move();
    }
}