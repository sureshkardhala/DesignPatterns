package Singleton;

import com.sun.source.tree.SynchronizedTree;

/*
    Singleton for thread safe. When two threads at one time comes to getInstance.
    it will create two objects. So we use synchronized
 */
public class SynchronizedSingleton1 {
    private static SynchronizedSingleton1 synchronizedSingleton1 = null;
    private  SynchronizedSingleton1(){};

    //HAve to implement
    public static  SynchronizedSingleton1 getSynchronizedSingleton1(){
        return null;
    }
}
