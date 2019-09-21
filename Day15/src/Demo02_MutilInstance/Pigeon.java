package Demo02_MutilInstance;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.ArrayList;

public class Pigeon {
    private String name;
    private int age;

    private Pigeon() {

    }

    private Pigeon(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private static final int maxCount = 5;
    private static final ArrayList<Pigeon> list = new ArrayList<>();

    static {
        for (int i = 0; i < maxCount; i++) {
            list.add(new Pigeon("小" + i + "包", 20));
        }
    }

    public static Pigeon getInstance() {
        return list.get((int) (Math.random() * maxCount));
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
