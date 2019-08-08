package com.pat.corejava;
import java.util.concurrent.locks.ReentrantLock;
public class ReentrantLockDemo {
    final ReentrantLock lock = new ReentrantLock(false);
    int count=0;
    public int getcount(){
        try {
            lock.lock();
            System.out.println("count value "+count);
            count++;
        }finally {
            lock.unlock();
        }
        return count;
    }
    public static void main(String...args ){
            ReentrantLockDemo reentrantLockDemo = new ReentrantLockDemo();
            Runnable runnable1 = () -> {
                reentrantLockDemo.getcount();
            };
            Runnable runnable2 = () -> {
                reentrantLockDemo.getcount();
            };
            Runnable runnable3 = () -> {
                reentrantLockDemo.getcount();
            };
            Thread t1  = new Thread(runnable1);
            t1.start();
            Thread t2  = new Thread(runnable1);
            t2.start();
            Thread t3  = new Thread(runnable1);
            t3.start();
    }






}
