import java.util.Scanner;

public class Topic6Five {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n>0){
            int digit = n %10;
            System.out.print(digit);
            n = n/10;
        }
    }
}
