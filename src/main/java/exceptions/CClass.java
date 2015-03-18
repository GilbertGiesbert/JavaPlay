package exceptions;

/**
 * Copyright mediaworx berlin AG, Berlin, Germany
 * Creator: Joern Sattler, sattler@mediaworx.com
 * Date: 17.03.15
 * Time: 13:03
 * To change this template use File | Settings | File Templates.
 */
public class CClass {

    private static final String throwMsg = "this is thrown by "+CClass.class.getSimpleName();

    public static void doC()throws CException{
        throw new CException(throwMsg);
    }
}
