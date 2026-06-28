import java.util.Scanner;

public class Day4One {

    public static int maxElement(int[] arr){
        int max = arr[0];
        int n = arr.length;

        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int minElement(int[] arr){
        int min = arr[0];
        int n = arr.length;

        for(int i=0; i<n; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 elements:");
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++){
               arr[i] = sc.nextInt();
        }
        System.out.println("max ele:"+maxElement(arr));
        System.out.println("min ele:"+minElement(arr));
    }
}
