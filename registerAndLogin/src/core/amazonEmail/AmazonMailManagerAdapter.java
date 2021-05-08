package core.amazonEmail;

import amazonMail.AmazonMailManager;
import business.abstracts.UserService;
import core.utils.EmailService;

public class AmazonMailManagerAdapter implements EmailService {

    private AmazonMailManager amazonMailManager;

    public AmazonMailManagerAdapter() {
        super();
        this.amazonMailManager = new AmazonMailManager();
    }

    @Override
    public void send(String email, String message) {
        amazonMailManager.send(email, message);


    }
}
