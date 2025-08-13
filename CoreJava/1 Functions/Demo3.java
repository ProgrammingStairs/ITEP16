// example showing the concept of function

class Demo{
    void display(){
        System.out.println("display method called");
        // Demo3 obj = new Demo3();
        // obj.show();   
    }
}
class Demo3{
    void show(){
        System.out.println("show method called");
        Demo obj = new Demo();
        obj.display();
    }
    public static void main(String args[]){
        // Demo obj = new Demo();
        // obj.display();

        Demo3 obj = new Demo3();
        obj.show();
    }
}

