package business.abstracts;

import entities.concretes.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void update(User user);
    void delete(int id);
    User get(String email);
    List<User> getAll();
}
