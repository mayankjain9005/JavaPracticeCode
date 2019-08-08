package com.pat.corejava;
import java.util.Arrays;
public class FindAValueInArray {
    public static void main(String[] args) {
        Object[] array ={1, 2, 3, 4, 5};
        System.out.println(check(array,10));
    }
    private static boolean check(Object[] array, Object value) {
        return Arrays.stream(array).anyMatch(object -> object.equals(value));
    }
}

