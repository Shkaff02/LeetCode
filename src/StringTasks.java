public class StringTasks {
    /*
        Reverse string

        Write a function that reverses a string. The input string is given as an array of characters s.
     */

    public static void reverseString(char[] s) {
        char temp;
        for(int i = 0; i < s.length/2; i++) {
            temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
    }

    /*
        Reverse integer

        Given a signed 32-bit integer x, return x with its digits reversed.
        If reversing x causes the value to go outside the signed 32-bit integer
        range [-231, 231 - 1], then return 0.

        Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
     */

    public static int reverse(int x) {
        int t = 0;
        int result = 0;
        long res = 0;
        if (!check(x)) {
            return 0;
        } else {
            while (x != 0) {
                t = x%10;
                x = (x - x%10) / 10;
                res = res * 10 + t;
            }
        }

        if (!check(res)) {
            return 0;
        } else {
            result = (int)res;
        }
        return result;

    }

    public static boolean check (long y) {
        if (y < Integer.MIN_VALUE || y > Integer.MAX_VALUE|| y == 0) {
            return false;
        }
        return true;

    }

}
