// example showing the concept of this 
// this can also be passed as an argument in constructor call
class Demo{
    Demo(Demo5 obj){
        obj.display();
    }
}
class Demo5{
    Demo5(){
        Demo obj = new Demo(this);
    }
    void display(){
        System.out.println("display method called..!!");
    }
    public static void main(String args[]){
        Demo5 obj = new Demo5();
    }
}