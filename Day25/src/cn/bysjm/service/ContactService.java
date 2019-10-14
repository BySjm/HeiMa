package cn.bysjm.service;

import cn.bysjm.dao.ContactDao;
import cn.bysjm.domain.Contact;

import java.util.List;
import java.util.Map;

public class ContactService {

    ContactDao contactDao = new ContactDao();

    public List<Contact> findAll() {
        List<Contact> list = contactDao.findAll();
        return list;
    }

    public void save(Contact contact) {
        contactDao.save(contact);
    }

    public void delete(String id) {
        contactDao.delete(id);
    }

    public Contact findById(String id) {
        Contact contact = contactDao.findById(id);
        return contact;
    }

    public void update(Contact contact) {
        contactDao.update(contact);
    }
}
