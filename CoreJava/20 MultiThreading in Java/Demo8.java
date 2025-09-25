// example showing the concept of MultiThreading 

class Demo8 extends Thread{
    public void run(){
        System.out.println("Thread Name : "+Thread.currentThread().getName()+" Id : "+Thread.currentThread().getId()+" Priority : "+Thread.currentThread().getPriority());
    }
    public static void main(String args[]){
        Demo8 obj1 = new Demo8();
        Demo8 obj2 = new Demo8();
        Demo8 obj3 = new Demo8();
        
        obj1.setName("Andrew");
        obj2.setName("Mathew");
        obj3.setName("Peter");

        // obj1.setPriority(4);
        // obj2.setPriority(8);
        // obj3.setPriority(2);

        // obj1.setPriority(Thread.MIN_PRIORITY);
        // obj2.setPriority(Thread.MAX_PRIORITY);
        // obj3.setPriority(Thread.NORM_PRIORITY);

        obj1.start();
        obj2.start();
        obj3.start();
    }
}