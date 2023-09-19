package model;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailHandler extends BaseHandler{

    @Override
    public boolean isValid(User user) {
        String email = user.getEmail();
        Pattern pattern = Pattern.compile("^[A-Za-z]{1}[\\w\\d]+@\\w+\\.\\w");
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }
}
