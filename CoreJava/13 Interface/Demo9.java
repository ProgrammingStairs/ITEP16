// example showing the concept of interface
interface Showable{
    int age=18;
    void getAge();
}
class GetAge implements Showable{
    @Override
    public void getAge(){
        System.out.println("Age : "+age);
    }
}
class Demo9{
    public static void main(String args[]){
        Showable obj = new GetAge();
        obj.getAge();
    }
}