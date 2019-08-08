package com.pat.corejava;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// print the employees whose joining date lie after year 2016
class Employee{

         String name;

         int joning_year;
        public Employee(String name,int joiningYear){
            this.name =name;
            this.joning_year=joiningYear;
        }
        public String toString(){
            return  "name[ "+ name +" and  joining year [ "+joning_year+" ]";
        }

}

class Predicate_JoinigYear {

   static Predicate<Employee> predicate_year = (emp) ->((Employee)emp).joning_year > 2016;

}
public class Example {
            public static  void  main(String...args){
            List<Employee> lst = new ArrayList<>();
            Employee employee1=new Employee("abc",2017);
            Employee employee2=new Employee("abc",2015);
            lst.add(employee1);
            lst.add(employee2);

            List<Employee> lstJoiningDateAfter2016=lst.stream().filter(Predicate_JoinigYear.predicate_year).collect(Collectors.toList());

            lstJoiningDateAfter2016.forEach(emp1 -> System.out.print(emp1));













        }






}
