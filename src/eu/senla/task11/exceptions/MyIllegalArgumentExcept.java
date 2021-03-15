package eu.senla.task11.exceptions;

public class MyIllegalArgumentExcept extends RuntimeException{
    public MyIllegalArgumentExcept() {
    }

    public MyIllegalArgumentExcept(String message) {
        super(message);
    }

    public MyIllegalArgumentExcept(String message, Throwable cause) {
        super(message, cause);
    }

    public MyIllegalArgumentExcept(Throwable cause) {
        super(cause);
    }

    public MyIllegalArgumentExcept(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
