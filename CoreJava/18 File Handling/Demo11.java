// example showing the concept of file handling 

import java.io.*;
class Product implements Serializable{
    int pid;
    String name;
    double price;
    Product(int pid,String name,double price){
        this.pid=pid;
        this.name=name;
        this.price=price;
    }
    @Override
    public String toString(){
        return "Product Details : { "+pid+" , "+name+" , "+price+" } ";
    }
}
class Demo11{
    public static void main(String args[]){
        
        Product pobj = new Product(1010,"Soap",45.43);

        File file = new File("D:\\desktop\\ITEP_BATCH_16th\\ITEP16\\CoreJava\\18 File Handling\\myFolder\\newFile.txt");
      
        try(FileOutputStream fout = new FileOutputStream(file);
        FileInputStream fin = new FileInputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        ObjectInputStream ois = new ObjectInputStream(fin);){    
            oos.writeObject(pobj);
            System.out.println("Data inserted successfully");
            Product obj = (Product)ois.readObject(); // downcasting
            System.out.println(obj);
        }catch(IOException | ClassNotFoundException e){
            System.out.println("Exception : "+e);
        }
    }
}