/* shreyans pranami 21CE110*/
import java.util.Arrays;
public class Practical_6 {
    public static void main(String[] args) {
        String[] b = {"a", "b", "c", "a"};
        String[] a= words(b, "a");
        System.out.println(Arrays.toString(a));
        System.out.println("Shreyans 21CE110");
    }
    public static String[] words(String[] words, String target){
            int found = 0;
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(target))
                    found++;
            }
            found = words.length - found;
            int place = 0;
            String[] str = new String[found];
            for (int j = 0; j < words.length; j++) {
                if (!words[j].equals(target)) {
                    str[place] = words[j];
                    place++;
                }
            }
        return str;
    }
}