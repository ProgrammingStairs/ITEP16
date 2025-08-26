// example showing the concept of Singleton class 
// Lazy initialization
class Singleton{
    static private Singleton instance;
    private Singleton(){}
    static Singleton getInstance(){
        System.out.println("-------------> 1 ");
        if(instance==null){
            System.out.println("-------------> 2 ");
            instance = new Singleton();
        }
        return instance;
    }
    int a = 100;
    static void display(){
        System.out.println("created object : "+instance);
    }
} 
class Demo3{
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