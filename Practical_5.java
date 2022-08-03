import java.util.Scanner;
public class Practical_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int c = stringmatch(a,b);
        System.out.println(c);
        System.out.println("21CE110 shreyans");
    }
    public static int stringmatch(String a,String b)
    {
        int len = Math.min(a.length(),b.length());
        int count = 0;
        for(int i = 0;i<len - 1;i++)
        {
            String aSub = a.substring(i,i+2);
            String bSub = b.substring(i,i+2);
            if(aSub.equals(bSub))
            {
                count++;
            }
        }
        return count;
    }
}
