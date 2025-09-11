// example showing the concept of lambda expression
// in lambda expression, we complete our incomplete method with the help of expression

interface Showable{
    int age=18;
    void getAge();
}
class Demo2{
    public static void main(String args[]){
        Showable obj = ()->System.out.println("Age : "+Showable.age);
        obj.getAge();
    }
}