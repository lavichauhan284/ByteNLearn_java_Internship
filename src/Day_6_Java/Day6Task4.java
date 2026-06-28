import java.util.Scanner;

public class Day6Task4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String reverse = "";

        for(int i=str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
        }

        if(str.equals(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
