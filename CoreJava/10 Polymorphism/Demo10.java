// example showing the concept of polymorphism 
// method overriding + Upcasting  = Run time polymorphism

class Parent{
    void display(){
        System.out.println("display of parent called");
    }
}
class Child extends Parent{
   @Override
    void display(){
        System.out.println("display of child called");
    }
}
class Demo10{
    public static void main(String args[]){
        Parent cobj = new Child(); // upcasting 
        cobj.display();
    }
}