// example showing the concept of super keyword

class Parent{
    Parent(int num){
        System.out.println("Parent class constructor invoked.. : "+num);
    }
}
class Child extends Parent{
    Child(int num,String name){
        super(num);
        System.out.println("Child class constructor invoked.. : "+name);
    }
}
class Demo6{
    public static void main(String args[]){
        new Child(101,"Jack Jackson");
    }
}