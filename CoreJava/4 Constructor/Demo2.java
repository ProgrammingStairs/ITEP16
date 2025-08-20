// example showing the concept of constructor 

class Demo2{
    int rno;
    double per;
    String name;
    // constructor 
    Demo2(){
        // int rno=100;
        // double per = 56.67;
        // String name = "Andrew Anderson";

        rno=100;
        per = 56.67;
        name = "Andrew Anderson";
        System.out.println("constructor called");
    }
    void display(){
        System.out.println("Roll Number : "+rno);
        System.out.println("Percentage : "+per);
        System.out.println("Name : "+name);
    }
    public static void main(String args[]){
        Demo2 obj = new Demo2();
        obj.display();
    }
}