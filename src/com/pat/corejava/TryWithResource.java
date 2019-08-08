package com.pat.corejava;


import java.io.Closeable;
import java.io.IOException;

class MyResource1 implements  AutoCloseable{
        public void close() throws IOException{
            System.out.println("closing resource 1");
        }
}
class MyResource2 implements Closeable{
            public void close() throws ArithmeticException{
                System.out.println("closing resource 2");
            }
}
public class TryWithResource {
public static  void  main(String...args){
    try(MyResource1 myResource1 = new MyResource1();MyResource2 myResource2=new MyResource2()){
        System.out.println("main method");
    }catch(IOException excp1){
        System.out.println("io exception is handle");
    }catch(ArithmeticException excep2){
       System.out.println("arithmetic exception is handled");
    }




}


}
