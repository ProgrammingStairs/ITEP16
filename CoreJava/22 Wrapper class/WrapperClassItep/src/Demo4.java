// Example showing the concept of Wrapper class

public class Demo4 {
    public static void main(String[] args) {
        Integer obj1 = Integer.valueOf("100");
        Integer obj2 = Integer.valueOf("200");
        System.out.println("obj1 : "+obj1);
        System.out.println("obj2 : "+obj2);
        System.out.println("sum : "+(obj1+obj2));
        
        Integer obj3 = Integer.valueOf("101",3);
        System.out.println("obj3 : "+obj3);
        
        
//        1 x 2^2 + 0 x 2^1 + 1 x 2 ^ 0
//        1 x 4 + 0 + 1 x 1
//        4 + 0 + 1
//        5

//        1 x 3^2 + 0 x 3^1 + 1 x 3 ^ 0
//        1 x 9 + 0 + 1 x 1
//        9 + 0 + 1
//        10

    }
}
