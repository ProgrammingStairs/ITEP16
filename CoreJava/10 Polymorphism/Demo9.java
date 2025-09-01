// example showing the concept of polymorphism 
// method overriding 

class RBI{
    double rate(){
        return 1.0;
    }
}
class BOI extends RBI{
    @Override
    double rate(){
        return 1.34;
    }
}
class PNB extends RBI{
    @Override
    double rate(){
        return 3.32;
    }
}
class SBI extends RBI{}

class Demo9{
    public static void main(String args[]){
        BOI bobj = new BOI();
        PNB pobj = new PNB();
        SBI sobj = new SBI();
            System.out.println("Rate by BOI : "+bobj.rate());
            System.out.println("Rate by PNB : "+pobj.rate());
            System.out.println("Rate by SBI : "+sobj.rate());
    }
}