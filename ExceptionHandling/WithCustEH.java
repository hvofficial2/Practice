class WithCustEH{
    public static void main(String...args){
        System.out.println("FirstLine");
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException ae){
            System.out.println("Arithmetic Exception");
        }
        System.out.println("LastLine");
    }
}