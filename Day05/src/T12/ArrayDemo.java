package T12;

public class ArrayDemo<E> {

    private Object[] data = new Object[10];
    private int index = 0;

    public void addElement(E e) {
        if (index >= data.length) {
            int length = (int) (data.length * 1.5);
            Object[] temp = new Object[length];
            System.arraycopy(data, 0, temp, 0, data.length);
            data = temp;
            temp = null;
        }
        data[index++] = e;
    }

    //获取添加的数据总数
    public int size() {
        return index;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object datum : data) {
            sb.append((datum.toString())).append(",");
        }

        return sb.replace(sb.length() - 1, sb.length(), "]").toString();
    }
}
