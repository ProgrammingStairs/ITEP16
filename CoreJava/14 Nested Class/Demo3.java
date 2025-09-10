// example showing the concept of nested class 
// non-static nested class 

class Demo3{ // Enclosing class | Outer class
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
    public static void main(String args[]){
        // Demo3 obj = new Demo3();
        // NestedClass obj1 = obj.new NestedClass();

        NestedClass obj1 = new Demo3().new NestedClass();
        obj1.display();
    }
}