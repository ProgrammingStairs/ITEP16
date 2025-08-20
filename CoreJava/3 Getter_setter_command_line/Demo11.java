// example showing the concept of varargs (variable arguments)

class Demo11{
    void test(String...args){
        System.out.println("No. of Arguments : "+args.length);
        for(String element : args){
            System.out.print(element+"\t");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Demo11 obj = new Demo11();
        obj.test("1","2");
        obj.test("1","2","3");
        obj.test("1","2","3","4");
    }
}


