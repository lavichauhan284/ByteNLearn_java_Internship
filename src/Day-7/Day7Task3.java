
import java.util.*;
public class Day7Task3 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        int[] count = new int[256];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                System.out.println("Index: " + i);
                return;
            }
        }

        System.out.println("-1");
    }
}
