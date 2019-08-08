package com.pat.corejava;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


interface  Service{
     String getName();
     void execute();
}
class ServiceA implements Service{
    @Override
    public String getName() {
        return "service_a";
    }

    @Override
    public void execute() {
            System.out.println("service A is getting executed ");
    }
}
class ServiceB implements  Service{
    @Override
    public String getName() {
        return "service_b";
    }

    @Override
    public void execute() {
        System.out.println("service B is getting executed ");
    }
}

class InitialContext{
        public Object lookup(String name){
            if (null != name && name.equalsIgnoreCase("service_a")) {
                    return  new ServiceA();
            }else{
                    return  new ServiceB();
            }
        }
}

class Cache{
List<Service> lst ;
public Cache(){
lst =new ArrayList<Service>();
}
public void add(Service service){
    boolean flag =true;
    for(Service service1: lst){
        if(service.getName().equalsIgnoreCase(service1.getName())){
            flag=false;
        }
    }
    if(flag){
        lst.add(service);
    }



}
}
class ServiceLocator{
    private static  Cache cache=new Cache();
    public Service getService(String name){
        InitialContext initialContext= new InitialContext();
        Service object=(Service) initialContext.lookup(name);
        cache.add(object);
        return   object;
    }
}
public class ServiceLocatorDesignBean {
        public static void main(String...args){
            ServiceLocator serviceLocator = new ServiceLocator();

            serviceLocator.getService("service_a").execute();
            serviceLocator.getService("service_b").execute();






        }


}
