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

}
