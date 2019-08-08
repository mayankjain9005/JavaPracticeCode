package com.pat.corejava;

public class ThreadLocalExample {

    public  static  void main(String...args) throws InterruptedException {
            MyRunnable myRunnable  = new MyRunnable();

            Thread t1  = new Thread(myRunnable);
            Thread t2  = new Thread(myRunnable);
            t1.start();
            t2.start();
            t1.join();
            t2.join();

    }
}

class MyRunnable  implements  Runnable{
    int i=1;
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

        ThreadLocal<Integer> threadLocal  = new ThreadLocal<>();
        threadLocal.set(i);
        ++i;
        System.out.println("the value of i is  "+i);
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadLocal.get());

    }
}


