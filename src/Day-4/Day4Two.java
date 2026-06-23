public class Day4Two {
    static void main() {
        int[] arr = {2,3,4,1};
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
        }
        System.out.println("sum" + sum);
        int avg = sum/n;
        System.out.println("avg" + avg);


    }
}
