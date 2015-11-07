package com.joern.playground.syncedmap;

/**
 * Copyright mediaworx berlin AG, Berlin, Germany
 * Creator: Joern Sattler, sattler@mediaworx.com
 * Date: 10.07.15
 * Time: 17:47
 * To change this template use File | Settings | File Templates.
 */
public class App {


    public static void main(String... args){

        Thread t1 = new Thread(new Runner("eins"));
        t1.start();

        Thread t2 = new Thread(new Runner("zwo"));
                t2.start();

        Thread t3 = new Thread(new Runner("drei"));
                t3.start();

        Thread t4 = new Thread(new Runner("vier"));
                t4.start();

        Thread t5 = new Thread(new Runner("fünf"));
                        t5.start();

        SomeClass c = new SomeClass();

        System.out.println("result:");
        System.out.println(c.hashMapToString(c.getMap()));

    }
}
