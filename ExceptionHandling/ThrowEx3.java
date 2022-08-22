class ThrowEx3 extends RuntimeException{
    ThrowEx3(String desc){
        super(desc);
    }
    public static void main(String...args){
        throw new ThrowEx3("MyExceptionClass_ExceptionDesc");
    }
}