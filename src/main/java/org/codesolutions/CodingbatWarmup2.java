package org.codesolutions;

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

        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxxx"));

        System.out.println(stringBits("Hello"));
        System.out.println(stringBits("Hi"));
        System.out.println(stringBits("Heeololeo"));

        System.out.println(stringSplosion("Code"));
        System.out.println(stringSplosion("abc"));
        System.out.println(stringSplosion("ab"));

        System.out.println(last2("hixxhi"));
        System.out.println(last2("xaxxaxaxx"));
        System.out.println(last2("axxxaaxx"));
        System.out.println(last2("xx"));

        int[] ia1 = {1, 2, 9};
        System.out.println(arrayCount9(ia1));
        int[] ia2 = {1, 9, 9};
        System.out.println(arrayCount9(ia2));
        int[] ia3 = {1, 9, 9, 3, 9};
        System.out.println(arrayCount9(ia3));

        int[] b1 = {1, 2, 9, 3, 4};
        System.out.println(arrayFront9(b1));
        int[] b2 = {1, 2, 3, 4, 9};
        System.out.println(arrayFront9(b2));
        int[] b3 = {1, 2, 3, 4, 5};
        System.out.println(arrayFront9(b3));
        int[] b4 = {1, 2};
        System.out.println(arrayFront9(b4));
        int[] b5 = {1, 9};
        System.out.println(arrayFront9(b5));

        int[] c1 = {1, 1, 2, 3, 1};
        System.out.println(array123(c1));
        int[] c2 = {1, 1, 2, 4, 1};
        System.out.println(array123(c2));
        int[] c3 = {1, 1, 2, 1, 2, 3};
        System.out.println(array123(c3));

        System.out.println(stringMatchV2("xxcaazz", "xxbaaz"));
        System.out.println(stringMatchV2("abc", "abc"));
        System.out.println(stringMatchV2("abc", "axc"));
        System.out.println(stringMatchV2("xxcaazztfghe", "xxbaaz"));  // test case where string lengths are not same.

        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abxxxcd"));
        System.out.println(stringX("xabxxxcdx"));

        System.out.println(altPairsV2("kitten"));
        System.out.println(altPairsV2("Chocolate"));
        System.out.println(altPairsV2("CodingHorror"));

        System.out.println(stringYak("yakpak"));
        System.out.println(stringYak("pakyak"));
        System.out.println(stringYak("yak123ya"));
        System.out.println(stringYak("HiyakHi"));
        System.out.println(stringYak("xxxyakyyyakzzz"));

        int[] d1 = {6, 6, 2};
        System.out.println(array667(d1));
        int[] d2 = {6, 6, 2, 6};
        System.out.println(array667(d2));
        int[] d3 = {6, 7, 2, 6};
        System.out.println(array667(d3));
        int[] d4 = {6, 7, 2, 6};
        System.out.println(array667(d4));

        int[] e1 = {1, 1, 2, 2, 1};
        System.out.println(noTriples(e1));
        int[] e2 = {1, 1, 2, 2, 2, 1};
        System.out.println(noTriples(e2));
        int[] e3 = {1, 1, 1, 2, 2, 2, 1};
        System.out.println(noTriples(e3));
        */
        int[] f6 = {2, 7, -2};
        System.out.println(has271(f6));
        int[] f5 = {2, 7, 4};
        System.out.println(has271(f5));
        int[] f1 = {1, 2, 7, 1};
        System.out.println(has271(f1));
        int[] f2 = {1, 2, 8, 1};
        System.out.println(has271(f2));
        int[] f3 = {2, 7, 1};
        System.out.println(has271(f3));
        int[] f4 = {2, 7, 3};
        System.out.println(has271(f4));

    }

    /* Given an array of ints, return true if it contains a 2, 7, 1
    pattern: a value, followed by the value plus 5, followed by the value minus 1.
    Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
    has271([1, 2, 7, 1]) → true
    has271([1, 2, 8, 1]) → false
    has271([2, 7, 1]) → true
     */
    public static boolean has271(int[] nums) {
        boolean rtnVal = false;
        for (int i = 0; i < nums.length - 2; i++) {
            int val3 = nums[i] - 1;
            // look for pattern: value, value+5, value-1 ( allow +-2 variance on third value)
            if ((nums[i + 1] == nums[i] + 5) && ((nums[i + 2] >= val3 - 2) && (nums[i + 2] <= val3 + 2))) {
                rtnVal = true;
                break;
            }
        }
        return rtnVal;
    }
    /* This is a variant of has271() using the absolute value instead of the range condition.
     */
    public static boolean has271V2(int[] nums) {
        boolean rtnVal = false;
        for (int i = 0; i < nums.length - 2; i++) {
            int val3 = nums[i] - 1;
            // get absolute diff of 3rd number and sub-pattern3(value-1)
            int diff3 = Math.abs(nums[i + 2] - val3);
            // look for pattern: value, value+5, value-1 ( allow +-2 variance on third value)
            if ((nums[i + 1] == nums[i] + 5) && (diff3 <= 2)) {
                rtnVal = true;
                break;
            }
        }
        return rtnVal;
    }

    /* Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
    Return true if the array does not contain any triples.
    noTriples([1, 1, 2, 2, 1]) → true
    noTriples([1, 1, 2, 2, 2, 1]) → false
    noTriples([1, 1, 1, 2, 2, 2, 1]) → false
     */
    public static boolean noTriples(int[] nums) {
        boolean rtnVal = true;
        for (int i = 0; i < nums.length - 2; i++) {
            if ((nums[i] == nums[i + 1]) && (nums[i] == nums[i + 2])) {
                rtnVal = false;
                break;
            }
        }
        return rtnVal;
    }

    /* Given an array of ints, return the number of times that two 6's are next to each other in the array.
    Also count instances where the second "6" is actually a 7.
    array667([6, 6, 2]) → 1
    array667([6, 6, 2, 6]) → 1
    array667([6, 7, 2, 6]) → 1
     */
    public static int array667(int[] nums) {
        int rtnVal = 0;
        // loop through the array, skip the last element.
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] == 6) && ((nums[i + 1] == 6) || (nums[i + 1] == 7))) {
                rtnVal++;
            }
        }
        return rtnVal;
    }


    /* Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed,
    but the "a" can be any char. The "yak" strings will not overlap.
    stringYak("yakpak") → "pak"
    stringYak("pakyak") → "pak"
    stringYak("yak123ya") → "123ya"
     */
    public static String stringYak(String str) {
        String rtnVal = "";
        for (int i = 0; i < str.length(); i++) {
            int endPos = i + 3;
            if (endPos > str.length()) {
                endPos = str.length();
            }
            // if "yak" is found, then push loop counter to 3 chars forward
            // to skip the "yak" chars
            if (str.substring(i, endPos).equals("yak")) {
                i += 2;
            } else {
                rtnVal = rtnVal.concat(str.substring(i, i + 1));
            }
        }
        return rtnVal;
    }

    /* Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
    altPairs("kitten") → "kien"
    altPairs("Chocolate") → "Chole"
    altPairs("CodingHorror") → "Congrr"
     */
    public static String altPairs(String str) {
        String rtnVal = "";
        // pattern: include 2 chars every other 2 chars (alternating pairs or chars).
        for (int i = 0; i < str.length(); i += 4) {
            // if string length is an odd number and the loop counter is at the last char,
            // then just concatenate the last char.
            if ((str.length() % 2) != 0 && i == str.length() - 1) {
                rtnVal = rtnVal.concat(str.substring(i, i + 1));
                break;
            } else {
                // otherwise concatenate the 2 chars in current position.
                rtnVal = rtnVal.concat(str.substring(i, i + 2));
            }
        }
        return rtnVal;
    }

    /* This variant of the altPairs() that uses the string length value as the substring end parameter.
     */
    public static String altPairsV2(String str) {
        String rtnVal = "";
        // pattern: include 2 chars every other 2 chars (alternating pairs or chars).
        for (int i = 0; i < str.length(); i += 4) {
            // get end position, if end position is greater than the string length,
            // then set the end position to the string length.
            int endPos = i + 2;
            if (endPos > str.length()) {
                endPos = str.length();
            }
            rtnVal = rtnVal.concat(str.substring(i, endPos));
        }
        return rtnVal;
    }


    /* Given a string, return a version where all the "x" have been removed.
    Except an "x" at the very start or end should not be removed.
    stringX("xxHxix") → "xHix"
    stringX("abxxxcd") → "abcd"
    stringX("xabxxxcdx") → "xabcdx"
     */
    public static String stringX(String str) {
        String rtnVal = "";
        for (int i = 0; i < str.length(); i++) {
            // concat to return string if start char is 'x' or end char is 'x'.
            if (((i == 0) || (i == str.length() - 1)) && (str.substring(i, i + 1).equals("x"))) {
                rtnVal = rtnVal.concat(str.substring(i, i + 1));
            } else {
                // skip if char is 'x'.
                if (!str.substring(i, i + 1).equals("x")) {
                    rtnVal = rtnVal.concat(str.substring(i, i + 1));
                }
            }
        }
        return rtnVal;
    }

    /* This is a variant of stringX() that uses String.charAt(i) instead of String.substring(i,i+1)
     */
    public static String stringXV2(String str) {
        String rtnVal = "";
        for (int i = 0; i < str.length(); i++) {
            // concat to return string if start char is 'x' or end char is 'x'.
            if (((i == 0) || (i == str.length() - 1)) && (str.charAt(i) == 'x')) {
                rtnVal = rtnVal.concat(str.substring(i, i + 1));
            } else {
                // skip if char is 'x'.
                if (str.charAt(i) != 'x') {
                    rtnVal = rtnVal.concat(str.substring(i, i + 1));
                }
            }
        }
        return rtnVal;
    }

    /* Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
    So "xxcaazz" and "xxbaaz" yields 3,
    since the "xx", "aa", and "az" substrings appear in the same place in both strings.
    stringMatch("xxcaazz", "xxbaaz") → 3
    stringMatch("abc", "abc") → 2
    stringMatch("abc", "axc") → 0
     */
    public static int stringMatch(String a, String b) {
        int rtnVal = 0;
        // read the string having the shortest length.
        if (a.length() <= b.length()) {
            // loop through the string, except for the last char.
            // check the pattern match for every 2 chars between the string.
            for (int i = 0; i < a.length() - 1; i++) {
                if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                    rtnVal++;
                }
            }
        } else {
            for (int i = 0; i < b.length() - 1; i++) {
                if (b.substring(i, i + 2).equals(a.substring(i, i + 2))) {
                    rtnVal++;
                }
            }
        }
        return rtnVal;
    }

    /* This is a more efficient variant of stringMatch()
    This will get the length of the shortest string and use it to limit the loop.
    This will prevent code duplication.
     */
    public static int stringMatchV2(String a, String b) {
        int rtnVal = 0;
        // get the shortest length between the 2 strings
        int minLen = Math.min(a.length(), b.length());
        // loop through the string, except for the last char.
        // check the pattern match for every 2 chars between the string.
        for (int i = 0; i < minLen - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                rtnVal++;
            }
        }
        return rtnVal;
    }


    /* Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
    array123([1, 1, 2, 3, 1]) → true
    array123([1, 1, 2, 4, 1]) → false
    array123([1, 1, 2, 1, 2, 3]) → true
     */
    public static boolean array123(int[] nums) {
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
    public static boolean arrayFront9(int[] nums) {
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
    public static int arrayCount9(int[] nums) {
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
    public static int last2(String str) {
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
    public static String stringSplosion(String str) {
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
    public static String stringBits(String str) {
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
    public static boolean doubleX(String str) {
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
