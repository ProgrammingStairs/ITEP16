// example showing the concept of instance initializer block
/*
            Initializer Block
        ____________|____________
        |                        |
  Static Initializer    Instance Initializer 
       block                   Block

    static{             {  
        ....               .....
    }                   } 
                        
    Note : if we create {} block inside class and above main method, then that block is considered as instance intializer block. 
*/

class Demo15{
    int year;
    String model;
    {
        year = 2020;
        System.out.println("initializer block executes..!!!");
    }
    Demo15(String car_name,String model){
        this.model = model;
        System.out.println("Year : "+year+"\nCarName : "+car_name+"\nModel : "+model+"\n");
    }
    public static void main(String args[]){
        Demo15 obj1 = new Demo15("Car1","model1");
        Demo15 obj2 = new Demo15("Car2","model2");    
    }
}
