package org.codesolutions;

public class CodingbatString1 {

    public static void main(String[] args) {

        /* Basic string problems -- no loops.

        System.out.println(helloName("Bob"));
        System.out.println(helloName("Alice"));
        System.out.println(helloName("X"));

        System.out.println(makeAbba("Hi", "Bye"));
        System.out.println(makeAbba("Yo", "Alice"));
        System.out.println(makeAbba("What", "Up"));

        System.out.println(makeTags("i", "Yay"));
        System.out.println(makeTags("i", "Hello"));
        System.out.println(makeTags("cite", "Yay"));
        System.out.println(makeOutWord("<<>>", "Yay"));
        System.out.println(makeOutWord("<<>>", "WooHoo"));
        System.out.println(makeOutWord("[[]]", "word"));

        System.out.println(extraEnd("Hello"));
        System.out.println(extraEnd("ab"));
        System.out.println(extraEnd("Hi"));

        System.out.println(firstTwo("Hello"));
        System.out.println(firstTwo("abcdefg"));
        System.out.println(firstTwo("z"));

        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("HelloThere"));
        System.out.println(firstHalf("abcdef"));

        System.out.println(withoutEnd("Hello"));
        System.out.println(withoutEnd("java"));
        System.out.println(withoutEnd("coding"));

        System.out.println(comboString("Hello", "hi"));
        System.out.println(comboString("hi", "Hello"));
        System.out.println(comboString("aaa", "b"));

        System.out.println(nonStart("Hello", "There"));
        System.out.println(nonStart("java", "code"));
        System.out.println(nonStart("shot1", "java"));

        System.out.println(left2("Hello"));
        System.out.println(left2("java"));
        System.out.println(left2("Hi"));

        System.out.println(right2("Hello"));
        System.out.println(right2("java"));
        System.out.println(right2("Hi"));

        System.out.println(theEnd("Hello", true));
        System.out.println(theEnd("Hello", false));
        System.out.println(theEnd("oh", true));
        System.out.println(theEnd("h", true));

        System.out.println(withouEnd2("Hello"));
        System.out.println(withouEnd2("abc"));
        System.out.println(withouEnd2("ab"));

        System.out.println(middleTwo("string"));
        System.out.println(middleTwo("code"));
        System.out.println(middleTwo("Practice"));

        System.out.println(endsLy("oddly"));
        System.out.println(endsLy("y"));
        System.out.println(endsLy("oddy"));

        System.out.println(nTwice("Hello", 2));
        System.out.println(nTwice("Chocolate", 3));
        System.out.println(nTwice("Chocolate", 1));

        System.out.println(twoChar("java", 0));
        System.out.println(twoChar("java", 2));
        System.out.println(twoChar("java", 3));
        System.out.println(twoChar("java", -1));

        System.out.println(middleThree("Candy"));
        System.out.println(middleThree("and"));
        System.out.println(middleThree("solving"));

        System.out.println(hasBad("badxx"));
        System.out.println(hasBad("xbadxx"));
        System.out.println(hasBad("xxbadxx"));

        System.out.println(atFirst("hello"));
        System.out.println(atFirst("hi"));
        System.out.println(atFirst("h"));
        System.out.println(atFirst(""));

        System.out.println(lastChars("last", "chars"));
        System.out.println(lastChars("yo", "java"));
        System.out.println(lastChars("hi", ""));
        */
        System.out.println(conCat("abc", "cat"));
        System.out.println(conCat("dog", "cat"));
        System.out.println(conCat("abc", ""));
        System.out.println(conCat("pig", "doggy"));
    }


    /* Given two strings, append them together (known as "concatenation") and return the result.
    However, if the concatenation creates a double-char, then omit one of the chars,
    so "abc" and "cat" yields "abcat".
    conCat("abc", "cat") → "abcat"
    conCat("dog", "cat") → "dogcat"
    conCat("abc", "") → "abc"
    conCat("pig", "doggy") → "pigdoggy"
     */
    public static String conCat(String a, String b) {
        String lastA = "";
        String firstB = "";
        String remB = "";
        if (a.length() > 0) {
            // get the last char of string A
            lastA = a.substring(a.length() - 1);
        } else {
            // return string B if string A is empty
            return b;
        }
        if (b.length() > 0) {
            // get the first char of string B
            firstB = b.substring(0, 1);
            // get the remaining chars of string B
            remB = b.substring(1);
        } else {
            // return string A if string B is empty
            return a;
        }
        // return string A concatenated with remaining chars in string B (first char dropped).
        if (lastA.equals(firstB)) {
            return a + remB;
        } else {
            // otherwise, return the concatenation of both strings.
            return a + b;
        }
    }

    /* Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
    so "yo" and "java" yields "ya".
    If either string is length 0, use '@' for its missing char.
    lastChars("last", "chars") → "ls"
    lastChars("yo", "java") → "ya"
    lastChars("hi", "") → "h@"
     */
    public static String lastChars(String a, String b) {
        String aChr = "@";
        String bChr = "@";
        if (a.length() > 0) {
            aChr = a.substring(0, 1);
        }
        if (b.length() > 0) {
            bChr = b.substring(b.length() - 1, b.length());
        }
        return aChr + bChr;
    }

    /* Given a string, return a string length 2 made of its first 2 chars.
    If the string length is less than 2, use '@' for the missing chars.
    atFirst("hello") → "he"
    atFirst("hi") → "hi"
    atFirst("h") → "h@"
     */
    public static String atFirst(String str) {
        String rtnVal = "@@";
        if (str.length() >= 2) {
            rtnVal = str.substring(0, 2);
        } else if (str.length() == 1) {
            rtnVal = str + "@";
        }
        return rtnVal;
    }


    /* Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
    such as with "badxxx" or "xbadxx" but not "xxbadxx".
    The string may be any length, including 0.
    Note: use .equals() to compare 2 strings.
    hasBad("badxx") → true
    hasBad("xbadxx") → true
    hasBad("xxbadxx") → false
     */
    public static boolean hasBad(String str) {
        boolean hasBad = false;
        if (str.length() == 3 && str.equals("bad")) {
            hasBad = true;
        } else if (str.length() > 3 &&
                (str.substring(0, 3).toLowerCase().equals("bad") || str.substring(1, 4).toLowerCase().equals("bad"))) {
            hasBad = true;
        }
        return hasBad;
    }
    /* This is a variant of hasBad.
     */
    public static boolean hasBadV2(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("bad")) {
            return true;
        }
        if (str.length() >= 4 && str.substring(1, 4).equals("bad")) {
            return true;
        }
        return false;
    }


    /* Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
    The string length will be at least 3.
    middleThree("Candy") → "and"
    middleThree("and") → "and"
    middleThree("solving") → "lvi"
     */
    public static String middleThree(String str) {
        if (str.length() >= 3) {
            // get the start position
            int strpos = (str.length() / 2) - 1;
            // get the end position
            int endpos = (str.length() / 2) + 2;
            return str.substring(strpos, endpos);
        } else {
            return "";
        }
    }

    /* Given a string and an index, return a string length 2 starting at the given index.
    If the index is too big or too small to define a string length 2, use the first 2 chars.
    The string length will be at least 2.
    twoChar("java", 0) → "ja"
    twoChar("java", 2) → "va"
    twoChar("java", 3) → "ja"
     */
    public static String twoChar(String str, int index) {
        // string must have a length of at least 2
        // and the substring end position must be less than or equal to the string length
        // and index cannot be a negative number
        if (str.length() > 2 && index + 2 <= str.length() && index > 0) {
            return str.substring(index, index + 2);
        } else {
            return str.substring(0, 2);
        }
    }

    /* Given a string and an int n, return a string made of the first and last n chars from the string.
    The string length will be at least n.
    nTwice("Hello", 2) → "Helo"
    nTwice("Chocolate", 3) → "Choate"
    nTwice("Chocolate", 1) → "Ce"
     */
    public static String nTwice(String str, int n) {
        if (str.length() >= n) {
            return str.substring(0,  n) + str.substring(str.length() - n);
        } else {
            return str;
        }
    }

    /* Given a string, return true if it ends in "ly".
    endsLy("oddly") → true
    endsLy("y") → false
    endsLy("oddy") → false
     */
    public static boolean endsLy(String str) {
        if (str.length() >= 2) {
            // get last 2 chars and convert to lower case, then check if equal to "ly".
            return str.substring(str.length() - 2).toLowerCase().equals("ly");
        } else {
            return false;
        }
    }

    /* Given a string of even length, return a string made of the middle two chars,
    so the string "string" yields "ri".
    The string length will be at least 2.
    middleTwo("string") → "ri"
    middleTwo("code") → "od"
    middleTwo("Practice") → "ct"
    */
    public static String middleTwo(String str) {
        return str.substring((str.length() / 2) - 1, (str.length() / 2) + 1);
    }

    /* Given a string, return a version without both the first and last char of the string.
    The string may be any length, including 0.
    withouEnd2("Hello") → "ell"
    withouEnd2("abc") → "b"
    withouEnd2("ab") → ""
     */
    public static String withouEnd2(String str) {
        if (str.length() >= 3) {
            return str.substring(1, str.length() - 1);
        } else {
            return "";
        }
    }

    /* Given a string, return a string length 1 from its front, unless front is false,
    in which case return a string length 1 from its back.
    The string will be non-empty.
    theEnd("Hello", true) → "H"
    theEnd("Hello", false) → "o"
    theEnd("oh", true) → "o"
     */
    public static String theEnd(String str, boolean front) {
        if (str.length() >= 1) {
            if (front) {
                return str.substring(0, 1);
            } else {
                return str.substring(str.length() - 1);
            }
        } else {
            return str;
        }
    }

    /*Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
    The string length will be at least 2.
    right2("Hello") → "loHel"
    right2("java") → "vaja"
    right2("Hi") → "Hi"
     */
    public static String right2(String str) {
        if (str.length() >= 2) {
            return str.substring(str.length()-2) + str.substring(0, str.length()-2);
        } else {
            return str;
        }
    }

    /* Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
    The string length will be at least 2.
    left2("Hello") → "lloHe"
    left2("java") → "vaja"
    left2("Hi") → "Hi" */
    public static String left2(String str) {
        if (str.length() >= 2) {
            return str.substring(2) + str.substring(0, 2);
        } else {
            return str;
        }
    }

    /* Given 2 strings, return their concatenation, except omit the first char of each.
    The strings will be at least length 1.
    nonStart("Hello", "There") → "ellohere"
    nonStart("java", "code") → "avaode"
    nonStart("shotl", "java") → "hotlava"
     */
    public static String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    /* Given 2 strings, a and b, return a string of the form short+long+short,
    with the shorter string on the outside and the longer string on the inside.
    The strings will not be the same length, but they may be empty (length 0).
    comboString("Hello", "hi") → "hiHellohi"
    comboString("hi", "Hello") → "hiHellohi"
    comboString("aaa", "b") → "baaab"
     */
    public static String comboString(String a, String b) {
        if (a.length() > b.length()) {
            return b + a + b;
        } else {
            return a + b + a;
        }
    }


    /* Given a string, return a version without the first and last char,
    so "Hello" yields "ell".
    The string length will be at least 2.
    withoutEnd("Hello") → "ell"
    withoutEnd("java") → "av"
    withoutEnd("coding") → "odin"
     */
    public static String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    /* Given a string of even length, return the first half.
    So the string "WooHoo" yields "Woo".
    firstHalf("WooHoo") → "Woo"
    firstHalf("HelloThere") → "Hello"
    firstHalf("abcdef") → "abc"
     */
    public static String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }


    /* Given a string, return the string made of its first two chars,
    so the String "Hello" yields "He". If the string is shorter than length 2,
    return whatever there is,
    so "X" yields "X", and the empty string "" yields the empty string "".
    Note that str.length() returns the length of a string.
    firstTwo("Hello") → "He"
    firstTwo("abcdefg") → "ab"
    firstTwo("ab") → "ab"
     */
    public static String firstTwo(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else {
            return str;
        }
    }


    /* Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
    The string length will be at least 2.
    extraEnd("Hello") → "lololo"
    extraEnd("ab") → "ababab"
    extraEnd("Hi") → "HiHiHi"
     */
    public static String extraEnd(String str) {
        if (str.length() >= 2) {
            String last2 = str.substring(str.length() - 2);
            return last2 + last2 + last2;
        } else {
            return "";
        }
    }

    /* Given an "out" string length 4, such as "<<>>", and a word,
    return a new string where the word is in the middle of the out string,
    e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and
    going up to but not including index j.
    makeOutWord("<<>>", "Yay") → "<<Yay>>"
    makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
    makeOutWord("[[]]", "word") → "[[word]]"
     */
    public static String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2, 4);
    }

    /* The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
    In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
    Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
    makeTags("i", "Yay") → "<i>Yay</i>"
    makeTags("i", "Hello") → "<i>Hello</i>"
    makeTags("cite", "Yay") → "<cite>Yay</cite>"
     */
    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    /* Given two strings, a and b, return the result of putting them together in the order abba,
    e.g. "Hi" and "Bye" returns "HiByeByeHi".
    makeAbba("Hi", "Bye") → "HiByeByeHi"
    makeAbba("Yo", "Alice") → "YoAliceAliceYo"
    makeAbba("What", "Up") → "WhatUpUpWhat"
     */
    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    /* Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
    helloName("Bob") → "Hello Bob!"
    helloName("Alice") → "Hello Alice!"
    helloName("X") → "Hello X!"
     */
    public static String helloName(String name) {
        return "Hello" + name + "!";
    }

}
