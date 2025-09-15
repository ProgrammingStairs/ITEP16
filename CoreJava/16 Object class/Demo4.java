// example showing the concept of Object class methods | getClass() method
class Demo4{
    public static void main(String args[]){
        /*
            // Object obj = new String();
            String obj = new String();
            Class c = obj.getClass();
            System.out.println("class name : "+c.getName());
        */

        //    System.out.println("class name : "+new String().getClass().getName());
        
            Demo4 obj = new Demo4();
            Class c = obj.getClass();
            System.out.println("class with class name : "+c);
            System.out.println("class name : "+c.getName());
        
    }
}
