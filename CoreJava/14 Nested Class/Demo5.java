// example showing the concept of nested class 
// non-static nested class | member class

class EnclosingClass{
    void show(){
        NestedClass obj = new NestedClass();
        obj.display();
    }
    class NestedClass{  // member class
        void display(){
            System.out.println("display method called");
        }
    }
}
class Demo5{
    public static void main(String args[]){
        EnclosingClass obj = new EnclosingClass();
        obj.show();
    }
}