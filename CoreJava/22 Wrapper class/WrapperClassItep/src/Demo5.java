// Example showing the concept of Wrapper class

public class Demo5 {
    public static void main(String[] args) {
    /*
        String s1 = Integer.toString(100);
        Integer obj = 200;
        String s2 = obj.toString();
        System.out.println("Result : "+(s1+s2));
    */
    
        String s1 = Double.toString(100.45);
        Double obj = 20.560;
        String s2 = obj.toString();
        System.out.println("Result : "+(s1+s2));
        System.out.println("Result : "+(Double.parseDouble(s1)+Double.parseDouble(s2)));
    
        String s3 = Character.toString('a');
        System.out.println("s3 : "+s3);
        
//        Boolean.parseBoolean("true");
    }
}
