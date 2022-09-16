package org.codesolutions;

import java.util.Arrays;

public class CodingbatArray1 {
    public static void main(String[] args) {
        /* Basic array problems -- NO LOOPS..
        Use a[0], a[1], ...
        to access elements in an array,
        a.length is the length (note that s.length() is for Strings).
        Allocate a new array like this: int[] a = new int[10]; // length 10 array

        System.out.println(firstLast6(new int[] {1, 2, 6}));
        System.out.println(firstLast6(new int[] {6, 1, 2, 3}));
        System.out.println(firstLast6(new int[] {12, 6, 1, 2, 3}));

        System.out.println(sameFirstLast(new int[] {1, 2, 3}));
        System.out.println(sameFirstLast(new int[] {1, 2, 3, 1}));
        System.out.println(sameFirstLast(new int[] {1, 2, 1}));

        System.out.println(Arrays.toString(makePi()));

        System.out.println(commonEnd(new int[] {1, 2, 3}, new int[] {7, 3}));
        System.out.println(commonEnd(new int[] {1, 2, 3}, new int[] {7, 3, 2}));
        System.out.println(commonEnd(new int[] {1, 2, 3}, new int[] {1, 3}));

        System.out.println(sum3(new int[] {1, 2, 3}));
        System.out.println(sum3(new int[] {5, 11, 2}));
        System.out.println(sum3(new int[] {7, 0, 0}));

        System.out.println(Arrays.toString(rotateLeft3(new int[] {1, 2, 3})));
        System.out.println(Arrays.toString(rotateLeft3(new int[] {5, 11, 9})));
        System.out.println(Arrays.toString(rotateLeft3(new int[] {7, 0, 0})));

        System.out.println(Arrays.toString(reverse3(new int[] {1, 2, 3})));
        System.out.println(Arrays.toString(reverse3(new int[] {5, 11, 9})));
        System.out.println(Arrays.toString(reverse3(new int[] {7, 0, 0})));

        System.out.println(Arrays.toString(maxEnd3(new int[] {1, 2, 3})));
        System.out.println(Arrays.toString(maxEnd3(new int[] {11, 5, 9})));
        System.out.println(Arrays.toString(maxEnd3(new int[] {2, 11, 3})));

        System.out.println(sum2(new int[] {1, 2, 3}));
        System.out.println(sum2(new int[] {1, 1}));
        System.out.println(sum2(new int[] {1, 1, 1, 1}));
        System.out.println(sum2(new int[] {2}));
        System.out.println(sum2(new int[] {}));

        System.out.println(Arrays.toString(middleWay(new int[] {1, 2, 3}, new int[] {4, 5, 6})));
        System.out.println(Arrays.toString(middleWay(new int[] {7, 7, 7}, new int[] {3, 8, 0})));
        System.out.println(Arrays.toString(middleWay(new int[] {5, 2, 9}, new int[] {1, 4, 5})));

        System.out.println(Arrays.toString(makeEnds(new int[] {1, 2, 3})));
        System.out.println(Arrays.toString(makeEnds(new int[] {1, 2, 3, 4})));
        System.out.println(Arrays.toString(makeEnds(new int[] {7, 4, 6, 2})));
        System.out.println(Arrays.toString(makeEnds(new int[] {5})));

        System.out.println(has23(new int[] {2, 5}));
        System.out.println(has23(new int[] {4, 3}));
        System.out.println(has23(new int[] {4, 5}));

        System.out.println(no23(new int[] {4, 5}));
        System.out.println(no23(new int[] {4, 2}));
        System.out.println(no23(new int[] {3, 5}));

        System.out.println(Arrays.toString(makeLast(new int[]{4, 5, 6})));
        System.out.println(Arrays.toString(makeLast(new int[]{1, 2})));
        System.out.println(Arrays.toString(makeLast(new int[]{3})));

        System.out.println(double23(new int[] {2, 2}));
        System.out.println(double23(new int[] {3, 3}));
        System.out.println(double23(new int[] {2, 3}));

        int[] a1 = new int[] {1, 2, 3};
        int[] a2 = new int[] {2, 3, 5};
        int[] a3 = new int[] {1, 2, 1};
        System.out.println(Arrays.toString(fix23(a1)));
        System.out.println(Arrays.toString(fix23(a2)));
        System.out.println(Arrays.toString(fix23(a3)));
        System.out.println("This variant of fix23 updates the same array in the heap");
        System.out.println("a1 array initial value: " + Arrays.toString(a1));
        int[] a4 = fix23(a1);
        System.out.println("a4 array is the returned value of fix23: " + Arrays.toString(a4));
        System.out.println("a1 array value after call to fix23: " + Arrays.toString(a1));
        System.out.println("test for equality: " + a1.equals(a4));
        System.out.println("Proof: a1 is equal to a4");
        System.out.println("");
        System.out.println("This variant of fix23 creates a new array in the heap");
        int[] a5 = new int[] {1, 2, 3};
        System.out.println("a5 array initial value: " + Arrays.toString(a5));
        int[] a6 = fix23V2(a5);
        System.out.println("a6 array is the returned value of fix23: " + Arrays.toString(a6));
        System.out.println("a5 array value after call to fix23: " + Arrays.toString(a5));
        System.out.println("Proof: a5 is not equal to a6");

        System.out.println(start1(new int[] {1, 2, 3}, new int[] {1, 3}));
        System.out.println(start1(new int[] {7, 2, 3}, new int[] {1}));
        System.out.println(start1(new int[] {1, 2}, new int[] {}));

        System.out.println(Arrays.toString(biggerTwo(new int[] {1, 2}, new int[] {3, 4})));
        System.out.println(Arrays.toString(biggerTwo(new int[] {3, 4}, new int[] {1, 2})));
        System.out.println(Arrays.toString(biggerTwo(new int[] {1, 1}, new int[] {1, 2})));
        System.out.println(Arrays.toString(biggerTwo(new int[] {3, 5}, new int[] {4, 4})));

        System.out.println(Arrays.toString(makeMiddle(new int[] {1, 2, 3, 4})));
        System.out.println(Arrays.toString(makeMiddle(new int[] {7, 1, 2, 3, 4, 9})));
        System.out.println(Arrays.toString(makeMiddle(new int[] {1, 2})));

        System.out.println(Arrays.toString(plusTwo(new int[] {1, 2}, new int[] {3, 4})));
        System.out.println(Arrays.toString(plusTwo(new int[] {4, 4}, new int[] {2, 2})));
        System.out.println(Arrays.toString(plusTwo(new int[] {9, 2}, new int[] {3, 4})));
        */
        System.out.println(Arrays.toString(midThree(new int[] {1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(midThree(new int[] {8, 6, 7, 5, 3, 0, 9})));
        System.out.println(Arrays.toString(midThree(new int[] {1, 2, 3})));
    }

    /* Given an array of ints of odd length,
    return a new array length 3 containing the elements from the middle of the array.
    The array length will be at least 3.
    midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
    midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
    midThree([1, 2, 3]) → [1, 2, 3]
    */
    public static int[] midThree(int[] nums) {
        int[] arr = new int[3];
        if (nums.length >= 3) {
            int midPos = (nums.length - 1) / 2;
            int startPos = midPos - 1;
            arr[0] = nums[startPos];
            arr[1] = nums[startPos + 1];
            arr[2] = nums[startPos + 2];
        }
        return arr;
    }

    /* Given an array of ints, swap the first and last elements in the array. Return the modified array.
    The array length will be at least 1.
    swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
    swapEnds([1, 2, 3]) → [3, 2, 1]
    swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8] */
    public static int[] swapEnds(int[] nums) {
        int[] arr = nums;
        if (nums.length >= 2) {
            int firstNum = nums[0];
            int lastNum = nums[nums.length - 1];
            nums[0] = lastNum;
            nums[nums.length - 1] = firstNum;
        }
        return arr;
    }

    /* Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
    plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
    plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
    plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
    */
    public static int[] plusTwo(int[] a, int[] b) {
        int[] arr = new int[4];
        if (a.length == 2 && b.length == 2) {
            arr[0] = a[0];
            arr[1] = a[1];
            arr[2] = b[0];
            arr[3] = b[1];
        }
        return arr;
    }

    /* Given an array of ints of even length,
    return a new array length 2 containing the middle two elements from the original array.
    The original array will be length 2 or more.
    makeMiddle([1, 2, 3, 4]) → [2, 3]
    makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
    makeMiddle([1, 2]) → [1, 2]
     */
    public static int[] makeMiddle(int[] nums) {
        int[] arr = new int[2];
        int startPos = (nums.length / 2) -1;
        arr[0] = nums[startPos];
        arr[1] = nums[startPos + 1];
        return arr;
    }

    /* Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array.
    Return the array which has the largest sum. In event of a tie, return a.
    biggerTwo([1, 2], [3, 4]) → [3, 4]
    biggerTwo([3, 4], [1, 2]) → [3, 4]
    biggerTwo([1, 1], [1, 2]) → [1, 2]
    */
    public static int[] biggerTwo(int[] a, int[] b) {
        int[] arr = new int[2];
        if (a.length == 2 && b.length == 2) {
            if ((a[0] + a[1]) > (b[0] + b[1]) || (a[0] + a[1]) == (b[0] + b[1])) {
                arr = a;
            } else {
                arr = b;
            }
        }
        return arr;
    }

    /* Start with 2 int arrays, a and b, of any length.
    Return how many of the arrays have 1 as their first element.
    start1([1, 2, 3], [1, 3]) → 2
    start1([7, 2, 3], [1]) → 1
    start1([1, 2], []) → 1
     */
    public static int start1(int[] a, int[] b) {
        int rtnVal = 0;
        if (a.length >= 1 && a[0] == 1) {
            rtnVal++;
        }
        if (b.length >= 1 && b[0] == 1) {
            rtnVal++ ;
        }
        return rtnVal;
    }

    /* Given an int array length 3, if there is a 2 in the array immediately followed by a 3,
    set the 3 element to 0. Return the changed array.
    fix23([1, 2, 3]) → [1, 2, 0]
    fix23([2, 3, 5]) → [2, 0, 5]
    fix23([1, 2, 1]) → [1, 2, 1]
    */
    public static int[] fix23(int[] nums) {
        // this new reference variable is pointing to the same array in the heap
        int[] arr = nums;
        if (nums.length == 3) {
            if (nums[0] == 2 && nums[1] == 3) {
                // this will update the element of the same array that nums is pointing to
                arr[1] = 0;
            } else if (nums[1] == 2 && nums[2] == 3) {
                arr[2] = 0;
            }
        }
        return arr;
    }
    public static int[] fix23V2(int[] nums) {
        // this will create a new array in the heap
        int[] arr = new int[nums.length];
        arr[0] = nums[0];
        arr[1] = nums[1];
        arr[2] = nums[2];
        if (nums.length == 3) {
            if (nums[0] == 2 && nums[1] == 3) {
                arr[1] = 0;
            } else if (nums[1] == 2 && nums[2] == 3) {
                arr[2] = 0;
            }
        }
        return arr;
    }

    /* Given an int array, return true if the array contains 2 twice, or 3 twice.
    The array will be length 0, 1, or 2.
    double23([2, 2]) → true
    double23([3, 3]) → true
    double23([2, 3]) → false
    */
    public static boolean double23(int[] nums) {
        boolean rtnVal = false;
        if (nums.length == 2) {
            if ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3)) {
                rtnVal = true;
            }
        }
        return rtnVal;
    }


    /* Given an int array,
    return a new array with double the length where its last element is the same as the original array,
    and all the other elements are 0. The original array will be length 1 or more.
    Note: by default, a new int array contains all 0's.
    makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
    makeLast([1, 2]) → [0, 0, 0, 2]
    makeLast([3]) → [0, 3]
    */
    public static int[] makeLast(int[] nums) {
        int[] arr = new int[nums.length * 2];
        arr[arr.length - 1] = nums[nums.length - 1];
        return arr;
    }

    /* Given an int array length 2, return true if it does not contain a 2 or 3.
    no23([4, 5]) → true
    no23([4, 2]) → false
    no23([3, 5]) → false */
    public static boolean no23(int[] nums) {
        boolean rtnVal = false;
        if (nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3) {
            return true;
        }
        return rtnVal;
    }

    /* Given an int array length 2, return true if it contains a 2 or a 3.
    has23([2, 5]) → true
    has23([4, 3]) → true
    has23([4, 5]) → false */
    public static boolean has23(int[] nums) {
        boolean rtnVal = false;
        if (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3) {
            return true;
        }
        return rtnVal;
    }

    /* Given an array of ints,
    return a new array length 2 containing the first and last elements from the original array.
    The original array will be length 1 or more.
    makeEnds([1, 2, 3]) → [1, 3]
    makeEnds([1, 2, 3, 4]) → [1, 4]
    makeEnds([7, 4, 6, 2]) → [7, 2]
    */
    public static int[] makeEnds(int[] nums) {
        int[] arr = new int[2];
        if (nums.length >= 1) {
            arr[0] = nums[0];
            arr[1] = nums[nums.length - 1];
        }
        return arr;
    }

    /* Given 2 int arrays, a and b, each length 3,
    return a new array length 2 containing their middle elements.
    middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
    middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
    middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
    */
    public static int[] middleWay(int[] a, int[] b) {
        int[] arr = new int[2];
        arr[0] = a[1];
        arr[1] = b[1];
        return arr;
    }

    /* Given an array of ints, return the sum of the first 2 elements in the array.
    If the array length is less than 2, just sum up the elements that exist,
    returning 0 if the array is length 0.
    sum2([1, 2, 3]) → 3
    sum2([1, 1]) → 2
    sum2([1, 1, 1, 1]) → 2
    */
    public static int sum2(int[] nums) {
        int rtnVal = 0;
        if (nums.length >= 2) {
            rtnVal = nums[0] + nums[1];
        } else if (nums.length == 1) {
            rtnVal = nums[0];
        }
        return rtnVal;
    }

    /* Given an array of ints length 3, figure out which is larger, the first or last element in the array,
    and set all the other elements to be that value.
    Return the changed array.
    maxEnd3([1, 2, 3]) → [3, 3, 3]
    maxEnd3([11, 5, 9]) → [11, 11, 11]
    maxEnd3([2, 11, 3]) → [3, 3, 3]
    */
    public static int[] maxEnd3(int[] nums) {
        int[] arr = new int[3];
        int hiNum = 0;
        if (nums[0] > nums[nums.length - 1]) {
            hiNum = nums[0];
        } else {
            hiNum = nums[nums.length - 1];
        }
        arr[0] = hiNum;
        arr[1] = hiNum;
        arr[2] = hiNum;
        return arr;
    }

    /* Given an array of ints length 3, return a new array with the elements in reverse order,
    so {1, 2, 3} becomes {3, 2, 1}.
    reverse3([1, 2, 3]) → [3, 2, 1]
    reverse3([5, 11, 9]) → [9, 11, 5]
    reverse3([7, 0, 0]) → [0, 0, 7]
     */
    public static int[] reverse3(int[] nums) {
        int[] arr = new int[3];
        if (nums.length == 3) {
            arr[0] = nums[2];
            arr[1] = nums[1];
            arr[2] = nums[0];
        }
        return arr;
    }

    /* Given an array of ints length 3, return an array with the elements "rotated left"
    so {1, 2, 3} yields {2, 3, 1}.
    rotateLeft3([1, 2, 3]) → [2, 3, 1]
    rotateLeft3([5, 11, 9]) → [11, 9, 5]
    rotateLeft3([7, 0, 0]) → [0, 0, 7]
     */
    public static int[] rotateLeft3(int[] nums) {
        int[] arr = new int[3];
        arr[0] = nums[1];
        arr[1] = nums[2];
        arr[2] = nums[0];
        return arr;
    }

    /* Given an array of ints length 3, return the sum of all the elements.
    sum3([1, 2, 3]) → 6
    sum3([5, 11, 2]) → 18
    sum3([7, 0, 0]) → 7
     */
    public static int sum3(int[] nums) {
        int rtnVal = 0;
        if (nums.length == 3) {
            rtnVal = nums[0] + nums[1] + nums[2];
        }
        return rtnVal;
    }

    /* Given 2 arrays of ints, a and b,
    return true if they have the same first element or they have the same last element.
    Both arrays will be length 1 or more.
    commonEnd([1, 2, 3], [7, 3]) → true
    commonEnd([1, 2, 3], [7, 3, 2]) → false
    commonEnd([1, 2, 3], [1, 3]) → true
     */
    public static boolean commonEnd(int[] a, int[] b) {
        boolean rtnVal = false;
        if (a.length >= 1 && b.length >= 1) {
            if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
                rtnVal = true;
            }
        }
        return rtnVal;
    }

    /* Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
    makePi() → [3, 1, 4]
     */
    public static int[] makePi() {
        int[] arr = new int[] {3, 1, 4};
        return arr;
    }

    /* Given an array of ints, return true if the array is length 1 or more,
    and the first element and the last element are equal.
    sameFirstLast([1, 2, 3]) → false
    sameFirstLast([1, 2, 3, 1]) → true
    sameFirstLast([1, 2, 1]) → true
     */
    public static boolean sameFirstLast(int[] nums) {
        boolean rtnVal = false;
        if (nums.length >=1 && (nums[0] == nums[nums.length - 1])) {
            rtnVal = true;
        }
        return rtnVal;
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
