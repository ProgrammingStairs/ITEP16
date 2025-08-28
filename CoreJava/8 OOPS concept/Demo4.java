// example showing the concept of super keyword

class Parent{
    String name = "Peter Parker";
    void display(){
      System.out.println("Parent name : "+name);
    }
}
class Child extends Parent{
    String name = "Andrew Anderson";
    void display(){ 
        System.out.println("Child name : "+name);
    }
    void show(){
        display();
        super.display();
    }
}
class Demo4{
    public static void main(String args[]){
        Child cobj = new Child();
        cobj.show();
    }
}