// example showing the concept of Predicate

import java.util.function.Predicate;
@Deprecated
class Demo13{
    public static void main(String args[]){
        Predicate<Integer> result = i -> i>100;
   //     System.out.println("Result : "+result.test(200));
         System.out.println("Result : "+result.test(new Integer(300)));
   
    }
}

// Integer obj = new Integer(300);
//Integer obj = 200;

/*
    i -> i>100;

    boolean check(int i){
        if(i>100)
            return true;
        else
            return false;
    }

*/