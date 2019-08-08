package com.pat.corejava;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFileInJava8 {

    public static  void main(String...args){
        String  filepath="C:\\Users\\Mayankjain9005\\IdeaProjects\\javapracticeprojects\\src\\com\\readme.txt";
        ReadFileInJava8 readFileInJava8 = new ReadFileInJava8() ;
        int result=readFileInJava8.getcount(filepath,"mayank");
        System.out.println("result :::::::::::"+result);
}

public int getcount(String filename,String word){
    List<String> lst=null;
    try{
        Stream<String> stream= Files.lines(Paths.get(filename)) ;
        lst = stream.filter(s-> s.equals(word)).collect(Collectors.toList());
    }catch(Exception e){
        e.printStackTrace();
    }
   return  lst.size();
}
}
