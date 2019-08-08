package com.pat.corejava;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerExample {

  public static  void  main(String[] args){
      Queue<Integer> queue = new LinkedList<>();
      Thread producer = new Thread(new Runnable() {
          @Override
          public void run() {
             int i=10;
             while(true){
                synchronized (this){
                    queue.add(i++);
                    notify();
                }
                }
          }
      });
  Thread consumer = new Thread(new Runnable() {
          @Override
          public void run() {
              synchronized (this){
                  while (true) {
                      System.out.println(queue.poll()+"the  consumed value");
                      notify();

                  }
              }

          }
      });
      producer.start();
      consumer.start();
  }
}
