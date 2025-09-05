// example showing the concept of abstract class 

import java.util.Scanner;
abstract class Series{
    abstract void series(int n,int m);
}
class EvenSeries extends Series{
    @Override
    void series(int n,int m){
        System.out.println("\nEven Series \n");
        for(int i=n;i<=m;i++){
            if(i%2==0)
                System.out.print(i+"\t");
        }
    }
}
class OddSeries extends Series{
    @Override
    void series(int n,int m){
        System.out.println("\nOdd Series \n");
        for(int i=n;i<=m;i++){
            if(i%2!=0)
                System.out.print(i+"\t");
        }
    }
}

class Demo5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial and final limit : ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        Series obj;
        obj = new EvenSeries();
            obj.series(n,m);
        obj = new OddSeries();
            obj.series(n,m);
    }
}