// example showing the concept of exception handling 

class Demo9{
    public static void main(String args[]){
       int valid=0,invalid=0;
       for(int i=0;i<args.length;i++){
            try{
                Integer.parseInt(args[i]);
                valid++;
            }catch(NumberFormatException e){
                invalid++;
            }
       }
       System.out.println("Valid : "+valid);
       System.out.println("Invalid : "+invalid);
    }
}