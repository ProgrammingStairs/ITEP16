// example showing the concept of final keyword

class Demo2{
    public static void main(String args[]){
        final int arr[] = {1,2,3,4,5};
        arr[2] = 100;
        for(int element :  arr){
            System.out.print(element+"\t");
        }           
    }
}