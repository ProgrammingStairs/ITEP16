// example showing the concept of final keyword

class Demo1{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        // for(final int element :  arr){
        //     // element = 1000;
        //     System.out.print(element+"\t");
        // }           
        for(int i=0;i<arr.length;i++){
            final int element = arr[i];
            // element = 100;
            System.out.print(element+"\t");
        } 
    }
}