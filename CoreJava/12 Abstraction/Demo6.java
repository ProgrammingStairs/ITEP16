// example showing the concept of abstract class 

import java.util.Scanner;
abstract class RBI{
    RBI(){
        System.out.println("\n######### Welcome to Bank ##########");
    }
    abstract double rate();
    double finalSum(int bal,double rate){
        return bal + bal * rate/100;
    }
}
class BOI extends RBI{
    @Override
    double rate(){
        return 3.32;
    }
}
class SBI extends RBI{
    @Override
    double rate(){
        return 2.13;
    }
}
class PNB extends RBI{
    @Override
    double rate(){
        return 1.45;
    }
}

class Demo6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter balance : ");
        int bal = sc.nextInt();
        RBI obj;
            obj = new BOI();
            System.out.println("Rate provided by BOI : "+obj.rate());
            System.out.println("Final Sum by BOI : "+obj.finalSum(bal,obj.rate()));

            obj = new SBI();
            System.out.println("Rate provided by SBI : "+obj.rate());
            System.out.println("Final Sum by SBI : "+obj.finalSum(bal,obj.rate()));
            
            obj = new PNB();
            System.out.println("Rate provided by PNB : "+obj.rate());
            System.out.println("Final Sum by PNB : "+obj.finalSum(bal,obj.rate()));
        
    }
}