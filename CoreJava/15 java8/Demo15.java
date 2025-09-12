// example showing the concept of Predicate

import java.util.function.Predicate;
class Demo15{
    public static void main(String args[]){
        Predicate<String> check = Predicate.isEqual("Andrew");
        System.out.println("Result : "+check.test("Peter"));
        System.out.println("Result : "+check.test("andrew"));
        System.out.println("Result : "+check.test("Andrew"));

        Predicate<Integer> checkNum = Predicate.isEqual(100);
        System.out.println("Result : "+checkNum.test(100));
    }
}

