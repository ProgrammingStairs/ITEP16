// program showing the concept of String 

class Demo7{
    public static void main(String args[]){
        /*
        String s1 = "HELLO";
        String s2 = "hello";
        
        System.out.println("s1==s2 : "+(s1==s2));
        System.out.println("s1==s2.toUpperCase() : "+(s1==s2.toUpperCase()));
        */

        String s1 = "HELLO";
        String s2 = "hello";
        String s3 = s2.toUpperCase();
        System.out.println("s1 : "+s1); 
        System.out.println("s2 : "+s2); 
        System.out.println("s3 : "+s3); 

        System.out.println("s1==s2 : "+(s1==s2));
        System.out.println("s1==s3 : "+(s1==s3));
        System.out.println("s1==s3 : "+(s1==s3.intern()));
       
    }
}