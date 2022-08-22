package UserDefinedException;

public class TestMatch {
    public static void main(String... args) {
        int age = Integer.parseInt(args[0]);
        if (age > 60)
            throw new TooOldException("You are too old to get married!");
        else if (age < 20)
            throw new TooYoungException("You are too young to get married!");
        else
            System.out.println("You will get married soon!");
    }
}
