import java.lang.reflect.*;

public class ClassInfo {
    public static void printClassInfo(Class<?> clazz) {
        System.out.println("Информация о классе " + clazz.getName() + ":");

        // Получение модификаторов класса
        int modifiers = clazz.getModifiers();
        System.out.println("Модификаторы: " + Modifier.toString(modifiers));

        // Получение информации о полях класса
        Field[] fields = clazz.getDeclaredFields();
        System.out.println("Поля класса:");
        for (Field field : fields) {
            System.out.println("  " + Modifier.toString(field.getModifiers()) +
                    " " + field.getType().getName() + " " + field.getName());
        }

        // Получение информации о методах класса
        Method[] methods = clazz.getDeclaredMethods();
        System.out.println("Методы класса:");
        for (Method method : methods) {
            System.out.print("  " + Modifier.toString(method.getModifiers()) +
                    " " + method.getReturnType().getName() +
                    " " + method.getName() + "(");

            Parameter[] parameters = method.getParameters();
            for (int i = 0; i < parameters.length; i++) {
                System.out.print(parameters[i].getType().getName() + " " + parameters[i].getName());
                if (i < parameters.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(")");
        }

        // Получение информации о интерфейсах, реализуемых классом
        Class<?>[] interfaces = clazz.getInterfaces();
        if (interfaces.length > 0) {
            System.out.println("Интерфейсы класса:");
            for (Class<?> iface : interfaces) {
                System.out.println("  " + iface.getName());
            }
        } else {
            System.out.println("Класс не реализует интерфейсов.");
        }
    }

    public static void main(String[] args) {
        // Пример вызова метода printClassInfo для класса String
        printClassInfo(String.class);
    }
}