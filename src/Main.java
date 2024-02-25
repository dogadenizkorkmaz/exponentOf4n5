import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n; //define integer value

        Scanner doa = new Scanner(System.in);  //define scanner
        System.out.print("Enter the Max. Value: "); //get value from user
        n = doa.nextInt();

        for (int i = 1; i <= n; i *= 4) { // exponent condition of 4
            System.out.println("\"" + i + "\"" + "  is the exponents of 4 number for the numbers from 0 to " + n + ".");
        }

        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");

        for (int i = 1; i <= n; i *= 5) { //exponent condition of 5
            System.out.println("\"" + i + "\"" + "  is the exponents of 5 number for the numbers from 0 to " + n + ".");
        }
    }
}

