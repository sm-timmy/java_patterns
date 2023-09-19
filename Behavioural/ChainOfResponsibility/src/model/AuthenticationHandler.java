package model;

import java.util.Map;
import java.util.Objects;

public class AuthenticationHandler extends BaseHandler{
    Map<String, String> users = Map.of("JohnBlack@gmail.com", "qwerty123");
    @Override
    public boolean isValid(User user) {
        String email = user.getEmail();
        String password = user.getPassword();
        if (users.containsKey(email)){
            return Objects.equals(users.get(email), password);
        }
        return false;
    }
}
