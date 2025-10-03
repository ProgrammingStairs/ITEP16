// program showing the concept of String 

class Demo1{
    public static void main(String args[]){
        // string literal
        String s1 = "Hello";
        System.out.println("s1 : "+s1);

        // by new keyword
        String s2 = new String("Hello");
        System.out.println("s2 : "+s2);

        char ch[] = {'H','e','l','l','o'};
        String s3 = new String(ch);
        System.out.println("s3 : "+s3);

        byte d1[] = {65,66,67,68,69};
        String s4 = new String(d1);
        System.out.println("s4 : "+s4);
        
        String s5 = new String(); // String s5 = "";
        System.out.println("s5 : "+s5);
    }
}