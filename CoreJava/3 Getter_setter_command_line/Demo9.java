// example showing the concept of varargs (variable arguments)

class Demo9{
    void test(int...args){
        System.out.println("No. of Arguments : "+args.length);
        int sum=0;
        for(int element : args){
            sum += element;
        }
        System.out.println("\nsum : "+sum);
    }
    public static void main(String args[]){
        int arr[] = new int[]{1,2,3,4,5};
        Demo9 obj = new Demo9();
        obj.test(1,2);
        obj.test(1,2,3);
        obj.test(1,2,3,4);
        obj.test(new int[]{1,2,3,4,5,6,7,8,9,10});
        obj.test(arr);
    }
}


