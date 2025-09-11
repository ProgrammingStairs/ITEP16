// example showing the concept of lambda expression
// in lambda expression, we complete our incomplete method with the help of expression

interface Showable{
    void display();
}
class Demo3{
    static int a = 100;
    static void show(){
        System.out.println("value of a : "+a);
    }
    int b = 200;
    void draw(){
        System.out.println("value of b : "+b);
    }
    public static void main(String args[]){
        Showable obj = ()->{
            show();
            Demo3 objNew = new Demo3();
            objNew.draw();
        };
        obj.display();
    }
}