package org.codesolutions;

public class CodingbatArray1 {
    public static void main(String[] args) {
        /* Basic array problems -- no loops..
        Use a[0], a[1], ...
        to access elements in an array,
        a.length is the length (note that s.length() is for Strings).
        Allocate a new array like this: int[] a = new int[10]; // length 10 array
         */

        System.out.println(firstLast6(new int[] {1, 2, 6}));
        System.out.println(firstLast6(new int[] {6, 1, 2, 3}));
        System.out.println(firstLast6(new int[] {12, 6, 1, 2, 3}));
    }

    /* Given an array of ints, return true if 6 appears as either the first or last element in the array.
    The array will be length 1 or more.
    firstLast6([1, 2, 6]) → true
    firstLast6([6, 1, 2, 3]) → true
    firstLast6([13, 6, 1, 2, 3]) → false
     */
    public static boolean firstLast6(int[] nums) {
        boolean rtnVal = false;
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            rtnVal = true;
        }
        return rtnVal;
    }
}
