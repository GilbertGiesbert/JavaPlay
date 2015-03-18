package exceptions;

/**
 * Copyright mediaworx berlin AG, Berlin, Germany
 * Creator: Joern Sattler, sattler@mediaworx.com
 * Date: 17.03.15
 * Time: 13:03
 * To change this template use File | Settings | File Templates.
 */
public class AClass {

    private static final String throwMsg = "this is thrown by "+AClass.class.getSimpleName();

    public static void doA()throws AException{

        try{
            BClass.doB();
        } catch (Exception e) {
            throw new AException(throwMsg, e);
        }
    }
}
