// example showing the concept of MultiThreading 

class Demo7 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("i : "+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Exception : "+e);
            }
        }
    }
    public static void main(String args[]){
        Demo7 obj1 = new Demo7();
        Demo7 obj2 = new Demo7();
        obj1.start();
            try{
                // obj1.join();
                obj1.join(5000);
            }catch(InterruptedException e){
                System.out.println("Exception : "+e);
            }
        obj2.start();
    }
}