public class Task4 {
    public static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n*factorial(n-1);
    }
    static void main() {
        int n = 5;
        System.out.println(factorial(n));
    }

}
