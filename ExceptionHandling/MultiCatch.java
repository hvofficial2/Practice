public class MultiCatch {
    public static void main(String...args){
        System.out.println("Try with multiple catch blocks");
        try{}
        catch(ArithmeticException ae){}
        catch(NullPointerException npe){}
        catch(ArrayIndexOutOfBoundsException aie){}
        catch(Exception e){}
    }
}
