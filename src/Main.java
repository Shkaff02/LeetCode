public class Main {
    public static void main(String[] args) {
        System.out.println("Remove duplicates");
        int[] arr = {1,2,2};
        System.out.println("Result " + ArrayTasks.removeDuplicates(arr));
        System.out.println("--------------------------------------------------------------");
        System.out.println("Best Time to Buy and Sell Stock II");
        int[] prices = {7,1,5,3,6,4};
        System.out.println("Result " + ArrayTasks.maxProfit(prices));
        System.out.println("--------------------------------------------------------------");
        System.out.println("Rotate array");
        int[] rot = {1,2,3,4,5,6,7};
        ArrayTasks.rotate(rot, 3);
        System.out.println();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Contains duplicate");
        int[] dup = {1,2,3,1};
        System.out.println("Result " + ArrayTasks.containsDuplicate(dup));
    }
}
