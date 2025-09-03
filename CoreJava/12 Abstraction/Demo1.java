// example showing the concept of abstract class 

abstract class AbstractClass{
    abstract void display();
}
class AnotherClass extends AbstractClass{
    @Override
    void display(){
        System.out.println("display method called");
    }
}
class Demo1{
    public static void main(String args[]){
        AnotherClass obj = new AnotherClass();
        obj.display();
    }
}