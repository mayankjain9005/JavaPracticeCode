package com.pat.corejava;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {


    public static  void main(String[] args){
            BlockingQueue<Message> blockingQueue = new ArrayBlockingQueue<Message>(10);
            Thread t1 = new Thread(new Producer(blockingQueue));
            Thread t2 = new Thread(new Consumer(blockingQueue));
            t1.start();
            t2.start();

    }

}


class Message{
    private String message;
    public Message(String msg){
        this.message=msg;
    }
    public  String  getMessage(){
        return message;

    }

}



class Producer implements Runnable {
   private BlockingQueue<Message> blockingQueue;
   public Producer(BlockingQueue<Message> blockingQueue){
       this.blockingQueue=blockingQueue;
   }

    @Override
    public void run() {
       for(int i=0;i<100;i++){
            Message message = new Message("abc"+i);
           try {
               blockingQueue.put(message);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
       Message message1 = new Message("exit");
        try {
            blockingQueue.put(message1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Consumer implements Runnable{
    private BlockingQueue<Message> blockingQueue;

    public Consumer(BlockingQueue<Message> blockingQueue){
        this.blockingQueue=blockingQueue;

    }



    @Override
    public void run()   {
        String msg;
        try{
            while((msg=blockingQueue.take().getMessage()) != "exit"){
                System.out.println("message is "+msg);
            }


        }catch(InterruptedException e){
            e.printStackTrace();

        }



    }
}




