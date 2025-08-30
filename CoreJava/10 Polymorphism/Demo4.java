// example showing the concept of polymorphism 
// Constructor overloading 
class Demo{
    Demo(int a,int b){
        int res = a>b ? a : b;
        System.out.println("Greater Number : "+res);
    }
    Demo(double a,double b){
        double res = a>b ? a : b;
        System.out.println("Greater Number... : "+res);
    }
}
class Demo4{
    public static void main(String args[]){
        new Demo(5.6,6.7);
        new Demo(43,56);
    }
}


