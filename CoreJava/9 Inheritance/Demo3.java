// example showing the concept of Mulltilevel inheritance

import java.util.Scanner;
class Area{
    int l,b;
    Area(int l,int b){
        this.l=l;
        this.b=b;
    }
    int getArea(){
        return l*b;
    }
}
class Volume extends Area{
    int h;
    Volume(int l,int b,int h){
        super(l,b);
        this.h=h;
    }
    int getVolume(){
        return getArea()*h;
    }
}
class Density extends Volume{
    double m;
    Density(int l,int b,int h,double m){
        super(l,b,h);
        this.m=m;
    }
    double getDensity(){
        return m/getVolume();
    }
}
class Demo3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of l,b,h and m : ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        double m = sc.nextDouble();
        
        Density dobj = new Density(l,b,h,m);
        System.out.println("Area : "+dobj.getArea());
        System.out.println("Volume : "+dobj.getVolume());
        System.out.println("Density : "+dobj.getDensity());
    }
}