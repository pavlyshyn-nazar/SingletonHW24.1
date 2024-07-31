package app;

public class Main {
    public static void main(String[] args) {
        // Отримання екземпляру логера
        Logger logger = Logger.getInstance();

        // Запис повідомлень
        logger.log("Перше повідомлення");
        logger.log("Друге повідомлення");

        // Інший клас, який також використовує логер
        AnotherClass anotherClass = new AnotherClass();
        anotherClass.doSomething();
    }
}


