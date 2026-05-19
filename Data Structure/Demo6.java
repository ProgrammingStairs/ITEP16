// program to show the concept of union of array elements

import java.util.*;
class Demo6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of both the arrays : ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[m];

        System.out.println("\nEnter array elements for first array: ");
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("\nEnter array elements for second array: ");
        for(int i=0;i<m;i++){
            arr2[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++)
            set.add(arr1[i]);
        for(int i=0;i<m;i++)
            set.add(arr2[i]);

        System.out.println(set);

        System.out.println("Array elements are : ");
        for(int element : set)
            System.out.print(element+" ");            
    }
}





