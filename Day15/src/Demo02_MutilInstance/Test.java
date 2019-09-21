package Demo02_MutilInstance;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Pigeon pigeon = Pigeon.getInstance();
            System.out.println(pigeon);
        }
    }
}
