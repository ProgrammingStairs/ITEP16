// program showing the concept of String 

class Demo6{
    public static void main(String args[]){
        String s1 = "Hello";
        System.out.println("upperCase : "+s1.toUpperCase());
        System.out.println("lowerCase : "+s1.toLowerCase());
        System.out.println("length : "+s1.length());
        System.out.println("equals : "+s1.equals("HeLLo"));
        System.out.println("equalsIgnoreCase : "+s1.equalsIgnoreCase("HeLLo"));
        System.out.println("charAt(0) : "+s1.charAt(0));
    
        String s2 = "            Hello          Welcome           ";
        System.out.println("s2 : "+s2);
        System.out.println("trim : "+s2.trim());

        s1.concat(" Andrew");
        System.out.println("concat : "+s1);
        System.out.println("concat : "+s1.concat(" Andrew"));

    }
}