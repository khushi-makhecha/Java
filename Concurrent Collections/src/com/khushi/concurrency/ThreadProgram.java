// NOT TO BE IMPLEMENTED

package com.khushi.concurrency;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadProgram {
    public static void main(String[] args) {
        show();
    }

    public static void show(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"a");
        map.get(1);
        map.remove(1);
    }
}

/* Concurrency and Race condition occurs in this case as all threads try to execute the mentioned tasks.
    Thus, this issue must be solved. In this case, it can be done by using 'Concurrent Collection'.
*/


// SOLUTION TO ABOVE RACE CONDITION :

//    public static void show(){
//        Map<Integer, String> map = new ConcurrentHashMap<>();
//        map.put(1,"a");
//        map.get(1);
//        map.remove(1);
//    }
