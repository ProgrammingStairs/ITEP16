
public class Demo7 {
    public static void main(String[] args) {
        String str = "Hello User";
        byte bt[] = str.getBytes();
        for(byte b : bt){
            System.out.print(b+" ");
        }
        System.out.println("\n");
        char ch[] = str.toCharArray();
        for(char c : ch){
            System.out.print(c+" ");
        }
        
        String s1 = "abc@xy@z";
        int a = s1.indexOf("@");
        int b = s1.lastIndexOf("@");
        System.out.println("\na : "+a+" b : "+b);
        System.out.println((a==b) ? "Occurs Once" : "Occurs multiple times");
        
        String s2 = "How User How Are You";
        System.out.println("substring : "+s2.substring(2, 12));
        System.out.println("substring : "+s2.substring(2));
        System.out.println("matches : "+s2.matches("user"));

String s4 = "9876543445";
System.out.println("matches : "+s4.matches("[6789][0-9]{9}"));
String s5 = "345";
System.out.println("matches : "+s5.matches("\\d+"));
        
        System.out.println("matches : "+s2.matches("Hello User How are you"));
        System.out.println("endsWith : "+s2.endsWith("you"));
        System.out.println("startsWith : "+s2.startsWith("Hello"));
        
    }
}
