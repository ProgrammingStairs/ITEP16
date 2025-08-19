// example showing the concept of command line argument
class Demo6{
    public static void main(String args[]){
       String temp;
       for(int i=0;i<args.length/2;i++){
            temp = args[i];
            args[i] = args[args.length-1-i];
            args[args.length-1-i] = temp;
       }
       System.out.println("Reverse elements are : ");
       for(String element : args){
            System.out.print(element+"\t");
       }
    }
}