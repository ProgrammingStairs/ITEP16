// example showing the concept of varargs (variable arguments)

class Demo13{
    void test(String...args){
        System.out.println("No. of Arguments... : "+args.length);
        for(String element : args){
            System.out.print(element+"\t");
        }
        System.out.println();
    }
    void test(int...args){
        System.out.println("\nNo. of Arguments : "+args.length);
        for(int element : args){
            System.out.print(element+"\t");
        }
        System.out.println();
    }

    public static void main(String args[]){
        Demo13 obj = new Demo13();
        obj.test("1","2");
        obj.test("1","2","3");

        obj.test(1,2,3);
        obj.test(1,2,3,4,5);
    }
}


