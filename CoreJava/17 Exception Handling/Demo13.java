// example showing the concept of custom exception
// custom exception through checked exception

import java.util.Scanner;
class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String message){
        super(message);
    }
}
class Bank{
    int bal;
    Bank(int bal){
        this.bal=bal;
    }
    void withdraw() throws InsufficientBalanceException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter withdraw amount : ");
        int wamt = sc.nextInt();
        if(wamt>bal){
            throw  new InsufficientBalanceException("Low Balance");
        }else{
            System.out.println("Balance : "+bal);
            System.out.println("WithDraw Amount : "+wamt);
            System.out.println("Remaining Balance : "+(bal-wamt));
        }
    }
}
class Demo13{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter balance : ");
        int bal = sc.nextInt();

        Bank obj = new Bank(bal);
        try{
            obj.withdraw();
        }catch(InsufficientBalanceException e){
            System.out.println("Exception : "+e.getMessage());
        }finally{
            System.out.println("End of program");
        }
    }
}