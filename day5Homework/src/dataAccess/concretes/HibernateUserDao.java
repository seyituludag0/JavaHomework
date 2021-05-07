package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.List;

public class HibernateUserDao implements UserDao {

    @Override
    public void add(User user) {
        System.out.println();
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public User get(String email) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }


}
