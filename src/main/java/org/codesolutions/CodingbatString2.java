package org.codesolutions;

public class CodingbatString2 {

    public static void main(String[] args) {
        // Medium String problems -- loop allowed.

        System.out.println(doubleChar("The"));
        System.out.println(doubleChar("AAbb"));
        System.out.println(doubleChar("Hi-There"));
    }

    /* Given a string, return a string where for every char in the original, there are two chars.
    doubleChar("The") → "TThhee"
    doubleChar("AAbb") → "AAAAbbbb"
    doubleChar("Hi-There") → "HHii--TThheerree"
    */
    public static String doubleChar(String str) {
        String rVal = "";
        for (int i =  0; i < str.length(); i++) {
            String c = str.substring(i, i + 1);
            rVal = rVal + c + c;
        }
        return rVal;
    }

}
