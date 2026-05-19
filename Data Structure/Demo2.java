// program to reverse individual element of an array

import java.util.Scanner;
class Demo2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter array elements : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are : ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        for(int i=0;i<size;i++){
            int temp = arr[i];
            int rev = 0;
            while(temp>0){
                int rem = temp%10;
                rev = rev * 10 + rem;
                temp = temp/10;
            }
            arr[i] = rev;
        }

        System.out.println("\nArray elements are : ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}





