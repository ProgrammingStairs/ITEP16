// example showing the concept of interface

interface Showable{
    void display();
}
class Demo1 implements Showable{
    @Override 
    public void display(){
        System.out.println("display method called");
    }
    public static void main(String args[]){
     Demo1 obj = new Demo1();
     obj.display();   
    }
}