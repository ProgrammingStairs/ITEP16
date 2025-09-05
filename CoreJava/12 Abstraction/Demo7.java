// example showing the concept of instanceof operator 

class Parent{}
class Test extends Parent{}
class Demo7{
    public static void main(String args[]){
        Test t1 = new Test();
        if(t1 instanceof Test)
            System.out.println("Instance of");
        else
            System.out.println("not Instance of");

        if(t1 instanceof Parent)
            System.out.println("Instance of");
        else
            System.out.println("not Instance of");

        Parent p1 = new Parent();
        if(p1 instanceof Parent)
            System.out.println("Instance of");
        else
            System.out.println("not Instance of");

        Parent p2 = new Test();
        if(p2 instanceof Parent)
            System.out.println("Instance of");
        else
            System.out.println("not Instance of");
        
        if(p2 instanceof Test)
            System.out.println("Instance of");
        else
            System.out.println("not Instance of");

        Parent p3 = new Parent();
        if(p3 instanceof Test)
            System.out.println("Instance of");
        else
            System.out.println("not Instance of");
        
        Test t3 = null;
        if(t3 instanceof Test)
            System.out.println("Instance of");
        else
            System.out.println("not Instance of");
        
    }
}