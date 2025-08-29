// example showing the concept of Mulltilevel inheritance

class Account{
    int actNo;
    String actHolderName;
    Account(int actNo,String actHolderName){
        this.actNo = actNo;
        this.actHolderName = actHolderName;
    }
    void getAccountDetails(){
        System.out.println("Account Number : "+actNo);
        System.out.println("Account Holder Number : "+actHolderName);
    }
}
class Balance extends Account{
    int bal;
    Balance(int actNo,String actHolderName,int bal){
        super(actNo,actHolderName);
        this.bal=bal;
    }
    void getBalance(){
        getAccountDetails();
        System.out.println("\nBalance : "+bal);
    }
}
class Transaction extends Balance{
    int wamt,damt;
    Transaction(int actNo,String actHolderName,int bal,int damt,int wamt){
        super(actNo,actHolderName,bal);
        this.damt=damt;
        this.wamt=wamt;
    }
    void display(){
        getBalance();
        this.bal += damt;
        System.out.println("Balance After deposit amount of Rs."+damt+" is : "+bal);
        bal -= wamt;
        System.out.println("Balance After withdrawal amount of Rs."+wamt+" is : "+bal);
    }
}
class Demo4{
    public static void main(String args[]){
        Transaction obj = new Transaction(1110012,"Peter Parker",10000,2500,7600);
        obj.display();
    }
}