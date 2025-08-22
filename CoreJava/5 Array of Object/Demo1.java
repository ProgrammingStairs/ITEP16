// example 

class Product{
    int pid;
    String pname;
    double price;

    Product(int pid,String pname,double price){
        this.pid=pid;
        this.pname=pname;
        this.price=price;
    }
    void display(){
        System.out.println(pid+"\t"+pname+"\t\t"+price);
    }
}
class Demo1{
    public static void main(String args[]){
        Product pobj1 = new Product(123,"Soap",200.34);
        Product pobj2 = new Product(124,"Fairness Cream",789.43);

        System.out.println("\nProduct Details\n");
        pobj1.display();
        pobj2.display();        
    }
}

