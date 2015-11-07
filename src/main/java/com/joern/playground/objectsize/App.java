package com.joern.playground.objectsize;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright mediaworx berlin AG, Berlin, Germany
 * Creator: Joern Sattler, sattler@mediaworx.com
 * Date: 30.10.15
 * Time: 19:43
 */
public class App {

    public static void main(String... args){
        List<WidgetConfigurationEntryWithLink> l1 = new ArrayList<>(666);
        List<WidgetConfigurationEntryWithLink> l2 = new ArrayList<>(666);
        List<WidgetConfigurationEntryWithLink> l3 = new ArrayList<>(0);

        long s1 = ObjectSizeFetcher.getObjectSize(l1);
        long s2 = ObjectSizeFetcher.getObjectSize(l2);
        long s3 = ObjectSizeFetcher.getObjectSize(l3);

        System.out.println("s1: "+s1);
        System.out.println("s2: "+s2);
        System.out.println("s3: "+s3);
    }

}
