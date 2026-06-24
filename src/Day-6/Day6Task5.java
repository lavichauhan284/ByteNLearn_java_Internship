import java.util.Scanner;

public class Day6Task5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Email: ");
        String email = sc.nextLine();

        String username = name.toLowerCase().replace(" "," ") + "_01";


        System.out.println(" Username ->");
        System.out.println("Name: " + name);
        System.out.println("Email: "+ email);
        System.out.println("Username: " + username);
    }
}
