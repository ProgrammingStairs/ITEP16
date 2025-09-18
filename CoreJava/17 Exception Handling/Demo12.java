// example showing the concept of custom exception
/*
// custom exception through unchecked exception
class MyException extends RuntimeException{
    MyException(String msg){
        super(msg);
    }
    void generateException(){
        throw new MyException("Generate Custom Exception");
    }
}
class Demo12{
    public static void main(String args[]){
        MyException obj = new MyException("");
        obj.generateException();
    }
}
*/

// custom exception through checked exception

class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
    void generateException() throws MyException{
        throw new MyException("Generate Custom Exception");
    }
    // void generateException(){
    //     try{
    //         throw new MyException("Generate Custom Exception");
    //     }catch(MyException e){
    //         System.out.println("Exception : "+e);
    //     }
    // }
}
class Demo12{
    public static void main(String args[]) throws MyException{
        MyException obj = new MyException("");
        obj.generateException();
    }
}