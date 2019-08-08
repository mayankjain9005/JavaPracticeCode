package com.pat.corejava;

import java.util.Arrays;

public class InsertionSort {
    public static  void main(String[] args){
          int[] array={5,4,3,2,1};
           for(int i=0;i<array.length;i++){
               for(int j=i;j>0;j--){
                   if(array[j] < array[j-1]){
                        int temp = array[j];
                        array[j]=array[j-1];
                        array[j-1]=temp;

                   }
               }
           }
        Arrays.stream(array).forEach(System.out::println);









    }


}
