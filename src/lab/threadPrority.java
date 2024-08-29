package lab;

public class threadPrority {
    public static void main(String[] args) throws Exception{
         TestMultiPriority m1=new TestMultiPriority();
         TestMultiPriority m2=new TestMultiPriority();
         m1.setPriority(Thread.MIN_PRIORITY);
         m2.setPriority(Thread.MAX_PRIORITY);
         m1.start();
         m2.start();
    }
}

class TestMultiPriority extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getPriority());
    }
}
