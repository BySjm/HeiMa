package T5;

public class Text {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("王小平", 20, "Java");
        teacher.teach();
        Student student = new Student("李小乐", 18,90);
        student.kaoShi();
    }
}
