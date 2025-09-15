// example showing the concept of Object class methods | finalize() method
@Deprecated
class Demo5{
    protected void finalize(){
        System.out.println("finalize method called..!!!");
    }
    public static void main(String args[]){
        Demo5 obj = new Demo5();
        System.out.println("hashCode : "+obj.hashCode());
        obj = null;
        System.out.println("hashCode : "+obj.hashCode());
        System.gc();
    }
}
