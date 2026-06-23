import java.util.Scanner;

public class Day4Five {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subjects:");
        int n = sc.nextInt();

        int total = 0;
        double percentage = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter marks of subject" + i + ":");
            int marks = sc.nextInt();
            total = total + marks;

            percentage = (double) total / n;

        }
        System.out.println("Result ->");
        System.out.println("Total marks: " + total);
        System.out.println("Percentage:" + percentage + "%");

        if(percentage >= 45){
            System.out.println("Result -> Pass" );
        }
        System.out.println("Result -> Fail" );
    }
}
