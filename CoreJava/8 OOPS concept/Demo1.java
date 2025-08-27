// Example 
class Parent{
    void show(){
        System.out.println("show method called");
    } 
}
class Child{
    void display(){
        System.out.println("display method called");
    } 
}
class Demo1{
    public static void main(String args[]){
        Child cobj = new Child();
        Parent pobj = new Parent();
            pobj.show();
            cobj.display();
    }
}