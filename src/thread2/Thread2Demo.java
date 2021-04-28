package thread2;

public class Thread2Demo extends Thread{

    @Override
    public void run(){
        System.out.println("This thread is running");
    }

    public static void main(String[] args) {

        Thread2Demo thread2= new Thread2Demo();
        thread2.start();

        System.out.println(thread2.getName());
        System.out.println("isAlive : " + thread2.isAlive());
        System.out.println("Priority : " + thread2.getPriority());

        System.out.println("Active threads  : " + Thread.activeCount());
    }
}
