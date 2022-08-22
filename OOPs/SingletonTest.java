class Singleton {
    private static Singleton s = null;
    private Singleton(){}
    static Singleton getInstance(){
        if(s==null)
            s = new Singleton();
        return s;
    }
}

public class SingletonTest {
    public static void main(String...args){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}