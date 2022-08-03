/* shreyans pranami 21CE110*/
public class Practical_7 {
    public static void printSpaces(int n) {
        for (int i = 0; i < n; i++)
            System.out.print(" ");
    }
    public static void printPadding(int x) {
        if (x < 10) {
            System.out.print(" ");
        } else if (x > 9 && x < 99) {
            System.out.print(" ");
        } else {
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {printSpaces(8 - i);
            for (int j = 0; j < i; j++) {
                int x = (int)Math.pow(2, j);
                printPadding(x);
                System.out.print(x);
            }
            for (int j = i - 2; j >= 0; j--) {
                int x = (int)Math.pow(2, j);
                printPadding(x);
                System.out.print(x);
            }
            System.out.println();
        }
        System.out.println("Shreyans 21CE110");
    }
}