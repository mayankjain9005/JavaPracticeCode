package com.pat.corejava;

public class ReverseAString {
        public static  void main(String...args){
            String str="javainterview";
            char[] array=str.toCharArray();
            char temp;
            for(int i=0;i<array.length/2;i++){
            temp=array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=temp;
            }

            System.out.println(new String(array));
}
}
