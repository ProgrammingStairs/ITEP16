// example showing the concept of abstract class 

abstract class RBI{
    int rno=100;
    abstract double rate();
}
class SBI extends RBI{
    @Override
    double rate(){
        return 1.23;
    }
}
class BOI extends RBI{
    @Override
    double rate(){
        return 3.23;
    }
}
class PNB extends RBI{
    @Override
    double rate(){
        return 2.04;
    }
}

class Demo4{
    public static void main(String args[]){
        RBI obj;
        obj = new SBI();
        System.out.println("Rate of interest by SBI : "+obj.rate()+"\t"+obj.rno);
        obj = new BOI();
        System.out.println("Rate of interest by BOI : "+obj.rate());
        obj = new PNB();
        System.out.println("Rate of interest by PNB : "+obj.rate());
    }
}