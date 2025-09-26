// example showing the concept of Thread - Inter thread communication

class Customer{
    int bal;
    Customer(int bal){
        this.bal=bal;
    }
    synchronized void withdraw(int wamt){
        try{
            if(wamt>bal){
                System.out.println("Low Balance.. Waiting for Deposit...");
                wait();
            }
            System.out.println("Balance : "+bal);
            System.out.println("Withdraw amount : "+wamt);
            System.out.println("Remaining Balance : "+(bal-wamt));
        }catch(InterruptedException e){
            System.out.println("Exception : "+e);
        }
    }
    synchronized void deposit(int damt){
        System.out.println("Going to deposit..");
        this.bal += damt;
        System.out.println("Amount deposited.. Now you can withdraw");
        notify();
    }
}
class Demo16{
    public static void main(String args[]){
        int balance = 10000;
        int wamt = 15000;
        int damt = 35000;

        Customer cobj = new Customer(balance);
        Thread th = new Thread(){
            @Override
            public void run(){
                cobj.withdraw(wamt);
            }
        };
        th.start();
        if(wamt>balance){
            Thread th1 = new Thread(){
                @Override
                public void run(){
                    cobj.deposit(damt);
                }
            };
            th1.start();
        }
        
    }
}
