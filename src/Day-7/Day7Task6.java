import java.util.*;

public class Day7Task6 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String str = sc.nextLine().toLowerCase();

        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }
        for (boolean b : alphabet) {
            if (!b) {
                System.out.println("False");
                return;
            }
        }

        System.out.println("True");
    }
}
