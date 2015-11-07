package com.joern.playground.syncedmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Copyright mediaworx berlin AG, Berlin, Germany
 * Creator: Joern Sattler, sattler@mediaworx.com
 * Date: 10.07.15
 * Time: 17:48
 * To change this template use File | Settings | File Templates.
 */
public class SomeClass {

    private static Map<String, String> map;

    static {
        map = Collections.synchronizedMap(new HashMap());;
    }



    public SomeClass(){
//        map = Collections.synchronizedMap(new HashMap());
    }

    public void put(String arg1, String arg2){
        map.put(arg1, arg2);
    }

    public String hashMapToString(Map map){

        StringBuilder sb = new StringBuilder();

        for(Object key: map.keySet()){
            sb.append(key+":"+map.get(key));
        }
        return ""+sb;
    }

    public Map<String, String> getMap() {
        return map;
    }
}
