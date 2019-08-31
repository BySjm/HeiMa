package T8;

public class Text {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer(666, "傅红雪");
        Tutor tutor = new Tutor(668, "顾棋");
        Maintainer maintainer = new Maintainer(686, "庖丁");
        Buyer buyer = new Buyer(888, "景甜");
        lecturer.work();
        tutor.work();
        maintainer.work();
        buyer.work();
    }
}
