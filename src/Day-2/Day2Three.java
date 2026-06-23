import java.util.Scanner;

public class Day2Three {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("Eligible for vote");
        }else{
            System.out.println("Not eligible for vote");
        }
    }
}
