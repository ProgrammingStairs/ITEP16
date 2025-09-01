// example showing the concept of polymorphism 
// method overriding 

class Parent{
    void display(){
        System.out.println("display of parent called");
    }
}
class Child extends Parent{
    @Override // annotation
    void display(){
        System.out.println("display of child called");
    }
}
class Demo7{
    public static void main(String args[]){
        Child cobj = new Child();
        cobj.display();
    }
}