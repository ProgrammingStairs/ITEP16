// Example showing the concept of Wrapper class

import java.util.Scanner;
public class Demo8 {
    static void validateMobileNumber(String number){
        boolean status = true;
        if(number.length()==10){
            char first = number.charAt(0);
            if(first>='6' && first<='9'){     
                for(int i=0;i<10;i++){
                    char ch = number.charAt(i);
                    if(!Character.isDigit(ch)){
                        status=false;
                        break;
                    }
                }
           }else
                status = false;
        }else
                status = false;
        
        String res = status ? "Valid Mobile Number" : "Invalid Mobile Number";
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10-digit Mobile Number");
        String number = sc.next();
        validateMobileNumber(number);
    }
}
