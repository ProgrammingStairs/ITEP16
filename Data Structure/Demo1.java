// program to shift all the zeros to the end

import java.util.Scanner;
class Demo1{
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

        int index=0;
        for(int i=0;i<size;i++){
            if(arr[i]!=0){
                arr[index] = arr[i];
                index++;
            }
        }        
        while(index<size){
            arr[index] = 0;
            index++;
        }

        System.out.println("\nArray elements are : ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}





