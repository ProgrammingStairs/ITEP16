// example showing the concept of interface
interface Showable{
    int age=18;
    void getAge();
}

class Demo11{
    public static void main(String args[]){
        // anonymous class created by interface + Anonymous object
        new Showable(){
            @Override
            public void getAge(){
                System.out.println("Age : "+age);
            }
        }.getAge();
    }
}




