package business.concretes;

import business.abstracts.AuthService;
import business.abstracts.UserService;
import core.utils.Utils;
import entities.concretes.LoginDto;
import entities.concretes.User;

public class AuthManager implements AuthService {
    private UserService userService;

    public AuthManager(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void register(User user) {
        if (userValidate(user) && passwordValidate(user.getPassword()) && userExists(user.geteMail()) == false
                && Utils.emailValidate(user.geteMail())) {

            userService.add(user);

        } else {
            System.out.println("Kayıt başarısız");
        }
    }

    @Override
    public void verify(User user, String token) {
        if (user != null && token.length()>20) {
            User existUser = userService.get(user.geteMail());
            existUser.setVerify(true);

            userService.update(existUser);
            System.out.println("Email doğrulandı");
        }
        else{
            System.out.println("Email doğrulanamadı");
        }
    }

    @Override
    public boolean userExists(String email) {
        User user = userService.get(email);
        if (user == null){
            return false;
        }
        System.out.println(email + " zaten kullanımda");
        return true;
    }

    @Override
    public void login(LoginDto dto) {
        User user = userService.get(dto.geteMail());
        if (user!= null && user.getPassword().equals(dto.getPassword())) {
            System.out.println("Giriş başarılı");
        }
        System.out.println("Giriş başarısız");
    }

    private boolean userValidate(User user){
        if (!user.getFirstName().isEmpty() && !user.getLastName().isEmpty() && !user.geteMail().isEmpty() &&
                !user.getPassword().isEmpty()){
            return true;
        }
        return false;
    }

    private boolean passwordValidate(String password){
        if (password.length()>=6){
            return true;
        }
        System.out.println("Şifreniz 6 karakterden daha uzun veya eşit olmalıdır.");
        return false;
    }
}
