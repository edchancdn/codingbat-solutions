package org.example;

public class CodingbatWarmup2 {

    public static void main(String[] args) {
        // For exercise purposes only
        CodingbatWarmup2 cb = new CodingbatWarmup2();
        /*
        System.out.println(cb.stringTimes("Hi", 2));
        System.out.println(cb.stringTimes("Hi", 3));
        System.out.println(cb.stringTimes("Hi", 1));
        System.out.println(cb.stringTimes("Hi", 0));

        System.out.println(cb.frontTimes("Chocolate", 2));
        System.out.println(cb.frontTimes("Chocolate", 3));
        System.out.println(cb.frontTimes("Abc", 3));
        System.out.println(cb.frontTimes("Abcde", 0));

        System.out.println(cb.countXX("abcxx"));
        System.out.println(cb.countXX("xxx"));
        System.out.println(cb.countXX("xxxx"));

        System.out.println(cb.doubleX("axxbb"));
        System.out.println(cb.doubleX("axaxax"));
        System.out.println(cb.doubleX("xxxxx"));

        System.out.println(cb.stringBits("Hello"));
        System.out.println(cb.stringBits("Hi"));
        System.out.println(cb.stringBits("Heeololeo"));

        System.out.println(cb.stringSplosion("Code"));
        System.out.println(cb.stringSplosion("abc"));
        System.out.println(cb.stringSplosion("ab"));

        System.out.println(cb.last2("hixxhi"));
        System.out.println(cb.last2("xaxxaxaxx"));
        System.out.println(cb.last2("axxxaaxx"));
        System.out.println(cb.last2("xx"));

        int[] ia1 = {1, 2, 9};
        System.out.println(cb.arrayCount9(ia1));
        int[] ia2 = {1, 9, 9};
        System.out.println(cb.arrayCount9(ia2));
        int[] ia3 = {1, 9, 9, 3, 9};
        System.out.println(cb.arrayCount9(ia3));

        int[] b1 = {1, 2, 9, 3, 4};
        System.out.println(cb.arrayFront9(b1));
        int[] b2 = {1, 2, 3, 4, 9};
        System.out.println(cb.arrayFront9(b2));
        int[] b3 = {1, 2, 3, 4, 5};
        System.out.println(cb.arrayFront9(b3));
        int[] b4 = {1, 2};
        System.out.println(cb.arrayFront9(b4));
        int[] b5 = {1, 9};
        System.out.println(cb.arrayFront9(b5));
        */
        int[] c1 = {1, 1, 2, 3, 1};
        System.out.println(cb.array123(c1));
        int[] c2 = {1, 1, 2, 4, 1};
        System.out.println(cb.array123(c2));
        int[] c3 = {1, 1, 2, 1, 2, 3};
        System.out.println(cb.array123(c3));


    }

    /* Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
    array123([1, 1, 2, 3, 1]) → true
    array123([1, 1, 2, 4, 1]) → false
    array123([1, 1, 2, 1, 2, 3]) → true
     */
    public boolean array123(int[] nums) {
        boolean rtnVal = false;
        // array must have at least 3 elements
        if (nums.length >= 3) {
            // loop through the array, until the element 3rd from the last (because pattern to find is 3 elements).
            for (int i = 0; i < nums.length - 2; i++) {
                if ((nums[i] == 1) && (nums[i + 1] == 2) && (nums[i + 2] == 3)) {
                    rtnVal = true;
                    break;
                }
            }
        }

        return rtnVal;
    }

    /* Given an array of ints, return true if one of the first 4 elements in the array is a 9.
    The array length may be less than 4.
    arrayFront9([1, 2, 9, 3, 4]) → true
    arrayFront9([1, 2, 3, 4, 9]) → false
    arrayFront9([1, 2, 3, 4, 5]) → false
     */
    public boolean arrayFront9(int[] nums) {
        boolean rtnVal = false;
        for (int i = 0; i < nums.length; i++) {
            // leave the loop after the 4th element.
            // if array length is less than 4, then loop will just end naturally.
            if (i == 4) {
                break;
            }
            if (nums[i] == 9) {
                rtnVal = true;
            }
        }
        return rtnVal;
    }

    /* Given an array of ints, return the number of 9's in the array.
    arrayCount9([1, 2, 9]) → 1
    arrayCount9([1, 9, 9]) → 2
    arrayCount9([1, 9, 9, 3, 9]) → 3
     */
    public int arrayCount9(int[] nums) {
        int rtnVal = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                rtnVal++;
            }
        }
        return rtnVal;
    }

    /* Given a string, return the count of the number of times that a substring length 2 appears in the string
    and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
    last2("hixxhi") → 1
    last2("xaxxaxaxx") → 1
    last2("axxxaaxx") → 2
     */
    public int last2(String str) {
        int rtnVal = 0;
        if (str.length() >= 2) {
            // get the last 2 chars as the pattern to compare with
            String es = str.substring(str.length() - 2, str.length());
            // loop through the string, ignoring the last 2 chars
            for (int i = 0; i < str.length() - 2; i++) {
                // check for occurrence of the pattern
                if (str.substring(i, i + 2).equals(es)) {
                    rtnVal++;
                }
            }
        }
        return rtnVal;
    }

    /* Given a non-empty string like "Code" return a string like "CCoCodCode".
    stringSplosion("Code") → "CCoCodCode"
    stringSplosion("abc") → "aababc"
    stringSplosion("ab") → "aab"
     */
    public String stringSplosion(String str) {
        String rtnVal = "";
        for (int i = 0; i < str.length(); i++) {
            // start of substring will always be at index 0
            // end of substring will increase 1 char on every loop
            rtnVal = rtnVal.concat(str.substring(0, i + 1));
        }
        return rtnVal;
    }

    /* Given a string, return a new string made of every other char starting with the first,
    so "Hello" yields "Hlo".
    stringBits("Hello") → "Hlo"
    stringBits("Hi") → "H"
    stringBits("Heeololeo") → "Hello"
     */
    public String stringBits(String str) {
        String rtnVal = "";
        for (int i = 0; i < str.length(); i++) {
            // keep char if index is even
            if (i % 2 == 0) {
                rtnVal = rtnVal.concat(str.substring(i, i + 1));
            }
        }
        return rtnVal;
    }

    /* Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
    doubleX("axxbb") → true
    doubleX("axaxax") → false
    doubleX("xxxxx") → true
     */
    public boolean doubleX(String str) {
        boolean rtnVal = false;
        for (int i = 0; i < str.length() - 1; i++) {
            // check if this character is an "x",
            // note: str.charAt() can also be used here
            if (str.substring(i, i + 1).equals("x")) {
                // then check if it is followed by another "x"
                if (str.substring(i + 1, i + 2).equals("x")) {
                    rtnVal = true;
                }
                // leave the loop on first occurrence of finding an "x"
                break;
            }
        }
        return rtnVal;
    }

    /* Count the number of "xx" in the given string.
    We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
    countXX("abcxx") → 1
    countXX("xxx") → 2
    countXX("xxxx") → 3
     */
    public int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                count++;
            }
        }
        return count;
    }

    /* Given a string and a non-negative int n,
    we'll say that the front of the string is the first 3 chars,
    or whatever is there if the string is less than length 3. Return n copies of the front;
    frontTimes("Chocolate", 2) → "ChoCho"
    frontTimes("Chocolate", 3) → "ChoChoCho"
    frontTimes("Abc", 3) → "AbcAbcAbc"
     */
    public String frontTimes(String str, int n) {
        String rtnVal = "";
        String front = "";
        if (str.length() >= 3) {
            front = str.substring(0, 3);
        } else {
            front = str;
        }
        for (int i = 0; i < n; i++) {
            rtnVal = rtnVal.concat(front);
        }
        return rtnVal;
    }

    /* Given a string and a non-negative int n,
    return a larger string that is n copies of the original string.
    stringTimes("Hi", 2) → "HiHi"
    stringTimes("Hi", 3) → "HiHiHi"
    stringTimes("Hi", 1) → "Hi"
    stringTimes("Hi", 0) → ""
     */
    public String stringTimes(String str, int n) {
        String rtnVal = "";
        for (int i = 0; i < n; i++) {
            rtnVal = rtnVal.concat(str);
        }
        return rtnVal;
    }
}
