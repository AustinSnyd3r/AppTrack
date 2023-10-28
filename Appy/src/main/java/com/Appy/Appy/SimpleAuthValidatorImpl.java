package com.Appy.Appy;
import org.subethamail.smtp.MessageContext;
import org.springframework.context.annotation.Configuration;
import org.subethamail.smtp.auth.LoginFailedException;
import org.subethamail.smtp.auth.UsernamePasswordValidator;

@Configuration
public class SimpleAuthValidatorImpl implements UsernamePasswordValidator{
     private final String CREDENTIALS_LOGIN = "superus3r";
    private final String CREDENTIALS_PASSWORD = "passw0rd";

    @Override
    public void login(String username, String password, MessageContext context) throws LoginFailedException {
        if(CREDENTIALS_LOGIN.equals(username) && CREDENTIALS_PASSWORD.equals(password)){
            System.out.println("Authenticated successfully");
        }else{
            System.err.println("Invalid authentication !");
            throw new LoginFailedException();
        }
    }
}
