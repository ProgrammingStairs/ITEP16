// example showing the concept of super keyword

class Parent{
    Parent(){
        System.out.println("Parent class constructor invoked..");
    }
}
class Child extends Parent{
}
class Demo7{
    public static void main(String args[]){
        new Child();
    }
}