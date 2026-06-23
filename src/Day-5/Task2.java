public class Task2 {
    public static int findMax(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }if(b>c){
            return b;
        }else{
            return c;
        }
    }
    static void main() {
        int a = 2;
        int b = 4;
        int c = 1;
        System.out.println(findMax(a,b,c));
    }
}
