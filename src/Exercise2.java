
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author valet8115
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println(sumDigits(input.nextInt()));
//        System.out.println(triangle(input.nextInt()));
//        System.out.println(binaryConvert(input.nextInt()));
//        System.out.println(convert(input.nextInt(), input.nextInt()));
//        System.out.println(isPalindrome(input.nextLine()));


    }

    public static int sumDigits(int n) { //problem 1
        if (n <= 9) {
            return n;
        } else {
            return n % 10 + sumDigits(n / 10);
        }

    }

    public static int triangle(int n) { //problem 2
        if (n == 1) {
            return 1;
        } else {
            return n + triangle(n - 1);
        }
    }

    public static String binaryConvert(int n) { //problem 3
        if (n == 0) {
            return "0";
        }
        if (n == 1) {
            return "1";
        }
        if (n % 2 == 0) {
            return (binaryConvert(n / 2)) + "0";
        } else {
            return (binaryConvert(n / 2)) + "1";
        }
    }

    public static String convert(int n, int b) {
        if (n < b) {
            if (n == 10) {
                return "A";
            } else if (n == 11) {
                return "B";
            } else if (n == 12) {
                return "C";
            } else if (n == 13) {
                return "D";
            } else if (n == 14) {
                return "E";
            } else if (n == 15) {
                return "F";
            } else {
                return "" + n;
            }
        } else {
//            return convert(n / b, b) + (n % b);
            if (n % b == 10) {
                return convert(n / b, b) + "A";
            } else if (n % b == 11) {
                return convert(n / b, b) + "B";
            } else if (n % b == 12) {
                return convert(n / b, b) + "C";
            } else if (n % b == 13) {
                return convert(n / b, b) + "D";
            } else if (n % b == 14) {
                return convert(n / b, b) + "E";
            } else if (n % b == 15) {
                return convert(n / b, b) + "F";
            } else {
                return convert(n / b, b) + (n % b);
            }

        }
    }

    public static boolean isPalindrome(String n) {
        int length = n.length();
        if (length == 1) {
            return true;
        }

        if (n.charAt(0) == n.charAt(length - 1)) {
            String x = n.substring(1, length - 1);
            return isPalindrome(x);
        } else {
            return false;
        }


    }

    public int marbles(int[] bags, int max) {
        if (bags.length == 0) {
            return 0;
        }
        int[] leftOvers = new int[bags.length - 1];
        int aBag = bags[0];


        for (int i = 0; i < leftOvers.length; i++) {
            leftOvers[i] = bags[i + 1];

        }

        int with = aBag + marbles(leftOvers, max - aBag);
        int without = marbles(leftOvers, max);

        if (with > without && with < max) {
            return with;
        } else if (without > with && without < max) {
            return without;
        } else {
            return 0;
        }
    }
}
