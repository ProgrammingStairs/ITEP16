// example showing the concept of lambda expression
// in lambda expression, we complete our incomplete method with the help of expression

interface Showable{
    void display();
}
class Demo1{
    public static void main(String args[]){
        Showable obj = ()->System.out.println("display method called");
        obj.display();
    }
}