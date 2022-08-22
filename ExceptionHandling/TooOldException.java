package UserDefinedException;

public class TooOldException extends RuntimeException{
    TooOldException(String desc){
        super(desc);
    }
}
