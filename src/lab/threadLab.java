package lab;

public class threadLab {
    public static void main(String[] args) throws Exception{
       MyThread thread=new MyThread();
       thread.start();
    }
}
class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
}