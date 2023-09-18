import model.MyLogger;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        MyLogger.Log("Created logger");
        MyLogger.Log("Initialize variable a");
        int a = 5;
        MyLogger.Log("Initialize variable b");
        int b = 0;
        int c;
        try {
            MyLogger.Log("Try to execute division a/b");
            c = a / b;
        }
        catch (Exception e) {
            MyLogger.Log(e.toString());
        }

    }
}