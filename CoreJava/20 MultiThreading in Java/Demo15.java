// example showing the concept of Thread Synchronization - static synchronization
// class level locking

class First{
    static void show(){
        System.out.println("Thread Name : "+Thread.currentThread().getName());
    }
    // shows shared resource functionality
    synchronized static void display(String name){
            try{ Thread.sleep(1000); }catch(InterruptedException e){System.out.println("Exception : "+e);}
        System.out.print(Thread.currentThread().getName()+" ----> [ ");
            try{ Thread.sleep(1000); }catch(InterruptedException e){System.out.println("Exception : "+e);}
        System.out.print(name);
            try{ Thread.sleep(1000); }catch(InterruptedException e){System.out.println("Exception : "+e);}
        System.out.println(" ] ");
    }
}
class Second extends Thread{
    String name;
    Second(String name){
        this.name=name;
        start();
    }
    public void run(){
      First.show();
      First.display(name);
    }
}
class Demo15{
    public static void main(String args[]){
        Second s1 = new Second("Andrew");
        Second s2 = new Second("Mathew");
        Second s3 = new Second("Peter");
    }
}

/*
[ Andrew ]
[ Peter ]
[ Mathew ]

o/p : [[ AndrewPeter]][Mathew]
      [[[ AndrewPeterMathew ]]]

      */