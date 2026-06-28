import java.util.*;
public class Day7Task7 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter paragraph:");
        String paragraph = sc.nextLine();

        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[.,]", "");

        String[] words = paragraph.split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        String ans = "";
        int max = 0;

        for (String word : map.keySet()) {
            if (map.get(word) > max) {
                max = map.get(word);
                ans = word;
            }
        }

        System.out.println("Most Frequent Word: " + ans);
    }
}
