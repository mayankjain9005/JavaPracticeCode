package com.pat.corejava;

import java.util.ArrayList;
import java.util.List;

public class SubStringMethodOfStringBuilder {
    public static void main(String...args){
        StringBuilder stringBuilder=new StringBuilder("Mayank");
        String s2 ="Jain";
        stringBuilder.append(s2);
        stringBuilder.substring(6);
        System.out.println(stringBuilder.indexOf("Jain"));

}


}
