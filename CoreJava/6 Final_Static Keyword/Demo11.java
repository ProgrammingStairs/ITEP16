// example showing the concept of static
class Demo11{
    static int count=0;
    Demo11(){
        count++;
    }
    public static void main(String args[]){
        Demo11 obj1 = new Demo11();
        Demo11 obj2 = new Demo11();
        Demo11 obj3 = new Demo11();
        Demo11 obj4 = new Demo11();
        Demo11 obj5 = new Demo11();
        System.out.println("No. of objects created : "+count);
    }
}