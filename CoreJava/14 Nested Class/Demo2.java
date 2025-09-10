// example showing the concept of nested class 
// static nested class 

class EnclosingClass{ // Enclosing class | Outer class
    static int num=100;
    private static String name = "Andrew Anderson";
    static class NestedClass{ // static Nested class 
        void display(){
            System.out.println("num : "+num);
            System.out.println("name : "+name);
        }
    }
}
class Demo2{
    public static void main(String args[]){
        EnclosingClass.NestedClass obj = new EnclosingClass.NestedClass();
        obj.display();
    }
}