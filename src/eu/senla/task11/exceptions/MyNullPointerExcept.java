package eu.senla.task11.exceptions;

public class MyNullPointerExcept extends RuntimeException{
    public MyNullPointerExcept() {
    }

    public MyNullPointerExcept(String message) {
        super(message);
    }

    public MyNullPointerExcept(String message, Throwable cause) {
        super(message, cause);
    }

    public MyNullPointerExcept(Throwable cause) {
        super(cause);
    }

    public MyNullPointerExcept(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


}
