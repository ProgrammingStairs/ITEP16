// example showing the concept of static
class Demo10{
    static int b=200;
    static int c;
    static{
        int a = 100;
        c = 300;
        System.out.println("value of a : "+a);
        System.out.println("value of b : "+b);
    }
    public static void main(String args[]){
        System.out.println("main method called : "+b);
        System.out.println("main method called : "+c);
    }
}