// example showing the concept of super keyword

class Parent{
    Parent(){
        System.out.println("Parent class constructor invoked..");
    }
}
class Child extends Parent{
    Child(){
        super();
        System.out.println("Child class constructor invoked..");
    }
}
class Demo5{
    public static void main(String args[]){
        new Child();
    }
}