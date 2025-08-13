// example showing the concept of function

class Demo2{
    void show(){
        System.out.println("show method called");
    }
    public static void main(String args[]){
        /*
        Demo2 obj = new Demo2(); 
        obj.show();
        obj.show();
        */
       /*
       Demo2 obj1 = new Demo2(),obj2 = new Demo2();
       obj1.show();
       obj2.show();
       */

      Demo2 obj;
        obj = new Demo2();
        obj.show();

        obj = new Demo2();
        obj.show();
    }
}

