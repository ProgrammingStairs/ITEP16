// example showing the concept of interface

class Showable{
     void getAge(){}
}
class Demo15{
    public static void main(String args[]){
        Showable obj = new Showable(){
            @Override
            public void getAge(){
                System.out.println("Anonymous class example");
            }
        };
        obj.getAge();
    }
}