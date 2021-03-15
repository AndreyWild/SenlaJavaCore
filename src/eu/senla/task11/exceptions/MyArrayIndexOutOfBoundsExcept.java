package eu.senla.task11.exceptions;

public class MyArrayIndexOutOfBoundsExcept extends IndexOutOfBoundsException{
    public MyArrayIndexOutOfBoundsExcept() {
    }

    public MyArrayIndexOutOfBoundsExcept(String s) {
        super(s);
    }
}
