import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        long initialAcount = 100;
        long replenishment = 1100;
        long bonus;
        if (replenishment > 1000) {
           bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        long finalAccount = initialAcount + replenishment + bonus;
        System.out.println("finalAccount "+finalAccount);
        System.out.println("bonus "+bonus);

    }
}
