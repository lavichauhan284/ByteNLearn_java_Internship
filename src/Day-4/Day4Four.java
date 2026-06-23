public class Day4Four {
    public static void reverse(int[] arr){
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    static void main() {
        int[] arr = {4,3,2,6,1,7};
      reverse(arr);
        for(int num:arr){
            System.out.println(num);
        }
    }
}
