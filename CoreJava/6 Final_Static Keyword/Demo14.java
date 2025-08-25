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

class Demo14{
    public static void main(String args[]){
        int a = 100;
        int c;
        // normal block
        {
            int b = 200;
            c = 300;
            System.out.println("value of a : "+a);
            System.out.println("value of b : "+b);
        }
            System.out.println("value of a : "+a);
//            System.out.println("value of b : "+b); // generates error
            System.out.println("value of c : "+c);

    }
}
