/* shreyans pranami 21CE110*/
import java.util.Scanner;
public class Practical_3 {
    public static void main(String[] args) {
        int c = 07;
        int d = 0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(lastdigit(a,b));
        System.out.println("21CE110 Shreyans");
    }
    public static boolean lastdigit(int a,int b)
    {
        int c,d;
        c = a%10;
        d = b%10;
        return c==d;
    }
}
