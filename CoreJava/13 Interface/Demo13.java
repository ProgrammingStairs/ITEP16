// example showing the concept of interface

interface Showable{
    int age=18; // public static final
    void getAge(); // public abstract
}
class Demo13{
    public static void main(String args[]){
        Showable obj = new Showable(){
            @Override
            public void getAge(){
                System.out.println("Age : "+age);
            }
        };
        obj.getAge();
    }
}