package com.pat.corejava;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadExample implements Runnable{
   @Override
    public void run() {
     try {
         Thread.sleep(1000);
     }catch(InterruptedException exe){
         exe.printStackTrace();
     }
    System.out.println(Thread.currentThread().getName());
   }
}

public class ExecutorService1 {
    public static  void main(String...args){
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        ThreadExample t1 = new ThreadExample();
        executorService.execute(t1);
        executorService.execute(t1);









    }


}
