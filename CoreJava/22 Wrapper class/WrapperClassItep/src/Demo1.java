// Example showing the concept of Wrapper class

public class Demo1 {
    public static void main(String[] args) {
        // converting primitive datatype into object
        //Integer obj = Integer.valueOf(100); // here 100 is primitive datatype, obj is object
        Integer obj = new Integer(100); // here 100 is primitive datatype, obj is object
        System.out.println("obj : "+obj);
        System.out.println("obj : "+obj.getClass().getName());
        
        // converting object into primitive datatype 
        int num = obj.intValue();
        System.out.println("num : "+num);
    }
}
