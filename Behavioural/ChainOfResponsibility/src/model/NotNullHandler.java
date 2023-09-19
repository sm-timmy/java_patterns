package model;

public class NotNullHandler extends BaseHandler{
    @Override
    public boolean isValid(User user) {
        return user.getEmail() != null && user.getPassword() != null;
    }
}
