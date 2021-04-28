package multithreading;

public class MyMultiThreading {

    public static void main(String[] args) {

        MyThread thread1= new MyThread();

        //alternative for creating a thread (best)
        MyRunnable runnable1 = new MyRunnable();
        Thread altThread2=new Thread(runnable1);

        thread1.start();

        /*
        when we use join it means tht thread 2 is going to wait until thread 1 finishes

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        altThread2.start();


        //active threads
        System.out.println("No of threads : "+ Thread.activeCount());
    }
}
