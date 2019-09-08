package T11;

import java.util.ArrayList;

public class MoNiStack {

    public void push(ArrayList<String> list, String str) {
        list.add(0, str);
    }

    public String pop(ArrayList<String> list, String str) {
        return list.remove(list.size() - 1);
    }

    public int getSize(ArrayList<String> list) {
        return list.size();
    }
}
