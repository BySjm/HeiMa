package ComCase;

import java.util.Objects;

public abstract class Person {
    private int id;
    private String name;
    private String sex;
    private String birthday;
    private int age;

    public Person() {
    }

    public abstract String getType();

    public abstract String getWork();

    public Person(int id, String name, String sex, String birthday) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return " "+ id +
                "\t\t\t" + name +
                "\t\t      " + sex +
                "\t\t   " + birthday +
                "\t\t " + getAge() +
                "\t\t" + "我是一名" + getType() + "我的工作是" + getWork() ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(sex, person.sex) &&
                Objects.equals(birthday, person.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sex, birthday, age);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return (int) Utils.getAge(getBirthday());
    }

    public void setAge(int age) {
        this.age = age;
    }
}
