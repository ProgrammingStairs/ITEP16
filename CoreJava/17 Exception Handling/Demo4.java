// example showing the concept of exception handling 

class Demo4{
    public static void main(String args[]){
        int arr[] = new int[]{1,2,3,4,5};
        String str = "Hello Andrew";
        /*
        try{
            System.out.println("arr[3] : "+arr[3]);
            System.out.println("str.charAt(3) : "+str.charAt(3));
        }catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("Exception : "+e1);
        }catch(StringIndexOutOfBoundsException e1){
            System.out.println("Exception : "+e1);
        }
        */

        try{
            System.out.println("arr[3] : "+arr[3]);
            System.out.println("str.charAt(3) : "+str.charAt(3));
        }catch(ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e1){
            System.out.println("Exception : "+e1);
        }
    }
}