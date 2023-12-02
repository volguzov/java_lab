public class SwapExample {
    private int value;

    // Конструктор для инициализации объекта класса
    public SwapExample(int value) {
        this.value = value;
    }

    // Геттер для получения значения объекта
    public int getValue() {
        return value;
    }

    // Метод для обмена значениями между объектами
    public static void swapObjects(SwapExample obj1, SwapExample obj2) {
        int temp = obj1.value;
        obj1.value = obj2.value;
        obj2.value = temp;
    }

    public static void main(String[] args) {
        SwapExample obj1 = new SwapExample(10);
        SwapExample obj2 = new SwapExample(20);

        System.out.println("Первый объект: " + obj1.getValue());
        System.out.println("Второй объект: " + obj2.getValue());

        // Обмен значениями между объектами
        swapObjects(obj1, obj2);

        System.out.println("\nПосле обмена:");
        System.out.println("Первый объект: " + obj1.getValue());
        System.out.println("Второй объект: " + obj2.getValue());
    }
}