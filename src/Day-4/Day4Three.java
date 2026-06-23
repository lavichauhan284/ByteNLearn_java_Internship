public class Day4Three {
    public static boolean searchNumber(int[] arr, int num){
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }
    static void main() {
        int[] arr = {2,3,4,1};
        int num = 1;
        System.out.println(searchNumber(arr,num));
    }
}
