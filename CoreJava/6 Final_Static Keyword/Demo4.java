// example showing the concept of this 
// this keyword is used to return current class object(instance)
class Demo4{
    Demo4 display(){
        System.out.println("display method called");
        return this;
    }
    void show(){
        System.out.println("show method called");
    }
    public static void main(String args[]){
        // Demo4 obj;
        // obj = new Demo4();
        // obj = obj.display();
        // obj.show();

        Demo4 obj = new Demo4();
        obj.display().show();
    }
}