package core.adapters;

import amazonEmail.AmazonEmailManager;

public class AmazonMailManagerAdapter implements EmailService {
    AmazonEmailManager amazonEmailManager;
    public AmazonMailManagerAdapter() {
        amazonEmailManager = new AmazonEmailManager();
    }

    @Override
    public void send(String email, String message) {
        amazonEmailManager.send(email,message);
    }
}
