package org.codesolutions;

public class CodingbatWarmup1 {
    public static void main(String[] args) {
        /*
        System.out.println(startOz("ozwizard"));
        System.out.println(startOz("owizard"));
        System.out.println(startOz("azizard"));
        System.out.println(startOz("wizard"));
        System.out.println(startOz(""));
        System.out.println(startOz(null));

        System.out.println(intMax(1,2,3));
        System.out.println(intMax(4,2,1));
        System.out.println(intMax(1,1,1));
        System.out.println(intMax(-3,-1,-2));

        System.out.println(close10(8, 14));
        System.out.println(close10(5, 12));
        System.out.println(close10(6, 14));

        System.out.println(in3050(30, 31));
        System.out.println(in3050(30, 29));
        System.out.println(in3050(29, 30));
        System.out.println(in3050(30, 31));
        System.out.println(in3050(29, 40));
        System.out.println(in3050(40, 50));

        System.out.println(max1020(11, 19));
        System.out.println(max1020(18, 12));
        System.out.println(max1020(22, 14));
        System.out.println(max1020(15, 33));
        System.out.println(max1020(8, 33));
        System.out.println(max1020(0, 0));

        System.out.println(stringE("hello"));
        System.out.println(stringE("hellothere"));
        System.out.println(stringE("hithere"));
        System.out.println(stringE("he"));
        System.out.println(stringE(""));
        System.out.println(stringE("Heelele"));

        System.out.println(lastDigit(27, 57));
        System.out.println(lastDigit(16, 36));
        System.out.println(lastDigit(4, 14));
        System.out.println(lastDigit(17, 25));
        System.out.println(lastDigit(0, 45));

        System.out.println(endUp("hello"));
        System.out.println(endUp("hello there this is a test"));
        System.out.println(endUp("his"));
        System.out.println(endUp("hi"));

        System.out.println(everyNth("Miracle", 2));
        System.out.println(everyNth("abcdefg", 2));
        System.out.println(everyNth("abcdefg", 3));
        */

        /*
        diff21(21);

        System.out.println(posNeg(1, -2, false));
        System.out.println(posNeg(-1, 2, false));
        System.out.println(posNeg(1, 2, false));
        System.out.println(posNeg(-1, -2, false));
        System.out.println(posNeg(1, -2, true));
        System.out.println(posNeg(-1, 2, true));
        System.out.println(posNeg(1, 2, true));
        System.out.println(posNeg(-1, -2, true));

        System.out.println(notString("Hello"));
        System.out.println(notString("notHello"));
        System.out.println(notString("ab"));
        System.out.println(notString(""));

        System.out.println(missingChar("hello", 1));
        System.out.println(missingChar("hello", 2));
        System.out.println(missingChar("hello", 0));

        System.out.println(frontBack("hello"));
        System.out.println(frontBack("hello there"));
        System.out.println(frontBack("ab"));
        System.out.println(frontBack("q"));
        System.out.println(frontBack(""));

        System.out.println(front("wonderful"));
        System.out.println(front("and"));
        System.out.println(front("in"));
        System.out.println(front(""));

        System.out.println(backAround("Hello"));
        System.out.println(backAround("Test phrase"));
        System.out.println(backAround("y"));
        System.out.println(backAround(""));

        System.out.println(or35(3));
        System.out.println(or35(5));
        System.out.println(or35(4));
        System.out.println(or35(0));
        System.out.println(or35(-1));

        System.out.println(front22("hello"));
        System.out.println(front22("kitty"));
        System.out.println(front22("an"));
        System.out.println(front22("i"));
        System.out.println(front22(""));

        System.out.println(startHi("hi there"));
        System.out.println(startHi("hi"));
        System.out.println(startHi("hello"));
        System.out.println(startHi(""));

        System.out.println(icyHot(120, -1));
        System.out.println(icyHot(-2, 110));
        System.out.println(icyHot(99, -1));
        System.out.println(icyHot(120, 3));
        System.out.println(icyHot(101, -1));

        System.out.println(in1020(11, 15));
        System.out.println(in1020(9, 15));
        System.out.println(in1020(11, 22));
        System.out.println(in1020(10, 22));
        System.out.println(in1020(8, 20));
        System.out.println(in1020(9, 21));
        System.out.println(in1020(0, 0));

        System.out.println(hasTeen(10, 9, 14));
        System.out.println(hasTeen(10, 9, 21));
        System.out.println(hasTeen(0, 0, 15));
        System.out.println(hasTeen(0, 0, 0));

        System.out.println(loneTeen(10, 17));
        System.out.println(loneTeen(16, 21));
        System.out.println(loneTeen(8, 21));
        System.out.println(loneTeen(0, 0));

        System.out.println(delDel("hello"));
        System.out.println(delDel("adel pail"));
        System.out.println(delDel("pdelut"));
        System.out.println(delDel(""));
        */
        System.out.println(mixStart("mixtrail"));
        System.out.println(mixStart("hixsquare"));
        System.out.println(mixStart("mister"));
        System.out.println(mixStart(""));

    }

    /* Return true if the given string begins with "mix",
    except the 'm' can be anything, so "pix", "9ix" .. all count.
     */
    public static boolean mixStart(String str) {
        boolean isIx = false;
        if (str.length() >= 3) {
            String ix = str.substring(1, 3);
            if (ix.equals("ix")) {
                isIx = true;
            }
        }
        return isIx;
    }


    /* Given a string, if the string "del" appears starting at index 1,
    return a string where that "del" has been deleted.
    Otherwise, return the string unchanged.
     */
    public static String delDel(String str) {
        String del = str;
        // minimum length must be 4 "xdel"
        if (str.length() >= 4) {
            String hasDel = str.substring(1, 4);
            if (hasDel.equals("del")) {
                // reminder: substring "end" value is index-1
                del = str.substring(0, 1) + str.substring(4, str.length());
            }
        }
        return del;
    }

    /* We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    Given 2 int values, return true if one or the other is teen,
    but not both.
     */
    public static boolean loneTeen(int a, int b) {
        boolean hasLoneTeen = false;
        if ((a >= 13) && (a <= 19)) {
            if ((b < 13) || (b > 19)) {
                hasLoneTeen = true;
            }
        } else if ((b >= 13) && (b <= 19)) {
            hasLoneTeen = true;
        }
        return hasLoneTeen;
    }

    /* We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    Given 3 int values, return true if 1 or more of them are teen.
     */
    public static boolean hasTeen(int a, int b, int c) {
        boolean hasTeen = false;
        if (((a >= 13) && (a <= 19)) || ((b >= 13) && (b <= 19)) || ((c >= 13) && (c <= 19))) {
            hasTeen = true;
        }
        return hasTeen;
    }

    /* Given 2 int values, return true if either of them is in the range 10..20 inclusive.
     */
    public static boolean in1020(int a, int b) {
        boolean isInRange = false;
        if (((a >= 10) && (a <= 20)) || ((b >= 10) && (b <= 20))) {
            isInRange = true;
        }
        return isInRange;
    }

    /* Given two temperatures, return true if one is less than 0 and the other is greater than 100.
     */
    public static boolean icyHot(int temp1, int temp2) {
        boolean isIcyHot = false;
        if ((temp1 < 0) && (temp2 > 100) || (temp2 < 0) && (temp1 > 100)) {
            isIcyHot = true;
        }
        return isIcyHot;
        /*
        if ((temp1 < 0) && (temp2 > 100) || (temp2 < 0) && (temp1 > 100)) {
            return true;
        } else {
            return false;
        }
         */
    }

    /* Given a string, return true if the string starts with "hi" and false otherwise.
     */
    public static boolean startHi(String str) {
        boolean isHi = false;
        if (str.length() >= 2) {
            String firstTwo = str.substring(0, 2);
            if (firstTwo.equals("hi")) {
                isHi = true;
            }
        }
        return isHi;
    }

    /* Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
    so "kitten" yields"kikittenki".
    If the string length is less than 2, use whatever chars are there.
     */
    public static String front22(String str) {
        String val = "";
        String pre = "";
        if (str.length() >= 2) {
            pre = str.substring(0, 2);
        } else {
            pre = str;
        }
        val = pre.concat(str).concat(pre);
        return val;
    }

    /* Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
    Use the % "mod" operator -- see Introduction to Mod
     */
    public static boolean or35(int n) {
        boolean flg = false;
        if ((n > 0) && ((n % 3 == 0) || (n % 5 == 0))) {
            flg = true;
        }
        return flg;
    }

    /* Given a string, take the last char and return a new string with the last char added at the front and back,
    so "cat" yields "tcatt".
    The original string will be length 1 or more.
     */
    public static String backAround(String str) {
        String val = "";
        int len = str.length();
        if (len >= 1) {
            String lastChar = str.substring(len - 1, len);
            val = lastChar.concat(str).concat(lastChar);
        }
        return val;
    }

    /* Given a string, we'll say that the front is the first 3 chars of the string.
    If the string length is less than 3, the front is whatever is there.
    Return a new string which is 3 copies of the front.
     */
    public static String front(String str) {
        String val = "";
        String firstThree = "";
        int len = str.length();
        if (len >= 3) {
            firstThree = str.substring(0, 3);
        } else {
            firstThree = str;
        }
        // String.repeat is only available in Java11
        //val = firstThree.repeat(3);
        // Using join and Collections
        //val = String.join("", Collections.nCopies(3, firstThree));
        val = firstThree.concat(firstThree).concat(firstThree);
        return val;
    }

    /* Given a string, return a new string where the first and last chars have been exchanged.
     */
    public static String frontBack(String str) {
        String val = "";
        int len = str.length();
        if (len > 1) {
            val = str.substring(len - 1, len) + str.substring(1, len - 1) + str.substring(0, 1);
        } else {
            val = str;
        }
        return val;
    }

    /* Given a non-empty string and an int n, return a new string where the char at index n has been removed.
    The value of n will be a valid index of a char in the original string
    (i.e. n will be in the range 0..str.length()-1 inclusive).
     */
    public static String missingChar(String str, int n) {
        String val = "";
        int len = str.length();
        if ((len > 0) && (n <= (len - 1))) {
            val = str.substring(0, n) + str.substring(n + 1);
        }
        return val;
    }


    /* Given a string, return a new string where "not " has been added to the front.
    However, if the string already begins with "not", return the string unchanged.
    Note: use .equals() to compare 2 strings.
     */
    public static String notString(String str) {
        String rtn = "";
        String nt = "not";
        int len = str.length();
        if (len >= 3) {
            if (str.substring(0, 3).equals(nt)) {
                rtn = str;
            } else {
                rtn = nt.concat(" ").concat(str);
            }
        } else {
            rtn = nt.concat(" ").concat(str);
        }
        return rtn;
    }

    /* Given 2 int values, return true if one is negative and one is positive.
    Except if the parameter "negative" is true, then return true only if both are negative.
     */
    public static boolean posNeg(int a, int b, boolean negative) {
        boolean pn = false;
        if (negative) {
            if ((a < 0) && (b < 0)) {
                pn = true;
            }
        } else {
            if (((a > 0) && (b < 0)) || ((b > 0) && (a < 0))) {
                pn = true;
            }
        }
        return pn;
    }

    public int diff21(int n) {
        int a = Math.abs(21 - n);
        if (n > 21) {
            a *= 2;
        }
        return a;
    }


    /* Given a non-empty string and an int N, return the string made starting with char 0,
    and then every Nth char of the string.
    So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
    everyNth("Miracle", 2) → "Mrce"
    everyNth("abcdefg", 2) → "aceg"
    everyNth("abcdefg", 3) → "adg
     */
    public static String everyNth(String str, int n) {
        String rtnStr = "";
        for (int i = 0; i < str.length(); i = i + n) {
            rtnStr = rtnStr.concat(str.substring(i, i + 1));
        }
        return rtnStr;
    }

    /* Given a string, return a new string where the last 3 chars are now in upper case.
    If the string has less than 3 chars, uppercase whatever is there.
    Note that str.toUpperCase() returns the uppercase version of a string.
    endUp("Hello") → "HeLLO"
    endUp("hi there") → "hi thERE"
    endUp("hi") → "HI"
     */
    public static String endUp(String str) {
        String endUp = str;
        if (str.length() > 3) {
            endUp = endUp.substring(0, str.length() - 3);
            for (int i = 0; i < str.length(); i++) {
                if (i >= (str.length() - 3)) {
                    endUp = endUp.concat(str.substring(i, i + 1).toUpperCase());
                }
            }
        } else {
            endUp = str.toUpperCase();
        }
        return endUp;
    }

    /* Given two non-negative int values, return true if they have the same last digit,
    such as with 27 and 57. Note that the % "mod" operator computes remainders,
    so 17 % 10 is 7.
    lastDigit(7, 17) → true
    lastDigit(6, 17) → false
    lastDigit(3, 113) → true
     */
    public static boolean lastDigit(int a, int b) {
        boolean isSameLastDigit = false;
        if ((a % 10 == b % 10)) {
            isSameLastDigit = true;
        }
        return isSameLastDigit;
    }

    /* Return true if the given string contains between 1 and 3 'e' chars.
    stringE("Hello") → true
    stringE("Heelle") → true
    stringE("Heelele") → false
     */
    public static boolean stringE(String str) {
        boolean hasE = false;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ('e')) {
                count++;
            }
        }
        if (count >= 1 && count <= 3) {
            hasE = true;
        }
        return hasE;
    }

    /* Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
    or return 0 if neither is in that range.
    max1020(11, 19) → 19
    max1020(19, 11) → 19
    max1020(11, 9) → 11
     */
    public static int max1020(int a, int b) {
        int rtnVal = 0;
        boolean aInRange = inRange(a, 10, 20);
        boolean bInRange = inRange(b, 10, 20);
        if (aInRange) {
            if (bInRange) {
                if (a > b) {
                    rtnVal = a;
                } else if (b > a) {
                    rtnVal = b;
                }
            } else {
                rtnVal = a;
            }
        } else if (bInRange) {
            rtnVal = b;
        }
        return rtnVal;
    }

    private static boolean inRange(int val, int min, int max) {
        boolean inRange = false;
        if (val >= min && val <= max) {
            inRange = true;
        }
        return inRange;
    }


    /* Given 2 int values, return true if they are both in the range 30..40 inclusive,
    or they are both in the range 40..50 inclusive.
    in3050(30, 31) → true
    in3050(30, 41) → false
    in3050(40, 50) → true
     */
    public static boolean in3050(int a, int b) {
        boolean in3050 = false;
        if ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) {
            in3050 = true;
        } else if ((a >= 40 && a <= 50) && (b >= 40 && b <= 50)) {
            in3050 = true;
        }
        return in3050;
    }

    /* Given 2 int values, return whichever value is nearest to the value 10,
    or return 0 in the event of a tie.
    Note that Math.abs(n) returns the absolute value of a number.
     */
    public static int close10(int a, int b) {
        int rtnVal = 0;
        int base = 10;
        int aDiff = Math.abs(base - a);
        int bDiff = Math.abs(base - b);
        if (aDiff != bDiff) {
            if (aDiff < bDiff) {
                rtnVal = a;
            } else {
                rtnVal = b;
            }
        }
        return rtnVal;
    }

    /* Given three int values, a b c, return the largest.
     */
    public static int intMax(int a, int b, int c) {
        int maxVal;
        if (a > b) {
            maxVal = a;
        } else {
            maxVal = b;
        }

        if (c > maxVal) {
            maxVal = c;
        }
        return maxVal;
    }

    public static int intMax2(int a, int b, int c) {
        int maxVal = a;
        int[] arr = {a, b, c};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    /* Given a string, return a string made of the first 2 chars (if present),
    however include first char only if it is 'o' and include the second only if it is 'z',
    so "ozymandias" yields "oz".
     */

    public static String startOz(String str) {
        String rtnVal = "";
        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                if ((i == 0) && (str.charAt(i) == 'o') || (i == 1) && (str.charAt(i) == 'z')) {
                    rtnVal = rtnVal.concat(String.valueOf(str.charAt(i)));
                }
            }
        }
        return rtnVal;
    }
}
