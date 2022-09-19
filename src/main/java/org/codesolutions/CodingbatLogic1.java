package org.codesolutions;

public class CodingbatLogic1 {
    public static void main(String[] args) {
        /* Basic boolean logic puzzles -- if else && || !

        System.out.println(cigarParty(30, false));
        System.out.println(cigarParty(50, false));
        System.out.println(cigarParty(70, false));
        System.out.println(cigarParty(30, true));

        System.out.println(dateFashion(5, 10));
        System.out.println(dateFashion(5, 2));
        System.out.println(dateFashion(5, 5));
        */
        System.out.println(squirrelPlay(70, false));
        System.out.println(squirrelPlay(95, false));
        System.out.println(squirrelPlay(95, true));
    }
    /* The squirrels in Palo Alto spend most of the day playing.
    In particular, they play if the temperature is between 60 and 90 (inclusive).
    Unless it is summer, then the upper limit is 100 instead of 90.
    Given an int temperature and a boolean isSummer,
    return true if the squirrels play and false otherwise.
    squirrelPlay(70, false) → true
    squirrelPlay(95, false) → false
    squirrelPlay(95, true) → true */
    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer) {
            return (temp >= 60 && temp <= 100);
        } else {
            return (temp >= 60 && temp <= 90);
        }
    }

    /* You and your date are trying to get a table at a restaurant.
    The parameter "you" is the stylishness of your clothes,
    in the range 0..10, and "date" is the stylishness of your date's clothes.
    The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes.
    If either of you is very stylish, 8 or more, then the result is 2 (yes).
    With the exception that if either of you has style of 2 or less,
    then the result is 0 (no). Otherwise the result is 1 (maybe).
    dateFashion(5, 10) → 2
    dateFashion(5, 2) → 0
    dateFashion(5, 5) → 1
    */
    public static int dateFashion(int you, int date) {
        int rtnVal = 1;
        if ((you >= 8 || date >= 8)) {
            rtnVal = 2;
        }
        if ((you <= 2 || date <= 2)) {
            rtnVal = 0;
        }
        return rtnVal;
    }

    /* When squirrels get together for a party, they like to have cigars.
    A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend,
    in which case there is no upper bound on the number of cigars.
    Return true if the party with the given values is successful, or false otherwise.
    cigarParty(30, false) → false
    cigarParty(50, false) → true
    cigarParty(70, true) → true */
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        return ((cigars >= 40 && cigars <= 60) || (isWeekend && cigars >= 40));
    }

}
