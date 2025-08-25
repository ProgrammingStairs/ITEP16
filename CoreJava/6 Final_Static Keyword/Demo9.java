// example showing the concept of static method
class Demo{
    // static method 
    static void display(){
        System.out.println("display of demo called");
    }
}
class Demo9{
    // static method 
    static void display(){
        System.out.println("display of demo9 called");
    }
    public static void main(String args[]){
        Demo9.display();
        display();
        Demo.display();
    }
}