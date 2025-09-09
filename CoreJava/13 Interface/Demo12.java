// example showing the concept of interface

interface Showable{
    int age=18; // public static final
    void getAge(); // public abstract
}
class GetAge implements Showable{
    @Override
    public void getAge(){
        System.out.println("Age : "+age);
    }
}
class Demo12{
    public static void main(String args[]){
        Showable obj = new GetAge();
        obj.getAge();
    }
}