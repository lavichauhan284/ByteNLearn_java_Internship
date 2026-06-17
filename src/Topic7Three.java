public class Topic7Three {
    static void main() {
        int n = 1234;

        while(n>0){
            int digit = n%10;
            System.out.print(digit);
            n = n/10;
        }
    }
}
