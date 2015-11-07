package com.joern.playground.staticclassvariable;

import java.util.HashMap;

/**
 * Copyright mediaworx berlin AG, Berlin, Germany
 * Creator: Joern Sattler, sattler@mediaworx.com
 * Date: 10.07.15
 * Time: 17:18
 * To change this template use File | Settings | File Templates.
 */
public class SomeClass {

    private HashMap<String, String> normalMap;
    private static HashMap<String, String> staticMap = new HashMap<String, String>();;

    public SomeClass(){
        normalMap = new HashMap<String, String>();
//        staticMap = new HashMap<String, String>();
    }

    public void fillMaps(String some){

        normalMap.put("n"+some, "n"+some);
        staticMap.put("s"+some, "s"+some);
    }

    public void printMaps(){

        System.out.println(hashMapToString(normalMap));
        System.out.println(hashMapToString(staticMap));

    }

    private String hashMapToString(HashMap<String, String> hashMap){

        StringBuilder sb = new StringBuilder();

        for(String key: hashMap.keySet()){
            sb.append(key+" | "+hashMap.get(key));
        }
        return ""+sb;
    }
}