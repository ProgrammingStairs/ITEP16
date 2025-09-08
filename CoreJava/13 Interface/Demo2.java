// example showing the concept of interface

interface Showable{
    void display();
}
class Demo2 implements Showable{
    @Override 
    public void display(){
        System.out.println("display method called");
    }
    public static void main(String args[]){
     Showable obj = new Demo2();
     obj.display();   
    }
}