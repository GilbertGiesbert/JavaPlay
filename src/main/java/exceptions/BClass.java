package exceptions;

/**
 * Copyright mediaworx berlin AG, Berlin, Germany
 * Creator: Joern Sattler, sattler@mediaworx.com
 * Date: 17.03.15
 * Time: 13:03
 * To change this template use File | Settings | File Templates.
 */
public class BClass {

    private static final String throwMsg = "this is thrown by "+BClass.class.getSimpleName();

    public static void doB()throws BException{

        try{
            CClass.doC();
        } catch (Exception e) {
            throw new BException(throwMsg, e);
        }
    }
}
