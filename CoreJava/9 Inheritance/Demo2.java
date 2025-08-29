// example showing the concept of Mulltilevel inheritance

class GrandParent{
    GrandParent(){
        System.out.println("GrandParent constructor called");
    }
    void show(){
        System.out.println("show method called of grand parent");
    }
}
class Parent extends GrandParent{
    Parent(){
        // super();
        System.out.println("Parent constructor called");
    }
    void show(){
        super.show();
        System.out.println("show method called of parent");
    }
}
class Child extends Parent{
    Child(){
        // super();
        System.out.println("Child constructor called");
    }
    void display(){
        show();
    }
}
class Demo2{
   public static void main(String args[]){
        // new GrandParent();
        // new Parent();
        Child cobj = new Child();
        cobj.display();
   }
}