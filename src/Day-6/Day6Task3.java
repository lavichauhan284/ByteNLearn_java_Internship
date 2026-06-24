public class Day6Task3 {
    static void main() {
        String str = "java";
        int vowelCount = 0;
        int consCount = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch>='a' && ch<='z'){
                if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ){
                    vowelCount++;
                }else{
                    consCount++;
                }
            }
        }
        System.out.println("Vowels: "+vowelCount);
        System.out.println("Consonant: "+consCount);
    }
}
