public class Main {
    public static void main(String[] args) {
        System.out.println("Reverse string");
        char[] str = {'h', 'e', 'l', 'l', 'o'};
        StringTasks.reverseString(str);
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("Reverse integer");
        System.out.println(StringTasks.reverse(123));
        System.out.println("----------------------------------");
        System.out.println("First uniquw character in a string");
        System.out.println(StringTasks.firstUniqChar("leetcode"));
    }
}
