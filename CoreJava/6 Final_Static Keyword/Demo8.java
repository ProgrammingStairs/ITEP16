// example showing the concept of static variable
class Demo{
    // static variable 
    static String name = "Peter Parker";
}
class Demo8{
    // static variable 
    static String name = "Jack jackson";
    public static void main(String args[]){
        System.out.println("name : "+Demo8.name);
        System.out.println("name : "+name);
        System.out.println("name : "+Demo.name);
    }
}