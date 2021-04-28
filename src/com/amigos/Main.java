package com.amigos;

class Hi extends Thread{
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println(i +": Hi");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Thread.currentThread().setName("Thread #1");
        System.out.println(Thread.currentThread().getName());

        System.out.println("is Thread alive : " +Thread.currentThread().isAlive());
    }
}

class Hello extends Thread{
    public  void run(){
        for (int i=1;i<=5;i++){
            System.out.println(i +": Hello");
        }
        Thread.currentThread().setName("Thread #2");
        System.out.println(Thread.currentThread().getName());

        System.out.println("is Thread alive : " +Thread.currentThread().isAlive());
    }
}


public class Main {

    public static void main(String[] args) {
	// write your code here

        Hi obj1=new Hi();
        Hello obj2 =new Hello();

        //obj1.setDaemon(true);
        obj1.start();

        //delaying thread 2
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        obj2.start();

        obj1.run();
        obj2.run();
        System.out.println("Good");

        Thread.currentThread().setName("Main Thread");

        System.out.println(Thread.currentThread().getName());
        System.out.println("No of threads running :"+ Thread.activeCount());

        System.out.println("is Thread alive : " +Thread.currentThread().isAlive());
    }
}
