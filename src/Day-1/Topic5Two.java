import java.util.Scanner;

public class Topic5Two {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n==0){
            System.out.println("Zero");
        }else if(n>0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
    }
}
