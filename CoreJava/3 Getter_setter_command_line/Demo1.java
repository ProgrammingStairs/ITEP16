// example 
class Demo1{
    private int num;
    void display(){
        System.out.println("value of num : "+num);
    }
    public static void main(String args[]){
        Demo1 obj = new Demo1();
        obj.num=100;
        System.out.println("Value of num inside main : "+obj.num);
        obj.display();
    }
}