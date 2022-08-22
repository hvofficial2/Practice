public class ExMethods {
    public static void main(String...args){
        System.out.println("FirstLine");
        try {
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println("StackTrace:");
            e.printStackTrace();
            System.out.println("###################");
            System.out.println(".toString()");
            System.out.println(e);
            System.out.println("###################");
            System.out.println(".getMessage()");
            System.out.println(e.getMessage());
        }
        System.out.println("LastLine");
    }
}
