class Logger{
    private static Logger instance;

    private Logger() {
        // we create private constructor to prevent instantiation
        // because the constructor is private, we cannot create an object of Logger class outside of it
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}

public class test {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println(logger1 == logger2); 
    }
}