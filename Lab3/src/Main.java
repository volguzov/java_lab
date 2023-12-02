import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Логические операции && || !
        System.out.println("1. Логические операции && || !");
        System.out.print("Введите число x: ");
        int x = scanner.nextInt();
        System.out.print("Введите число y: ");
        int y = scanner.nextInt();

        boolean logicalAnd = x > 0 && y > 0;
        boolean logicalOr = x > 0 || y > 0;
        boolean logicalNotX = !(x > 0);
        boolean logicalNotY = !(y > 0);

        System.out.println("x > 0 && y > 0: " + logicalAnd);
        System.out.println("x > 0 || y > 0: " + logicalOr);
        System.out.println("!(x > 0): " + logicalNotX);
        System.out.println("!(y > 0): " + logicalNotY);

        // Тернарная операция x < y ? x : y
        System.out.println("\n2. Тернарная операция x < y ? x : y");
        int min = x < y ? x : y;
        System.out.println("Минимальное значение: " + min);

        // Поразрядные логические операции & | ^  ~
        System.out.println("\n3.  Поразрядные логические операции & | ^ ~");
        int andResultBitwise = x & y;
        int orResultBitwise = x | y;
        int xorResultBitwise = x ^ y;
        int notResultBitwise = ~x;

        System.out.println("x & y: " + andResultBitwise);
        System.out.println("x | y: " + orResultBitwise);
        System.out.println("x ^ y: " + xorResultBitwise);
        System.out.println("~x: " + notResultBitwise);

        // Операции сдвига >> (сдвиг вправо), << (сдвиг влево), >>> (сдвиг вправо с заполнением нулями)
        System.out.println("\n4.  Операции сдвига >> << >>>");

        int rightShift = x >> 1;    // Сдвиг вправо на 1 позицию: 0100 (4)
        int leftShift = x << 1;     // Сдвиг влево на 1 позицию: 10000 (16)
        int zeroFillRightShift = x >>> 1;  // Сдвиг вправо с заполнением нулями: 0100 (4)

        System.out.println("x >> 1: " + rightShift);
        System.out.println("x << 1: " + leftShift);
        System.out.println("x >>> 1: " + zeroFillRightShift);
    }
}