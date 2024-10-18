public class Main {
    // Логгер с параметром для типа сообщения
    public static void log(String message, String level) {
        System.out.println(level + ": " + message);
    }

    // Метод для подключения к базе данных
    public static void connectToDatabase() {
        String connectionString = "Server=myServer;Database=myDb;User Id=myUser;Password=myPass;";
        // Логика подключения к базе данных
        log("Подключение к базе данных: " + connectionString, "INFO");
    }

    // Логирование с использованием строки подключения
    public static void logToDatabase(String message) {
        String connectionString = "Server=myServer;Database=myDb;User Id=myUser;Password=myPass;";
        // Логика записи лога в базу данных
        log("Запись лога в базу данных: " + connectionString, "INFO");
    }

    // Обработка чисел с простыми условиями
    public static void processNumbers(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return;
        }

        for (int number : numbers) {
            if (number > 0) {
                System.out.println(number);
            }
        }
    }

    // Печать положительных чисел
    public static void printPositiveNumbers(int[] numbers) {
        for (int number : numbers) {
            if (number > 0) {
                System.out.println(number);
            }
        }
    }

    // Деление с проверкой деления на ноль
    public static int divide(int a, int b) {
        if (b == 0) {
            return 0; // Возвращаем 0 при делении на 0
        }
        return a / b;
    }

    // Работа с пользователями: сохранение и отправка письма
    public static class User {
        private String name;
        private String email;

        public User(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public void saveToDatabase() {
            // Логика сохранения пользователя
            log("Сохранение пользователя: " + name, "INFO");
        }

        public void sendEmail() {
            // Логика отправки письма
            log("Отправка письма на email: " + email, "INFO");
        }
    }

    // Генерация отчётов
    public static void generateReport(String format) {
        switch (format.toLowerCase()) {
            case "pdf":
                log("Генерация PDF отчета", "INFO");
                break;
            case "excel":
                log("Генерация Excel отчета", "INFO");
                break;
            case "html":
                log("Генерация HTML отчета", "INFO");
                break;
            default:
                log("Неподдерживаемый формат: " + format, "ERROR");
                throw new IllegalArgumentException("Unsupported format: " + format);
        }
    }

    // Чтение файла с возможностью буферизации
    public static String readFile(String filePath) {
        // Упрощённая логика чтения файла
        log("Чтение файла: " + filePath, "INFO");
        return "file content";
    }

    // Точка входа в программу
    public static void main(String[] args) {
        // Пример логирования
        log("Программа запущена", "INFO");

        // Подключение к базе данных
        connectToDatabase();

        // Пример обработки чисел
        processNumbers(new int[]{1, 2, 3, -1, -5, 0});

        // Печать положительных чисел
        printPositiveNumbers(new int[]{1, -2, 3, 4});

        // Пример деления с проверкой на деление на ноль
        int result = divide(10, 0);
        System.out.println("Результат деления: " + result);

        // Работа с пользователями
        User user = new User("John Doe", "john@example.com");
        user.saveToDatabase();
        user.sendEmail();

        // Генерация отчёта
        generateReport("pdf");

        // Чтение файла
        readFile("myfile.txt");
    }
}
