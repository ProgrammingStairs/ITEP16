import java.lang.reflect.Field;
import java.util.ArrayList;
 
public class ArrayList13 {
 
    public static void main(String[] args) throws Exception {
        
        /*
         * This will create ArrayList with capacity of 10.
         */
        ArrayList<Integer> aListNumbers = new ArrayList<Integer>(10);
 
        /*
         * Size = 0 since haven't added any elements to it
         * capacity = 10
         */
        System.out.println("ArrayList size : " 
                                + aListNumbers.size());
        System.out.println("ArrayList capacity : " 
                                + getArrayListCapacity(aListNumbers));
        
        //add 10 elements to ArrayList
        aListNumbers.add(1);
        aListNumbers.add(2);
        aListNumbers.add(3);
        aListNumbers.add(4);
        aListNumbers.add(5);
        aListNumbers.add(6);
        aListNumbers.add(7);
        aListNumbers.add(8);
        aListNumbers.add(9);
        aListNumbers.add(10);
        
        /*
         * size = 10, because we added 10 elements
         * capacity = 10 because internal array of size 10 could fit 10 elements
         */
        System.out.println("ArrayList contains: " 
                                + aListNumbers);        
        System.out.println("ArrayList size : " 
                                + aListNumbers.size());
        System.out.println("ArrayList capacity : " 
                                + getArrayListCapacity(aListNumbers));
 
        //add one more element beyond the initial capacity
        aListNumbers.add(11);
 
        /*
         * size = 11, because we added 11 elements
         * capacity = 16 because internal array of size 10 could not fit
         * 11 element so new array has to be created. New array's 
         * size is calculated as (10 * 3)/2  = 15
         * 
         */
        System.out.println("ArrayList contains: " 
                                + aListNumbers);        
        System.out.println("ArrayList size : " 
                                + aListNumbers.size());
        System.out.println("ArrayList capacity : " 
                                + getArrayListCapacity(aListNumbers));
 
        
    }
    
    private static int getArrayListCapacity(ArrayList<Integer> list) throws Exception{
        
        //get the elementData field from ArrayList class
        Field arrayField = ArrayList.class.getDeclaredField("elementData");
        
        /*
         * Since the elementData field is private, we need 
         * to make it accessible first 
         */
        arrayField.setAccessible(true);
        
        //now get the elementData Object array from our list
        Object[] internalArray = (Object[])arrayField.get(list);
        
        //Internal array length is the ArrayList capacity!
        return internalArray.length;
    }
}