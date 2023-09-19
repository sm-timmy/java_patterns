import model.*;

public class Main {
    public static void main(String[] args) {
        User user = new User("JohnBlack@gmail.com", "qwerty123");

        BaseHandler notNullHandler = new NotNullHandler();
        BaseHandler emailHandler = new EmailHandler();
        BaseHandler passwordHandler = new PasswordHandler();
        BaseHandler authenticationHandler = new AuthenticationHandler();

        notNullHandler.setNext(emailHandler);
        emailHandler.setNext(passwordHandler);
        passwordHandler.setNext(authenticationHandler);

        notNullHandler.handle(user);
    }
}