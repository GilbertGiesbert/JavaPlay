package exceptions;

/**
 * Copyright mediaworx berlin AG, Berlin, Germany
 * Creator: Joern Sattler, sattler@mediaworx.com
 * Date: 17.03.15
 * Time: 13:03
 * To change this template use File | Settings | File Templates.
 */
public class BException extends Exception{

    public BException(String msg, Exception e) {
        super(msg, e);
    }
}
