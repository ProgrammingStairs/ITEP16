// example showing the concept of polymorphism 
// method overriding + Upcasting  = Run time polymorphism

class Parent{
    String name = "Andrew Anderson";
    void display(){
        System.out.println("display of parent called");
    }
    void show(){
        System.out.println("show method called");
    }
}
class Child extends Parent{
    String name = "Jack Jackson";
   @Override
    void display(){
        System.out.println("display of child called ");
    }
    void draw(){
        System.out.println("draw method called");
    }
}
class Demo11{
    public static void main(String args[]){
        Parent cobj = new Child(); // upcasting 
        System.out.println("parent name : "+cobj.name);
        cobj.display();
        cobj.show();
        Child c = (Child)cobj; // downcasting
        System.out.println("child name : "+c.name);
        c.draw();
    }
}