// example showing the concept of final keyword

class Demo3{
    public static void main(String args[]){
        final int arr[] = {1,2,3,4,5};
        int arr1[] = {11,22,33,44,55};

        arr = arr1; // error

        for(int element :  arr){
            System.out.print(element+"\t");
        }           
    }
}