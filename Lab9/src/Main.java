import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            // Имя класса, который нужно создать
            String className = "SampleClass";

            // Имя метода, который нужно выполнить
            String methodName = "sampleMethod";

            // Загружаем класс по имени
            Class<?> clazz = Class.forName(className);

            // Получаем конструктор по умолчанию для класса
            Constructor<?> constructor = clazz.getConstructor();

            // Создаем экземпляр класса
            Object obj = constructor.newInstance();

            // Получаем метод по имени
            Method method = clazz.getMethod(methodName);

            // Вызываем метод на созданном экземпляре
            method.invoke(obj);
        } catch (ClassNotFoundException e) {
            System.out.println("Класс не найден: " + e.getMessage());
        } catch (NoSuchMethodException e) {
            System.out.println("Метод не найден: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка при вызове метода: " + e.getMessage());
        }
    }
}

class SampleClass {
    public SampleClass(){};
    public void sampleMethod() {
        System.out.println("sampleMethod выполнен.");
    }
}