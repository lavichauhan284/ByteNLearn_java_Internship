import java.util.Scanner;

public class Day2Five {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double temp_celsius = sc.nextDouble();

        double temp_fahrenheit = (temp_celsius*9/5) + 32;

        System.out.println(temp_fahrenheit);
    }
}
