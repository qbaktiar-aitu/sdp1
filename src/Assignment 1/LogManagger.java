// Task 2: Singleton Pattern

class LogManager {
    private static LogManager uniqueInstance;

    private LogManager() {}

    public static LogManager getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new LogManager();
        }
        return uniqueInstance;
    }

    public void logMessage(String message) {
        System.out.println("Logging: " + message);
    }
}
