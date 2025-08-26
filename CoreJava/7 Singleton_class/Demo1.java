// example showing the concept of Singleton class 
// Eager initialization
class Singleton{
    static final private Singleton instance = new Singleton();
    private Singleton(){}
    static Singleton getInstance(){
        return instance;
    }
    int a = 100;
    static void display(){
        System.out.println("created object : "+instance);
    }
} 
class Demo1{
    public static void main(String args[]){
        Singleton.display();
        Singleton obj = Singleton.getInstance();
        System.out.println("Value of a : "+obj.a);
        obj.a += 200;
        System.out.println("Value of a : "+obj.a);

        Singleton objNew = Singleton.getInstance();
        System.out.println("Value of a : "+objNew.a);
    }
}