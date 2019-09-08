package T9;

import java.util.ArrayList;
import java.util.Collection;

public class IDataOperationImpl implements IDataOperation<Student> {

    ArrayList<Student> list = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("z1", "增加了", "19", "SYHM"));
        System.out.println(list);
        Student student = new Student("z1", "增加了", "22", "SYHM");
        IDataOperationImpl iDataOperation = new IDataOperationImpl();
        boolean update = iDataOperation.update1(list, student);
        if (update)
            System.out.println(list);
    }

    @Override
    public boolean add(Student t) {
        for (Student student : list) {
            if (t.getId().equals(student.getId()))
                return false;
        }
        list.add(t);
        return true;
    }

    @Override
    //根据唯一标识删除一个数据
    public <T> boolean delete(T t) {
        Student student = get(t);
        if (student == null)
            return false;
        else
            return list.remove(student);
    }

    @Override
    //修改一个数据
    public <T> boolean update(Student student) {

        if (get(student.getId()) == null)
            return false;

        int index = 0;
        if (!list.contains(student)) {
            return add(student);
        } else {
            for (int i = 1; i < list.size(); i++) {
                if (student.getId().equals(list.get(i).getId()))
                    index = i;
            }
            list.set(index, student);
            return true;
        }
    }

    public <T> boolean update(ArrayList<Student> list, Student student) {
        if (get(list, student.getId()) == null)
            return false;

        int index = 0;
        for (int i = 1; i < list.size(); i++) {
            if (student.getId().equals(list.get(i).getId()))
                index = i;
        }
        list.set(index, student);
        return true;
    }

    public <T> boolean update1(ArrayList<Student> list, Student student) {

        Student stu = get(list, student.getId());

        stu.setAddress(student.getAddress());
        stu.setAge(student.getAge());
        stu.setName(student.getName());
        return true;

    }

    public <T> Student get(ArrayList<Student> list, T t) {
        if (list.isEmpty())
            System.out.println("没有学生该信息");
        else {
            for (Student student : list) {
                if (t.equals(student.getId()))
                    return student;
            }
        }
        return null;
    }

    @Override
    // 根据唯一表示查找一个数据 唯一标识是->id
    public <T> Student get(T t) {
        if (list.isEmpty())
            System.out.println("没有学生该信息");
        else {
            for (Student student : list) {
                if (t.equals(student.getId()))
                    return student;
            }
        }
        return null;
    }

    @Override
    // 查找所有数据
    public Collection<Student> getAll() {
        return list;
    }
}
