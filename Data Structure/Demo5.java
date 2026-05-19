// program to merge two array

import java.util.*;
class Demo5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of both the arrays : ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr1[] = new int[n+m];
        int arr2[] = new int[m];

        System.out.println("\nEnter array elements for first array: ");
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("\nEnter array elements for second array: ");
        for(int i=0;i<m;i++){
            arr2[i] = sc.nextInt();
        }

        System.out.println("\nFirst Array elements are : ");
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println("\nSecond Array elements are : ");
        for(int i=0;i<m;i++){
            System.out.print(arr2[i]+" ");
        }

        for(int i=0;i<m;i++,n++){
            arr1[n] = arr2[i];
        }

        System.out.println("\nArray elements after merging : ");
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }

    }
}





