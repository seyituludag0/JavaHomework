package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class InMemoryUserDao implements UserDao {
    private List<User> users = new ArrayList<>();

    public InMemoryUserDao() {
//        User user1 = new User(1,"Seyit","Uludag","seyit@gmail.com","123456",true);
//        User user2 = new User(2,"Eren","Uludag","eren@gmail.com","654321",true);
//
//        users.add(user1);
//        users.add(user2);
    }

    @Override
    public void add(User user) {
        users.add(user);
    }

    @Override
    public void update(User user) {
        User userToUpdate = users.stream().filter(u -> u.getId()==user.getId()).findFirst().orElse(null);
        userToUpdate.setFirstName(user.getFirstName());
        userToUpdate.setLastName(user.getLastName());
        userToUpdate.seteMail(user.geteMail());
        userToUpdate.setPassword(user.getPassword());
        userToUpdate.setVerify(user.isVerify());
    }

    @Override
    public void delete(int id) {
        User userToDelete = users.stream().filter(u -> u.getId()==id).findFirst().orElse(null);
        users.remove(id);
    }

    @Override
    public User get(String email) {
        User user = users.stream().filter(u -> u.geteMail() == email).findFirst().orElse(null);
        return user;
    }

    @Override
    public List<User> getAll() {
        return users;
    }
}
