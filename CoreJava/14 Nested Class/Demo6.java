// example showing the concept of nested class 
// non-static nested class | local class

class EnclosingClass{
    void show(){
        class NestedClass1{  // local class
            void display(){
                System.out.println("display method called");
            }
        }
        NestedClass1 obj = new NestedClass1();
        obj.display();
    }
}
class Demo6{
    public static void main(String args[]){
        EnclosingClass obj = new EnclosingClass();
        obj.show();
    }
}