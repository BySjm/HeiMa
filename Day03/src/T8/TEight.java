package T8;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TEight {
    public static void main(String[] args) {
        String[] nums = {"3.22","8.1","7","2.5","3.1","7.77","8.0","9.21"};
        BigDecimal bigDecimal = new BigDecimal("0");
        for (int i = 0; i < nums.length; i++) {
            BigDecimal bigDecimal1 = new BigDecimal(nums[i]);
            bigDecimal = bigDecimal.add(bigDecimal1);
        }
        System.out.println("AVG:" + bigDecimal.divide(BigDecimal.valueOf(nums.length), 2, RoundingMode.HALF_UP));
    }
}
