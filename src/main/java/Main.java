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

        System.out.println("Podaj numer dzialania");
        int dzialanie = scanner.nextInt();
        System.out.println("Podaj pierwsza liczbe");
        float liczba1 = scanner.nextFloat();
        System.out.println("Podaj druga liczbe");
        float liczba2 = scanner.nextFloat();

        switch (dzialanie) {
            case 1:
                System.out.println("Wynik dodawania:");
                System.out.println(liczba1 + liczba2);
                break;
            case 2:
                System.out.println("Wynik odejmowania:");
                System.out.println(liczba1 - liczba2);
                break;
            case 3:
                System.out.println("Wynik mnozenia:");
                System.out.println(liczba1 * liczba2);
                break;
            case 4:
                // zabezpieczenie przed dzieleniem przez zero
                if (liczba2 == 0) {
                    System.out.println("Nie dzielimy przez zero!");
                    break;
                } else {
                    System.out.println("Wynik dzielenia:");
                    System.out.println(liczba1 / liczba2);
                    break;
                }
        }
        scanner.close();
    }
}

// @Test
// void addition() {
// assertEquals(2, 1 + 1);
// }