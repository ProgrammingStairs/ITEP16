// example showing the concept of array of object

import java.util.Scanner;
class Product{
    int pid;
    String pname;
    double price;

    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product Id : ");
        pid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Product Name : ");
        pname = sc.nextLine();
        System.out.println("Enter Product Price : ");
        price = sc.nextDouble(); 
    }
    void display(){
        System.out.println(pid+"\t"+pname+"\t\t"+price);
    }
}
class Demo3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Product : ");
        int size = sc.nextInt();
        Product pobj[] = new Product[size];
        
        for(int i=0;i<size;i++){
            pobj[i] = new Product();
            pobj[i].getData();
        }
        System.out.println("\nProduct Details\n");
        for(Product p :  pobj)
            p.display();
    }
}

