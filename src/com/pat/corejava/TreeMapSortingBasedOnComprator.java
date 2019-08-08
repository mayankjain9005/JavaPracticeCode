package com.pat.corejava;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
public class TreeMapSortingBasedOnComprator {
public static  void  main(String...args){
    Map<String,String> map = new TreeMap<String,String>(new Comparator<String>() {
        @Override
        public int compare(String  o1, String o2) {
             return o2.compareTo(o1);

        }
    });

    map.put("a","1");
    map.put("b","1");
    map.put("c","1");

    map.forEach((k,v)-> System.out.println("key is "+k+" and value is "+v));






}


}
