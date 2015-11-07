package com.joern.playground.staticclassvariable;

/**
 * Copyright mediaworx berlin AG, Berlin, Germany
 * Creator: Joern Sattler, sattler@mediaworx.com
 * Date: 10.07.15
 * Time: 17:17
 * To change this template use File | Settings | File Templates.
 */
public class App {


    public static void main(String... args){


        SomeClass c1 = new SomeClass();
        c1.fillMaps(" eins ");

        SomeClass c2 = new SomeClass();
        c2.fillMaps(" zwo ");

        SomeClass c3 = new SomeClass();
        c3.fillMaps(" drei ");


        System.out.println("--- eins:");
        c1.printMaps();

        System.out.println("--- zwo:");
        c2.printMaps();

        System.out.println("--- drei:");
        c3.printMaps();



    }

}
