// program to find out frequency of any specific number

import java.util.Scanner;
class Demo3{
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

        System.out.println("Enter element whose frequency you want to find out : ");
        int element = sc.nextInt();
        int count=0;

        for(int i=0;i<size;i++){
            if(arr[i]==element)
                count++;
        }

        if(count!=0)
            System.out.println("frequency of "+element+" is : "+count);
        else 
            System.out.println("Element not found");
    }
}





