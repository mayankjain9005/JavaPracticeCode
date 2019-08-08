package com.pat.corejava;


public class BinarySearch {
    private int binary_search(int[] array,int key){
          int start =0;
          int end =array.length-1;
          int mid = start+end/2;
          while(start < end ){
              if(array[mid] > key){
                  end=mid;
                  mid=start+end /2;
              }else if(array[mid] < key){
                  start=mid;
                  mid=start+end/2;
              }else{
                return  mid;
              }
          }
          return mid ;
    }
    public static  void main(String...args ){
         int[] array ={2,4,6,8,10,12,14};
         BinarySearch binarySearch =new BinarySearch();
         binarySearch.binary_search(array,14);
        System.out.println("the index of element is  "+binarySearch.binary_search(array,14));
}
}
