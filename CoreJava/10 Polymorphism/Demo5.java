// example showing the concept of polymorphism 
// method overloading // generates error
class Demo{
    int greater(int a,int b){
        return a>b ? a : b;
    }
    double greater(int a,int b){
        return a>b ? a : b; 
    }
}
class Demo5{
    public static void main(String args[]){
        Demo obj = new Demo();
        System.out.println("Greater Number : "+obj.greater(56,67));
        System.out.println("Greater Number : "+obj.greater(434,6));
    }
}

