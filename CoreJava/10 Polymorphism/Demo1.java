// example showing the concept of polymorphism 
// method overloading 
class Demo1{
    void greater(int a,int b){
        int res = a>b ? a : b;
        System.out.println("Greater Number : "+res);
    }
    void greater(int a,int b,int c){
        int res = a>b ? (a>c ? a : c) : (b>c ? b : c);
        System.out.println("Greater Number : "+res);
    }
    public static void main(String args[]){
        Demo1 obj = new Demo1();
        obj.greater(56,67);
        obj.greater(43,345,56);
    }
}

