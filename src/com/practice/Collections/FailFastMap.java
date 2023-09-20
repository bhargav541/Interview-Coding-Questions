package com.practice.Collections;

import java.util.*;
import java.util.concurrent.*;

public class FailFastMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "bhargav");
        map.put(2, "amit panda");

        Iterator<Integer> it = map.keySet().iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            System.out.println(key + " " + map.get(key));
            map.put(3, "Kung fu panda");
        }
//        for(Integer key: map.keySet())
//        {
//            System.out.println(key+":"+map.get(key));
//        }
    }
}