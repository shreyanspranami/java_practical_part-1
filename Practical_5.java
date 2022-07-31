/*We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total
number of blocks in such a triangle with the given number of rows.
triangle(0) → 0
triangle(1) → 1
triangle(2) → 3
 */
/*
  Prepared By:- Shreyans Pranami
  ID:- 21CE110
*/

import java.util.Scanner;
public class TriangleRecursion {
    public static long triangle(int a)
    {
        if(a==0)
            return 0;
        else
        {
            return a+triangle(a-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Enter the number of rows in the triangle: ");
        a = sc.nextInt();
        long ans = triangle(a);
        System.out.println("Number of blocks the triangle has " + ans);
        System.out.println("Prepare by shreyans j. pranami ID:-21CE110");
    }
    }
