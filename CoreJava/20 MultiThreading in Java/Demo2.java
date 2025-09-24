// example showing the concept of MultiThreading 

class Demo2{
    void display(){
        System.out.println("Thread : "+Thread.currentThread());
        System.out.println("Thread Name : "+Thread.currentThread().getName());
        System.out.println("Thread Priority : "+Thread.currentThread().getPriority());
        System.out.println("Thread Id : "+Thread.currentThread().getId());
        System.out.println("Thread isAlive Status : "+Thread.currentThread().isAlive());
        System.out.println("Thread isDaemon status : "+Thread.currentThread().isDaemon());
    }
    public static void main(String args[]){
        Demo2 obj = new Demo2();
        obj.display();
    }
}