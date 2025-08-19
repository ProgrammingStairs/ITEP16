// example 
class Demo{
    private int num;
    // setter method
    void setNum(int num){
        this.num = num;
    }
    // getter method
    int getNum(){
        return num;
    }
    void display(){
        System.out.println("value of num : "+num);
    }
}
class Demo2{
    public static void main(String args[]){
        Demo obj = new Demo();
        obj.setNum(100);

        System.out.println("Value of num inside main : "+obj.getNum());
        obj.display();
    }
}