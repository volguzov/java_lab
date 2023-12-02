public class StringMethods {
    public static void main(String[] args) {

        String str1 = "Hello, World!";
        String str2 = "Test string";

        // Длина строки
        int length = str1.length();
        System.out.println("1. String length str1: " + length);

        // Сравнение строк
        boolean isEqual = str1.equals(str2);
        System.out.println("2. str1a and str2 equal: " + isEqual);

        // Объединение строк
        String concatStr = str1.concat(" " + str2);
        System.out.println("3. Merged string: " + concatStr);

        // Извлечение подстроки
        String subStr = str1.substring(0, 5);
        System.out.println("4. Substring: " + subStr);

        // Поиск индекса подстроки
        int index = str2.indexOf("Java");
        System.out.println("5. First Occurrence Index 'Test' in str2: " + index);

        // Замена символов
        String replStr = str1.replace('o', '0');
        System.out.println("6. Replaced string: " + replStr);

        // Разделение строки на массив подстрок
        String[] parts = str2.split(" ");
        System.out.println("7. Split string: ");
        for (String part : parts) {
            System.out.println(part);
        }

        // Удаление пробелов
        String trimStr = "  Trim me  ".trim();
        System.out.println("8. Trimmed string: " + trimStr);

        // Определение, начинается ли строка с подстроки
        boolean startsWith = str1.startsWith("Hello");
        System.out.println("9. str1 starts with 'Hello': " + startsWith);

        // Определение, заканчивается ли строка на определенную подстроку
        boolean endsWith = str2.endsWith("string");
        System.out.println("10. str2 ends with 'string': " + endsWith);

        // Проверка, содержит ли другую подстроку или нет
        boolean contains = str2.contains("Test");
        System.out.println("11. str2 contains 'string': " + contains);

        // Лексическое сравнение строк
        int compareTo = str1.compareTo(str2);
        System.out.println("12. Result of comparison between str1 and str2: " + compareTo);

        // Верхний регистр
        String upperCase = str2.toUpperCase();
        System.out.println("13. str2 in upper case: " + upperCase);

        // Нижний регистр
        String lowerCase = str1.toLowerCase();
        System.out.println("14. str1 lower case: " + lowerCase);

        // Преобразование числа в строку
        int number = 46;
        String numString = String.valueOf(number);
        System.out.println("15. Number converted to text: " + numString);
    }
}