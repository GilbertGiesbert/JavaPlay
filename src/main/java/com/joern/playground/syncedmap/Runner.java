package com.joern.playground.syncedmap;

/**
 * Copyright mediaworx berlin AG, Berlin, Germany
 * Creator: Joern Sattler, sattler@mediaworx.com
 * Date: 10.07.15
 * Time: 17:52
 * To change this template use File | Settings | File Templates.
 */
public class Runner implements Runnable{

    private String name;

    public Runner(String name){
        this.name = name;
    }

    public void run() {
        SomeClass c = new SomeClass();
        c.put(name, name);
    }
}