/*
   A typical mobile number in India is “+91-AA-BBB-CCCCC”. Where the first two digits (AA) indicate a mobile system operator, the next three (BBB) denote the mobile switching code (MSC) while the remaining five digits (CCCCC) are unique to the subscriber. Write an application that takes a mobile number as an input from a user in above mentioned format and display code for mobile system operator, mobile switching code and last 5 digits which
are unique to subscriber.
Ex. For an input +91-94-999-65789, output should be :
Mobile system operator code is 94
MSC is 999
Unique code is 65789

*/
 */
/*
Preated By:- Shreyans Pranami
        ID:- 21CE110
        */

import java.util.Scanner;
public class Mobile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the mobile number: ");
        String s1 = sc.next();
        String s2 = s1.substring(4, 6);
        String s3 = s1.substring(7, 10);
        String s4 = s1.substring(11, 16);
        System.out.println("Mobile system operator code is " + s2);
        System.out.println("MSC is " + s3);
        System.out.println("Unique code is " + s4);
    }
}
