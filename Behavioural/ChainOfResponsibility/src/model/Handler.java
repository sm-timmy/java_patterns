package model;

import java.nio.file.attribute.UserPrincipal;

public interface Handler {
    void handle(User user);

    void setNext(Handler next);
}
