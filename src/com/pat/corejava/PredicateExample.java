package com.pat.corejava;

import java.util.function.Predicate;

public class PredicateExample {
  //test the string starts witj java or not

  static Predicate<String> str_predicate= s -> s.startsWith("java");

        public static void main(String...args){

                 System.out.println(str_predicate.test("java test"))  ;

                 System.out.println(str_predicate.test("c test"));


    }


}
