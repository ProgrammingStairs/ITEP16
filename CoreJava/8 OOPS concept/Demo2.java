// Example showing the concept of Inheritance
class Parent{ // parent class
    void show(){
        System.out.println("show method called");
    } 
}
class Child extends Parent{   // child class
    void display(){
        System.out.println("display method called");
    } 
}
class Demo2{
    public static void main(String args[]){
        Child cobj = new Child();
        cobj.display();
        cobj.show();
    }
}