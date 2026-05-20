// program to find out second largest element in an array

import java.util.*;
class Demo7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("\nEnter array elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){

            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("Largest : "+largest);
        System.out.println("Second Largest : "+secondLargest);
        
    }
}





