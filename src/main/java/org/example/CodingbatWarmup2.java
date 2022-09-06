package org.example;

public class CodingbatWarmup2 {

    public static void main(String[] args) {
        /*
        System.out.println(stringTimes("Hi", 2));
        System.out.println(stringTimes("Hi", 3));
        System.out.println(stringTimes("Hi", 1));
        System.out.println(stringTimes("Hi", 0));

        System.out.println(frontTimes("Chocolate", 2));
        System.out.println(frontTimes("Chocolate", 3));
        System.out.println(frontTimes("Abc", 3));
        System.out.println(frontTimes("Abcde", 0));

        System.out.println(countXX("abcxx"));
        System.out.println(countXX("xxx"));
        System.out.println(countXX("xxxx"));
         */
        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxxx"));
    }

    /* Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
    doubleX("axxbb") → true
    doubleX("axaxax") → false
    doubleX("xxxxx") → true
     */
    public static boolean doubleX(String str) {
        boolean rtnVal = false;
        for (int i = 0; i < str.length() - 1; i++) {
            // if this character is an "x",
            // note: str.charAt() can also be used here
            if (str.substring(i, i + 1).equals("x")) {
                // then check if it is followed by another "x"
                if (str.substring(i+1, i+2).equals("x")) {
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
    public static int countXX(String str) {
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
    public static String frontTimes(String str, int n) {
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
    public static String stringTimes(String str, int n) {
        String rtnVal = "";
        for (int i = 0; i < n; i++) {
            rtnVal = rtnVal.concat(str);
        }
        return rtnVal;
    }
}
