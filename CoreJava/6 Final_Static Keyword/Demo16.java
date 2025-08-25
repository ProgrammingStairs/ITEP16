// example showing the concept of instance initializer block
class Parent{
    Parent(){
        System.out.println("Parent constructor called");
    }
}
class Demo16 extends Parent{
    int year;
    String model;
    {
        year = 2020;
        System.out.println("initializer block executes..!!!");
    }
    Demo16(String car_name,String model){
        super();
        // initializer block executes
        this.model = model;
        System.out.println("Year : "+year+"\nCarName : "+car_name+"\nModel : "+model+"\n");
    }
    public static void main(String args[]){
        Demo16 obj1 = new Demo16("Car1","model1");
        Demo16 obj2 = new Demo16("Car2","model2");    
    }
}
