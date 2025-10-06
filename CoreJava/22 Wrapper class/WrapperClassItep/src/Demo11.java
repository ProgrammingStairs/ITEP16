// Example showing the concept of Generic class

class MyClass{}
public class Demo11<DT> { // generic class
    <DT>void swap(DT a,DT b){ // generic method
            DT temp;
            temp=a;
            a=b;
            b=temp;
            System.out.println("After Swapping : \na : "+a+"\nb : "+b);
    }
    public static void main(String[] args) {
        int a = 5, b=6;
        Demo11<MyClass> obj = new Demo11<>();
        System.out.println("Before Swapping : \na : "+a+"\nb : "+b);
        obj.swap(a, b);
        
        double a1 = 5.2, b1=6.2;
        System.out.println("Before Swapping : \na : "+a1+"\nb : "+b1);
        obj.swap(a1,b1);
        
        char a2 = 'x', b2='y';
        System.out.println("Before Swapping : \na : "+a2+"\nb : "+b2);
        obj.swap(a2,b2);
    }
}
