// example showing the concept of interface
interface Movable{
    void show();
}
interface Showable{
    void show();    
}
class Demo19 implements Movable,Showable{
    @Override
    public void show(){
        System.out.println("show method called");
    }
    public static void main(String args[]){
      Movable obj = new Demo19();
      obj.show();
    }
}