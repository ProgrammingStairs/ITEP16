// example showing the concept of exception handling 

class Demo6{
    static String str;
    public static void main(String args[]){
       try{
            try{ 
                System.out.println("Length : "+str.length());
            }catch(ArithmeticException e){
                System.out.println("Exception : "+e);
            }finally{
                System.out.println("statement 1");
            }
       }catch(Exception e){
            System.out.println("Exception outside : "+e);
       }finally{
                System.out.println("statement 2");
        }
    }
}