// Example showing the concept  without Generic class

public class Demo9 {
    public static void main(String[] args) {
        int a = 5, b=6,temp;
        System.out.println("Before Swapping : \na : "+a+"\nb : "+b);
        temp = a;
        a=b;
        b=temp;
        System.out.println("After Swapping : \na : "+a+"\nb : "+b);
        
        double a1 = 5.2, b1=6.2,temp1;
        System.out.println("Before Swapping : \na : "+a1+"\nb : "+b1);
        temp1 = a1;
        a1=b1;
        b1=temp1;
        System.out.println("After Swapping : \na : "+a1+"\nb : "+b1);
        
        char a2 = 'x', b2='y',temp2;
        System.out.println("Before Swapping : \na : "+a2+"\nb : "+b2);
        temp2 = a2;
        a2=b2;
        b2=temp2;
        System.out.println("After Swapping : \na : "+a2+"\nb : "+b2);
        
    }
}
