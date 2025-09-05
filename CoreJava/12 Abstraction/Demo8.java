// example showing the concept of method overriding 

class Parent{
    static void display(){
        System.out.println("display method of parent called");
    }
}
class Child extends Parent{
    @Override
    static void display(){
        System.out.println("display method of child called");
    }
}
class Demo8{
    public static void main(String args[]){
        Child obj = new Child();
        obj.display();
   } 
}