package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class InMemoryUserDao implements UserDao {

    private ArrayList<User> users = new ArrayList<User>();

    public InMemoryUserDao() {
        User seyit = new User(1,"Seyit","Uludag", "seyit@seyit.com", "123456",true);
        User burak = new User(2,"Burak","Tağıl", "burak@burak.com", "123456",true);

        users.add(seyit);
        users.add(burak);
    }

    @Override
    public void add(User user) {
        users.add(user);
        System.out.println(user.getFirstName() + " isimli kullanıcı kaydedildi");
    }

    @Override
    public void update(User user) {
        User userToUpdate = users.stream().filter(u->u.getId()==user.getId()).findFirst().orElse(null);
        userToUpdate.setFirstName(user.getFirstName());
        userToUpdate.setLastName(user.getLastName());
        userToUpdate. seteMail(user.geteMail());
        userToUpdate.setPassword(user.getPassword());
        userToUpdate.setVerify(user.isVerify());
    }

    @Override
    public void delete(int id) {
        User userToUpdate = users.stream().filter(u->u.getId()==id).findFirst().orElse(null);
        users.remove(id);
    }

    @Override
    public User get(String email) {
        User user = users.stream().filter(u->u.geteMail()==email).findFirst().orElse(null);
        return user;
    }

    @Override
    public List<User> getAll() {
        return users;
    }
}
