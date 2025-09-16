// example showing the concept of exception handling 

class Demo11{
    public static void main(String args[]){
       try{
        Class.forName("Demo101");
        System.out.println("class found");
       }catch(ClassNotFoundException e){
            System.out.println("Exception : "+e);
       }
    }
}