import java.util.Scanner;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.Test;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe: ");
        int a = scanner.nextInt();
        System.out.println("podaj druga liczbe: ");
        int b = scanner.nextInt();
        System.out.println("suma: " + (a + b));

        scanner.close();
    }
}

// @Test
// void addition() {
// assertEquals(2, 1 + 1);
// }