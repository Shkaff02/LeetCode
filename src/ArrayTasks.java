public class ArrayTasks {
    /*
    Remove duplicates
    Given an integer array nums sorted in non-decreasing order,
    remove the duplicates in-place such that each unique element
    appears only once. The relative order of the elements should
    be kept the same.

    Since it is impossible to change the length of the array in some
    languages, you must instead have the result be placed in the first
    part of the array nums. More formally, if there are k elements after
    removing the duplicates, then the first k elements of nums should hold
    the final result. It does not matter what you leave beyond the first k
    elements.

    Return k after placing the final result in the first k slots of nums.

    Do not allocate extra space for another array. You must do this by
     modifying the input array in-place with O(1) extra memory.
     */

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j];
            }
        }
        return i + 1;
    }

    /*
      Best Time to Buy and Sell Stock II

    You are given an integer array prices where prices[i] is the price
    of a given stock on the ith day.

    On each day, you may decide to buy and/or sell the stock.
    You can only hold at most one share of the stock at any time.
    However, you can buy it then immediately sell it on the same
    day.

    Find and return the maximum profit you can achieve.
     */

    public static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i+1]) {
                profit += prices[i+1] - prices[i];
            }
        }
        return profit;
    }
}
