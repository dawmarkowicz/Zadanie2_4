import java.util.Scanner;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.Test;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - dodawanie");
        System.out.println("2 - odejmowanie");
        System.out.println("3 - mnożenie");
        System.out.println("4 - dzielenie");
        System.out.println("5 - pole prostokata");
        System.out.println("6 - pole trojkata");
        System.out.println("7 - a^2+b^2+c^2");
        System.out.println("8 - najmniejsza liczba");

        System.out.println("Podaj numer dzialania");
        int dzialanie = scanner.nextInt();

        switch (dzialanie) {
            case 1:
                System.out.println("Podaj a");
                float a = scanner.nextFloat();
                System.out.println("Podaj b");
                float b = scanner.nextFloat();
                System.out.println("Wynik dodawania:");
                System.out.println(a + b);
                break;
            case 2:
                System.out.println("Podaj a");
                float a2 = scanner.nextFloat();
                System.out.println("Podaj b");
                float b2 = scanner.nextFloat();
                System.out.println("Wynik odejmowania:");
                System.out.println(a2 - b2);
                break;
            case 3:
                System.out.println("Podaj a");
                float a3 = scanner.nextFloat();
                System.out.println("Podaj b");
                float b3 = scanner.nextFloat();
                System.out.println("Wynik mnozenia:");
                System.out.println(a3 * b3);
                break;
            case 4:
                System.out.println("Podaj a");
                float a4 = scanner.nextFloat();
                System.out.println("Podaj b");
                float b4 = scanner.nextFloat();
                // zabezpieczenie przed dzieleniem przez zero
                if (b4 == 0) {
                    System.out.println("Nie dzielimy przez zero!");
                    break;
                } else {
                    System.out.println("Wynik dzielenia:");
                    System.out.println(a4 / b4);
                    break;
                }
            case 5:
                System.out.println("Podaj a");
                float a5 = scanner.nextFloat();
                System.out.println("Podaj b");
                float b5 = scanner.nextFloat();
                System.out.println("Pole prostokata:");
                System.out.println(a5 * b5);
                break;
            case 6:
                System.out.println("Podaj a");
                float a6 = scanner.nextFloat();
                System.out.println("Podaj b");
                float b6 = scanner.nextFloat();
                System.out.println("Podaj c");
                float c = scanner.nextFloat();
                float p = (a6 + b6 + c) / 2;
                System.out.println("Pole trojkata:");
                System.out.println(Math.sqrt(p * (p - a6) * (p - b6) * (p - c)));
                break;
            case 7:
                System.out.println("Podaj a");
                float a7 = scanner.nextFloat();
                System.out.println("Podaj b");
                float b7 = scanner.nextFloat();
                System.out.println("Podaj c");
                float c2 = scanner.nextFloat();
                System.out.println("a^2+b^2+c^2:");
                System.out.println(a7 * a7 + b7 * b7 + c2 * c2);
                break;
            case 8:
                System.out.println("Podaj a");
                float a8 = scanner.nextFloat();
                System.out.println("Podaj b");
                float b8 = scanner.nextFloat();
                System.out.println("Podaj c");
                float c3 = scanner.nextFloat();
                System.out.println("Najmniejsza liczba:");
                System.out.println(Math.min(Math.min(a8, b8), c3));
                break;
            default:
                System.out.println("Nie ma takiego dzialania");
                break;
        }
        scanner.close();
    }
}

// @Test
// void addition() {
// assertEquals(2, 1 + 1);
// }