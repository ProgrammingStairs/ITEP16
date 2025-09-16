// example showing the concept of exception handling 

class Demo7{
    public static void main(String args[]){
       try{
            throw new ArithmeticException();
       }catch(ArithmeticException e){
            System.out.println("Exception outside : "+e);
       }finally{
           System.out.println("Finally executes");        
       }
       System.out.println("End of program");
    }
}