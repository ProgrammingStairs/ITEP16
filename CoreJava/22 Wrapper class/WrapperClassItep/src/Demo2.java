// Example showing the concept of Wrapper class

public class Demo2 {
    public static void main(String[] args) {
        // converting primitive datatype into object
        Integer obj = 100; // autoboxing
        System.out.println("obj : "+obj);
        System.out.println("obj : "+obj.getClass().getName());
        
        // converting object into primitive datatype 
        int num = obj; // unboxing
        System.out.println("num : "+num);
    }
}
