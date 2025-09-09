// example showing the concept of interface

abstract class Showable{
    int age=18; 
    abstract void getAge(); 
}
class Demo14{
    public static void main(String args[]){
        Showable obj = new Showable(){
            @Override
            public void getAge(){
                System.out.println("Anonymous class example : "+age);
            }
        };
        obj.getAge();
    }
}