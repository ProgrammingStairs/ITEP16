// example showing the concept of polymorphism 
// method overloading 
class Demo{
    double greater(int a,double b){
        return a>b ? a : b;
    }
    double greater(double a,int b){
        return a>b ? a : b; 
    }
}
class Demo3{
    public static void main(String args[]){
        Demo obj = new Demo();
        System.out.println("Greater Number : "+obj.greater(56,6.7));
        System.out.println("Greater Number : "+obj.greater(43.4,6));
    }
}

