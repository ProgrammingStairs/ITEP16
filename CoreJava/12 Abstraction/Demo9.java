// example showing the concept of method overriding 

class Parent{
    void display(){
        System.out.println("display method of parent called");
    }
}
class Child extends Parent{
    @Override
    public void display(){
        System.out.println("display method of child called");
    }
}
class Demo9{
    public static void main(String args[]){
        Child obj = new Child();
        obj.display();
   } 
}