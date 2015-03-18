package exceptions;

import org.apache.commons.lang.exception.ExceptionUtils;

public class App {

    public static void main(String[] args) {

        new App(). start();

    }

    private void start(){

        try{
            AClass.doA();
        } catch (Exception e) {

            Class suspect = CException.class;

            boolean containsCause = containsCause(e, suspect);

            System.out.println("e ["+e.getClass().getSimpleName()+"] contains ["+suspect.getSimpleName()+"]: "+containsCause);
        }

    }

    private boolean containsCause(Exception e, Class throwable){

        int indexOfThrowable = ExceptionUtils.indexOfThrowable(e, throwable);
        return indexOfThrowable > -1 ? true : false;
    }
}
