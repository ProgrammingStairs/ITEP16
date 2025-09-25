// example showing the concept of MultiThreading 

class Demo11 implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread : "+Thread.currentThread().getName());
    }
    public static void main(String args[]){
        // Demo11 obj = new Demo11();
        // Thread th = new Thread(obj);
        // th.start();

        // Thread th = new Thread(new Demo11());
        // th.start();

        new Thread(new Demo11()).start();
    }
}