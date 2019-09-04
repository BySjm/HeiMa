package ComCase;

public class Teacher extends Person{

    public Teacher() {
    }

    public Teacher(int id, String name, String sex, String birthday) {
        super(id, name, sex, birthday);
    }

    @Override
    public String getType() {
        return "讲课";
    }

    @Override
    public String getWork() {
        return "老师";
    }
}
