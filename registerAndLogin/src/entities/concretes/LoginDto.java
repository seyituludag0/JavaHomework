package entities.concretes;

public class LoginDto {
    private String eMail;
    private String password;

    public String geteMail() {
        return eMail;
    }

    public LoginDto(){

    }
    public LoginDto(String eMail, String password){
        this.eMail = eMail;
        this.password = password;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
