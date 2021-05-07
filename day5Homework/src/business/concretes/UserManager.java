package business.concretes;

import business.abstracts.UserService;
import core.adapters.EmailService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.List;

public class UserManager implements UserService {
    private UserDao userDao;
    private EmailService emailService;

    public UserManager(UserDao userDao, EmailService emailService) {
        this.userDao = userDao;
        this.emailService = emailService;
    }

    @Override
    public void add(User user) {
        //if(userValidate(user)) {
        userDao.add(user);
        System.out.println("Log: " + user.geteMail());
        emailService.send(user.geteMail(), "Kayıt oldunuz.");
        //}
    }

    @Override
    public void add(String email) {
        User user =new User();
        user.seteMail(email);
        userDao.add(user);
        System.out.println("Log2: " + user.geteMail());
        emailService.send(email,"Kayıt oldunuz.");
    }

    @Override
    public void update(User user) {
        if(userValidate(user)) {
            userDao.update(user);
            System.out.println(user.getId() + " Id'li kullanıcı bilgilerini güncelledi");
        }
    }

    @Override
    public void delete(int id) {
        userDao.delete(id);
    }

    @Override
    public User get(String email) {
        return userDao.get(email);
    }

    @Override
    public List<User> getAll() {
        for (User user: userDao.getAll()) {
            System.out.println("Id: " + user.getId() +" "+ "Ad Soyad : " + user.getFirstName() +" "+
                    user.getLastName() + " Email: " + user.geteMail());
        }
        return userDao.getAll();
    }

    public boolean userValidate(User user) {
        if(user.getFirstName().length()>=2 && user.getLastName().length()>=2) {
            return true;
        }
        System.out.println("Adınız ve soyadınız minimum 2 karakter olmalı.");
        return false;
    }

}
