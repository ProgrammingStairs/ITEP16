// example showing the concept of instance initializer block
// class Demo17{
//     int year;
//     String model;
//     {
//         year = 2020;
//         System.out.println("initializer block executes..!!!");
//     }
//     Demo17(String car_name,String model){
//         this.model = model;
//         System.out.println("Year : "+year+"\nCarName : "+car_name+"\nModel : "+model+"\n");
//     }
//     public static void main(String args[]){
//         Demo17 obj1 = new Demo17("Car1","model1");
//         Demo17 obj2 = new Demo17("Car2","model2");    
//         System.out.println("Year of car1 : "+obj1.year);
//     }
// }


class Demo17{
    int year;
    String model;
    Demo17(String car_name,String model){
        {
            year = 2020;
            System.out.println("initializer block executes..!!!");
        }
        this.model = model;
        System.out.println("Year : "+year+"\nCarName : "+car_name+"\nModel : "+model+"\n");
    }
    public static void main(String args[]){
        Demo17 obj1 = new Demo17("Car1","model1");
        Demo17 obj2 = new Demo17("Car2","model2");    
        System.out.println("Year of car1 : "+obj1.year);
    }
}
