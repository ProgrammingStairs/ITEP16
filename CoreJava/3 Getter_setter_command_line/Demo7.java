// example 

class Demo7{
    void test(int a,int b){
        System.out.println("Sum : "+(a+b));
    }
    void test(int a,int b,int c){
        System.out.println("Sum : "+(a+b+c));
    }
    void test(int a,int b,int c,int d){
        System.out.println("Sum : "+(a+b+c+d));
    }
    void test(int a,int b,int c,int d,int e){
        System.out.println("Sum : "+(a+b+c+d+e));
    }
    public static void main(String args[]){
        Demo7 obj = new Demo7();
        obj.test(1,2);
        obj.test(1,2,3);
        obj.test(1,2,3,4);
        obj.test(1,2,3,4,5);
    }
}