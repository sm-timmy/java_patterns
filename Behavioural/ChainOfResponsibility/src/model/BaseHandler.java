package model;

abstract public class BaseHandler implements Handler{
    Handler nextHandler;
    @Override
    public void handle(User user) {
        if (isValid(user)) {
            System.out.println(this.getClass().getName() + " passed!");
            if (nextHandler != null)
                nextHandler.handle(user);
            else
                System.out.println(user.getClass().getName() + " is valid.");
        }
        else  {
            System.out.println(this.getClass().getName() + " NOT passed!");
        }
    }

    @Override
    public void setNext(Handler next) {
        nextHandler = next;
    }

    abstract public boolean isValid(User user);
}
