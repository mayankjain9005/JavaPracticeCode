package com.pat.corejava;

public class PreventDeadLockInThreading {

    static  Object lock1 = new Object();
    static  Object lock2 = new Object();

    public static void main(String...args){
         String a ="abc";
         String b ="abc";
         a="def";
         System.out.print(a);
        System.out.print(b);











        Thread1Example thread1Example = new Thread1Example();
        Thread2Example thread2Example = new Thread2Example();

        Thread t1 = new Thread(thread1Example);
        Thread t2 = new Thread(thread2Example);

        t1.start();t2.start();






    }



    static class Thread1Example implements  Runnable {
        @Override
        public void run() {
           synchronized (lock1){
               try {
                   Thread.sleep(0001212);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               System.out.println("lock1 is acquired !!");
               synchronized (lock2){
                   System.out.println("lock2 is acquired !!");
               }


           }


        }
    }
    static class Thread2Example implements Runnable {
        @Override
        public void run() {
            synchronized (lock1){
                System.out.println("lock1 is acquired  by second thread ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (lock2){
                    System.out.println("lock2 is also acquired by second thread ");
                }


            }



        }
    }

}
