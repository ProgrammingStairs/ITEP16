// example showing the concept of polymorphism 
// method overloading 
class Demo{
    void greater(int a,int b){
        int res = a>b ? a : b;
        System.out.println("Greater Number : "+res);
    }
    void greater(double a,double b){
        double res = a>b ? a : b;
        System.out.println("Greater Number... : "+res);
    }
}
class Demo2{
    public static void main(String args[]){
        Demo obj = new Demo();
        obj.greater(5.6,6.7);
        obj.greater(43,56);
    }
}

