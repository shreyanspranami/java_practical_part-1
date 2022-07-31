/*
Given two non-negative int values, return true if they have the same first digit, suchas with 72 and 75.
        firstDigit(7, 71) → true
        firstDigit(6, 17) → false
        firstDigit(31, 311) → true
*/
/*
 Created By:- Shreyans Pranami
 ID:- 21CE110
*/

import java.util.Scanner;
public class CheckDigit {
    public static int firstdigitvalue(int a){
        int fd=0;
        while(a!=0){
            fd = a%10;
            a /= 10;
        }
        return fd;
    }
    public static boolean firstdigit(int a, int b){
        int af = firstdigitvalue(a);
        int bf = firstdigitvalue(b);
        if(af==bf)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();
        if (firstdigit(n1, n2))
            System.out.println("The first digit of number " + n1 + " and number " + n2 + " is same.");
        else
            System.out.println("The first digit of number " + n1 + " and number " + n2 + " is not same.");
        System.out.println("\n Prepare by Shreyans j. pranami ID:-21CE110");
    }
    }
