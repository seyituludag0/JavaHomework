package business.concretes;

import business.abstracts.UserService;
import core.amazonEmail.AmazonMailManagerAdapter;
import core.utils.EmailService;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.InMemoryUserDao;
import entities.concretes.User;

import java.util.List;

public class UserManager implements UserService {
    private  EmailService eMailService;
    private UserDao userDao;

    public UserManager(UserDao userDao, EmailService emailService) {
        this.userDao = userDao;
        this.eMailService = emailService;
    }


    @Override
    public void add(User user) {
        if(userValidate(user)) {
            userDao.add(user);

            eMailService.send(user.geteMail(), "Kayıt Olundu");
        }
    }

    @Override
    public void update(User user) {
        if (userValidate(user)){
            userDao.update(user);
        }
    }

    @Override
    public void delete(int id) {
        userDao.delete(id);
        System.out.println(id + " Id'li kullanıcı silindi");
    }

    @Override
    public User get(String email) {
        return userDao.get(email);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    public boolean userValidate(User user){
        if (user.getFirstName().length()>2 && user.getLastName().length()>2){
            return true;
        }
        System.out.println("Ad ve soyad en az 2 karakter olmalıdır.");
        return false;
    }

}
