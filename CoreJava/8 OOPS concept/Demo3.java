// example showing the concept of super keyword

class Parent{
    String name = "Peter Parker";
}
class Child extends Parent{
    String name = "Andrew Anderson";
    void display(){ 
        System.out.println("Child name : "+name);
        System.out.println("Parent name : "+super.name);
    }
}
class Demo3{
    public static void main(String args[]){
        Child cobj = new Child();
        cobj.display();
    }
}