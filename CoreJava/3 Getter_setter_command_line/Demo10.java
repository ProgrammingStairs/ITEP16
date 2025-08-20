// example showing the concept of varargs (variable arguments)

class Demo10{
    void test(String name,int...args){
        System.out.println("No. of Arguments : "+(args.length+1));
        System.out.print(name+"\t");
        for(int element : args){
            System.out.print(element+"\t");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Demo10 obj = new Demo10();
        obj.test("Andrew",1,2);
        obj.test("Anderson",1,2,3);
        obj.test("Peter",1,2,3,4);
    }
}


