package Base64Demo;

import java.util.Base64;
import java.util.UUID;

public class TestDemo {
    public static void main(String[] args) {
        String str = "HelloWord";
        String encodeToString = Base64.getEncoder().encodeToString(str.getBytes());
        System.out.println(encodeToString);
        byte[] bytes = Base64.getDecoder().decode(encodeToString);
        System.out.println(new String(bytes));
        //对MiMe类型
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);

        String encodeToString1 = Base64.getMimeEncoder().encodeToString(uuid.toString().getBytes());
        System.out.println(encodeToString1);
        byte[] bytes1 = Base64.getDecoder().decode(encodeToString1);
        System.out.println(new String(bytes1));
    }
}
