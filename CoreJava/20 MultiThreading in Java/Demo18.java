// example showing the concept of Deadlock - solution

class Paper {}
class Pen {}
class Demo18{
    public static void main(String args[]){
        Paper pr = new Paper();
        Pen pn = new Pen();

        new Thread(){
            @Override
            public void run(){
                synchronized(pn){
                    System.out.println("Thread 1 uses Pen and needs Paper");
                }
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    System.out.println("Exception : "+e);
                }
                synchronized(pr){
                    System.out.println("Thread 1 uses Paper and needs Pen");
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run(){
                synchronized(pr){
                    System.out.println("Thread 2 uses Paper and needs Pen");
                }
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    System.out.println("Exception : "+e);
                }
                synchronized(pn){
                    System.out.println("Thread 2 uses Pen and needs Paper");
                }
            }
        }.start();

    }
}
