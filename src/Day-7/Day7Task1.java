import java.util.*;
public class Day7Task1 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine().trim();

        String[] words = str.split("\\s+");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i != 0)
                System.out.print(" ");
        }
    }
}
