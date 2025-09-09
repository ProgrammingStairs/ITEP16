// example showing the concept of interface

interface Movable{
    default void show(){}
    // void show();
}
interface Showable{
    default void show(){}
}
//class Demo implements Movable{}
class Demo20 implements Movable,Showable{
    @Override
    public void show(){
        System.out.println("show method called...");
    }
    public static void main(String args[]){
      Movable obj = new Demo20();
      obj.show();
    }
}