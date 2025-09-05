// example showing the concept of method overriding 

class Child{
    final void display(){
        System.out.println("display method of child called");
    }
    final void display(int a){
        System.out.println("display method of child called....");
    }
}
class Demo10{
    public static void main(String args[]){
        Child obj = new Child();
        obj.display(23);
   obj.display();
   } 
}