package Exceptions;

public class AgeNotValidException extends RuntimeException{

    public AgeNotValidException(String s){
            super(s);
    }

    public AgeNotValidException(String s, Throwable t){
        super(s,t);
    }
}
