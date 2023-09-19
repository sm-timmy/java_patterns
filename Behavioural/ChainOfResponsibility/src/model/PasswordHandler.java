package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordHandler extends BaseHandler{
    @Override
    public boolean isValid(User user) {
        String password = user.getPassword();
        Pattern pattern = Pattern.compile("^[A-Za-z0-9]{8,20}");
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }
}
