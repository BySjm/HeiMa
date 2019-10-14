package cn.bysjm.dao;

import cn.bysjm.domain.Contact;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ContactDao {

    private static List<Contact> list = new ArrayList<>();
    private Integer num = 3;
    private Iterator<Contact> iterator = list.iterator();

    static {
        list.add(new Contact("1","张三","男",47,"北京","123456","123456@qq.com"));
        list.add(new Contact("2","张三","男",47,"天津","123456","123456@qq.com"));
    }

    public List<Contact> findAll() {
        return list;
    }

    public void save(Contact contact) {
        contact.setId(String.valueOf(num++));
        list.add(contact);
    }

    public void delete(String id) {
        while (iterator.hasNext()){
            if (id.equals(iterator.next().getId())){
                iterator.remove();
            }
        }
    }

    public Contact findById(String id) {
        for (Contact contact : list) {
            if (id.equals(contact.getId())){
                return contact;
            }
        }
        return null;
    }

    public void update(Contact contact) {
        ListIterator<Contact> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            if (contact.getId().equals(listIterator.next().getId())){
                listIterator.remove();
                listIterator.add(contact);
            }
        }
    }
}
