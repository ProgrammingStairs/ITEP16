// Example showing the concept of Generic class

public class Demo10<DT> { // generic class
    void swap(DT a,DT b){
            DT temp;
            temp=a;
            a=b;
            b=temp;
            System.out.println("After Swapping : \na : "+a+"\nb : "+b);
    }
    public static void main(String[] args) {
        int a = 5, b=6;
        Demo10<Integer> obj = new Demo10<>();
        System.out.println("Before Swapping : \na : "+a+"\nb : "+b);
        obj.swap(a, b);
        
        double a1 = 5.2, b1=6.2;
        Demo10<Double> obj1 = new Demo10<>();
        System.out.println("Before Swapping : \na : "+a1+"\nb : "+b1);
        obj1.swap(a1,b1);
        
        char a2 = 'x', b2='y';
         Demo10<Character> obj2 = new Demo10<>();
        System.out.println("Before Swapping : \na : "+a2+"\nb : "+b2);
        obj2.swap(a2,b2);
    }
}
