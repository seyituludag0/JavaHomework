package core;

import business.abstracts.UserService;
import entities.concretes.LoginDto;
import entities.concretes.User;

public class GoogleAuthManagerAdapter implements ExternalAuthService{
    private UserService userService;


    public GoogleAuthManagerAdapter(UserService userService) {
        super();
        this.userService = userService;
    }


    @Override
    public void register(String email) {
        if(userExists(email)==false) {
            userService.add(null);
        }
        else {
            User user =userService.get(email);

            LoginDto dto=new LoginDto();
            dto.seteMail(user.geteMail());
            dto.setPassword(user.getPassword());

            login(dto);
        }
    }

    @Override
    public boolean userExists(String email) {
        if(userService.get(email)!=null)
        {
            return true;

        }
        return false;
    }

    @Override
    public void login(LoginDto dto) {
        if(dto!=null && dto.getPassword().equals(dto.getPassword())) {
            System.out.println("Başarıyla Giriş yaptınız.");
        }
        else {
            System.out.println("Kullanıcı adı veya şifreniz hatalı");
        }
    }
}
