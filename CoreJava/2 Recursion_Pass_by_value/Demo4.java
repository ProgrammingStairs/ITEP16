// example

class Demo4{
    
    int a=100; // instance variable

    public static void main(String args[]){
        Demo4 obj1 = new Demo4();
        System.out.println("value of a(obj1) : "+obj1.a);
        obj1.a += 100;
        System.out.println("value of a(obj1) : "+obj1.a);
        
        Demo4 obj2 = new Demo4();
        System.out.println("value of a(obj2) : "+obj2.a);
        
    }
}