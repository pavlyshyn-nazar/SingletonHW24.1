package app;

public class Logger {

    private static Logger instance;

    private Logger() {
        // Приватний конструктор, недоступний ззовні
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        // Реалізація логування, наприклад, у файл або консоль
        System.out.println(message);
    }
}

