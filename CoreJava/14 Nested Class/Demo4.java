// example showing the concept of nested class 
// non-static nested class 

class EnclosingClass{ // Enclosing class | Outer class
    static int num=100;
    private static String name = "Andrew Anderson";
    int pincode = 452010;
    class NestedClass{ // non-static Nested class 
        void display(){
            System.out.println("num : "+num);
            System.out.println("name : "+name);
            System.out.println("pincode : "+pincode);
        }
    }
}
class Demo4{
    public static void main(String args[]){
        EnclosingClass.NestedClass obj1 = new EnclosingClass().new NestedClass();
        obj1.display();
    }
}