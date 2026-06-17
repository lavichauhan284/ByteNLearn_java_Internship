import java.util.Scanner;

public class Topic5Three {
    static void main() {

        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if(marks>=45){
            System.out.println("pass");
        }else{
            System.out.println("Fail");
        }
    }
}
