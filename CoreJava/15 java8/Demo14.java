// example showing the concept of Predicate

import java.util.function.Predicate;
class Demo14{
    public static void main(String args[]){
        Predicate<Integer> greaterThan = i -> i>100;
        System.out.println("Result : "+greaterThan.test(200));

        Predicate<Integer> lessThan = i -> i<50;
        System.out.println("Result : "+lessThan.test(200));

        System.out.println("Result : "+lessThan.and(greaterThan).test(20));
        System.out.println("Result : "+lessThan.and(greaterThan).test(250));

        System.out.println("Result : "+lessThan.or(greaterThan).test(20));
        System.out.println("Result : "+lessThan.or(greaterThan).test(250));

        System.out.println("Result : "+lessThan.negate().test(20));
        System.out.println("Result : "+lessThan.negate().test(250));

    }
}

