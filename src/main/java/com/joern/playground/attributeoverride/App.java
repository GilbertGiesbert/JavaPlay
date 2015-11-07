package com.joern.playground.attributeoverride;

/**
 * Copyright mediaworx berlin AG, Berlin, Germany
 * Creator: Joern Sattler, sattler@mediaworx.com
 * Date: 16.10.15
 * Time: 13:41
 * To change this template use File | Settings | File Templates.
 */
public class App {

    public static void main(String... args){

        Child c = new Child();

        System.out.println("- "+c.getColor());
        c.setColor("red");
        System.out.println("- "+c.getColor());
    }

}
