import java.util.Scanner;

public class PrimitiveTypesSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Виводим инфу про данніе для бро
        System.out.println("Тип: byte, Мін: " + Byte.MIN_VALUE + ", Макс: " + Byte.MAX_VALUE);
        System.out.println("Тип: short, Мін: " + Short.MIN_VALUE + ", Макс: " + Short.MAX_VALUE);
        System.out.println("Тип: int, Мін: " + Integer.MIN_VALUE + ", Макс: " + Integer.MAX_VALUE);
        System.out.println("Тип: long, Мін: " + Long.MIN_VALUE + ", Макс: " + Long.MAX_VALUE);
        System.out.println("Тип: float, Мін: " + Float.MIN_VALUE + ", Макс: " + Float.MAX_VALUE);
        System.out.println("Тип: double, Мін: " + Double.MIN_VALUE + ", Макс: " + Double.MAX_VALUE);
        System.out.println("Тип: boolean, Значення: true або false");
        System.out.println("Тип: char, Мін: " + (int) Character.MIN_VALUE + ", Макс: " + (int) Character.MAX_VALUE);

        // Запрос у бро
        System.out.print("Введіть значення типу byte: ");
        byte byteValue = Byte.parseByte(scanner.nextLine());
        System.out.println("Введене значення byte: " + byteValue);

        System.out.print("Введіть значення типу short: ");
        short shortValue = Short.parseShort(scanner.nextLine());
        System.out.println("Введене значення short: " + shortValue);

        System.out.print("Введіть значення типу int: ");
        int intValue = Integer.parseInt(scanner.nextLine());
        System.out.println("Введене значення int: " + intValue);

        System.out.print("Введіть значення типу long: ");
        long longValue = Long.parseLong(scanner.nextLine());
        System.out.println("Введене значення long: " + longValue);

        System.out.print("Введіть значення типу float: ");
        float floatValue = Float.parseFloat(scanner.nextLine());
        System.out.println("Введене значення float: " + floatValue);

        System.out.print("Введіть значення типу double: ");
        double doubleValue = Double.parseDouble(scanner.nextLine());
        System.out.println("Введене значення double: " + doubleValue);

        System.out.print("Введіть значення типу boolean: ");
        boolean booleanValue = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Введене значення boolean: " + booleanValue);

        System.out.print("Введіть значення типу char: ");
        char charValue = scanner.nextLine().charAt(0);
        System.out.println("Введене значення char: " + charValue);

        scanner.close();
    }
}
