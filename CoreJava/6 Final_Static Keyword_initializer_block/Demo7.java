// example showing the concept of static block

class Demo{
    // static block 
    static{
        System.out.println("static block - II");
    }
}
class Demo7{
    // static block 
    static{
        System.out.println("static block - I");
    }
    public static void main(String args[]){
        System.out.println("main method executes");
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
        Demo obj3 = new Demo();
    }
}