package com.joern.playground.regex;

import java.util.regex.Pattern;

/**
 * Copyright mediaworx berlin AG, Berlin, Germany
 * Creator: Joern Sattler, sattler@mediaworx.com
 * Date: 05.11.15
 * Time: 08:37
 */
public class RegexApp {



    public static void main(String... args){

        boolean match1 = Pattern.matches("a+", "aaa");

        boolean match2 = Pattern.matches("(?sm).*a+.*", "aa\n"+"bb");

        System.out.print(match1);
        System.out.print(match2);

    }

}

