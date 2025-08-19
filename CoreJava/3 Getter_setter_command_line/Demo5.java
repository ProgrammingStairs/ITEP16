// example showing the concept of command line argument
class Demo5{
    public static void main(String args[]){
       int sum=0; 
       for(String element : args){
            sum += Integer.parseInt(element);
       } 
       System.out.println("Sum : "+sum);
    }
}