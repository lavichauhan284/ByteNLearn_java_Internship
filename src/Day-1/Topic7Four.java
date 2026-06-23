public class Topic7Four {
    static void main() {
        int n = 12345;

        int count = 0;
        while(n!=0){
            count++;
            n = n/10;
        }
        System.out.println(count);

    }
}
