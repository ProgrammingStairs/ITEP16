// example showing the concept of array of object

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
class Demo2{
    public static void main(String args[]){

        Product pobj[] = new Product[2]; // reference array
     
        System.out.println("pobj[0] : "+pobj[0]);
        System.out.println("pobj[1] : "+pobj[1]);

        pobj[0] = new Product(123,"Soap",200.34);
        pobj[1] = new Product(124,"Fairness Cream",789.43);    

        // Product pobj[] = new Product[2]; // now it is considered as array of object
        System.out.println("pobj[0] : "+pobj[0]);
        System.out.println("pobj[1] : "+pobj[1]);

        System.out.println("\nProduct Details\n");
        for(Product p :  pobj)
            p.display();
    }
}

