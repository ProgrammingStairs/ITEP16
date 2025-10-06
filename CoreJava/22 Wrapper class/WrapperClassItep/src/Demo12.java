// Example showing the concept of Generic class

public class Demo12<DT1,DT2> { // generic class
    DT1 a;
    DT2 b;
    Demo12(DT1 a,DT2 b){
        this.a=a;
        this.b=b;
    }
    void display(){
        System.out.println("name : "+a);
        System.out.println("age : "+b);
    }
    public static void main(String[] args) {
        Demo12<String,Integer> obj= new Demo12<>("Andrew Anderson",45);
        obj.display();
    }
}
