// example showing the concept of static block

class Demo6{
    // static block 
    static{
        System.out.println("static block - I");
    }
    public static void main(String args[]){
        System.out.println("main method executes");
    }
    // static block 
    static{
        System.out.println("static block - II");
    }
}