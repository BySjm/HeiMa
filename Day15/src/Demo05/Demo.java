package Demo05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 2    1
 * 3    2
 * 4    3
 * 5    4
 * 6    5
 * 7    0
 */
public class Demo {
    public static void main(String[] args) {
        for (int x = 0;  ; x++) {
            if (x % 2 == 1 && x % 3 == 2 && x % 4 == 3 && x % 5 == 4 && x % 6 == 5 && x % 7 == 0) {
                System.out.println(x);
                break;
            }
        }
    }
}
