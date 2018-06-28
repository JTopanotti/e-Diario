package models;

import controllers.HomeController;
import play.data.validation.Constraints.Validate;
import play.data.validation.Constraints.Validatable;

import javax.inject.Inject;
import java.util.concurrent.CompletionStage;

@Validate
public class UserLogin implements Validatable<String> {
	
    protected String username;
    protected String password;
    private final UserRepository userRepository;

    @Inject
    public UserLogin(UserRepository ur) {
    	this.userRepository = ur;
    }
    
    public String getUsername() {
    	return username;
    }
    
    public String getPassword() {
    	return password;
    }
    
    public void setUsername(String username) {
    	this.username = username;
    }
    
    public void setPassword(String password) {
    	this.password = password;
    }
    
    @Override
    public String validate() {
       /* CompletionStage<Boolean> authenticated =
                userRepository.authenticate(username, password);
        authenticated.

        if (!userRepository.authenticate(username, password)) {
            // You could also return a key defined in conf/messages
            return "Wrong Username and/or Password";
        }
       */ return null;

    }
}
