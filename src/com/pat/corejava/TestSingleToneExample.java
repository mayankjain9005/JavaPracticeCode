package com.pat.corejava;
import java.io.Serializable;
class SingleToneExample implements Serializable,Cloneable {
    private static  SingleToneExample singleToneExample=null;
    private SingleToneExample() {

    }
    public static SingleToneExample  getInstance() {
        if(null  == singleToneExample){
           synchronized (SingleToneExample.class){
                singleToneExample=new SingleToneExample();
            }
}
        return  singleToneExample;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("cloning is not allowed in single tone !!");
    }
}
public class TestSingleToneExample extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(SingleToneExample.getInstance().hashCode());
        }
    }
    public static void main(String...args) throws CloneNotSupportedException{
         SingleToneExample singleToneExample=  SingleToneExample.getInstance();
       //     SingleToneExample singleToneExample1=(SingleToneExample) singleToneExample.clone();

        TestSingleToneExample testSingleToneExample1 =new TestSingleToneExample();
        TestSingleToneExample testSingleToneExample2 =new TestSingleToneExample();
        Thread t = new Thread(testSingleToneExample1);
        t.start();

        Thread t1 = new Thread(testSingleToneExample2);
        t1.start();




    }
}
