package com.pat.corejava;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class RWLockDemo {
    Map<String,String>   map  = new HashMap<>();
    ReentrantReadWriteLock reentrantReadWriteLock  = new ReentrantReadWriteLock();
    ReentrantReadWriteLock.ReadLock readLock =reentrantReadWriteLock.readLock();
    ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
    public void add(String key,String value){
        try{
            writeLock.lock();
            map.put(key,value);
        }finally {
            writeLock.unlock();
        }
    }

    public String getvalue(String key){
            try{
                writeLock.lock();
                return  map.get(key);
            }finally {
                    writeLock.unlock();
            }
    }








}
