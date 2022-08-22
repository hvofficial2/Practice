package UserDefinedException;

public class TooYoungException extends RuntimeException{
    TooYoungException(String desc){
        super(desc);
    }
}
