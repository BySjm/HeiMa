package Test;

import java.io.*;

public class ObjectsStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("1.txt"));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("1.txt"));
        oos.writeObject(new Dog("阿拉斯加", 1));
        oos.writeObject(new Dog("大狼狗", 2));
        oos.writeObject(new Dog("小母狗", 3));
        oos.writeObject(new Dog("小狼狗", 4));
        Object o1 = ois.readObject();
        System.out.println(o1);
        ois.close();
        oos.close();
    }
}
