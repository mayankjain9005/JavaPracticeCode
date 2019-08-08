package com.pat.corejava;
public class DeadLockUsingThread{
    static Object lock1 = new Object();
    static  Object lock2 = new Object();


public static void main(String...args){
    Thread1 t1  = new Thread1();
    Thread2 t2 = new Thread2() ;
    Thread thread1 = new Thread(t1);
    Thread thread2 = new Thread(t2);
    thread1.start();
    thread2.start();
}

    static class Thread1 implements Runnable {
        @Override
        public void run() {
            synchronized (lock1){
                System.out.println("acquired lock on lock1 object");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("now waiting to obtains lock on lock2");
                synchronized (lock2){
                    System.out.println("done 1 ");
                }
            }

        }
    }


    static  class Thread2  implements Runnable{

        @Override
        public void run() {
                synchronized (lock2){
                    System.out.println("lock acuired on thread 2 ");
                    try {
                        Thread.sleep(001000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("waiting to take lock on lock1");
                    synchronized (lock1){
                           System.out.println("done 2");
                    }



                }
        }
    }

}

