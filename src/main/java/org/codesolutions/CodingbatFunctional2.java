package org.codesolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class CodingbatFunctional2 {
    public static void main(String[] args) {
        /*
        Functional filtering and mapping operations on lists with lambdas.
        The main computation for each of these problems can be done with 1 or 2 lines of lambda code.
         */

        List<Integer> ln = new ArrayList<>(
                Arrays.asList(1, 29, 14, 569));
        List<Integer> lnn = new ArrayList<>(
                Arrays.asList(1, -3, 0, 22, 3, 564));
        List<String> ls = new ArrayList<>(
                Arrays.asList("hi", "Hello", "ABC", "xyz"));

        System.out.println(noNeg(lnn));
        System.out.println(no9(ln));
        System.out.println(noTeen(ln));
        System.out.println(noZ(ls));
        System.out.println(noLong(ls));
        System.out.println(no34(ls));
    }

    /*
    Given a list of strings, return a list of the strings, omitting any string length 3 or 4.

    no34(["a", "bb", "ccc"]) → ["a", "bb"]
    no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]
    no34(["ccc", "dddd", "apple"]) → ["apple"]
     */
    public static List<String> no34(List<String> strings) {
        return strings.stream().filter(s -> s.length() < 3 || s.length() > 4).collect(Collectors.toList());
    }

    /*
    Given a list of strings, return a list of the strings, omitting any string length 4 or more.

    noLong(["this", "not", "too", "long"]) → ["not", "too"]
    noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
    noLong(["cccc", "cccc", "cccc"]) → []
     */
    public static List<String> noLong(List<String> strings) {
        return strings.stream().filter(n -> n.length() < 4).collect(Collectors.toList());
    }

    /*
    Given a list of strings, return a list of the strings, omitting any string that contains a "z".
    (Note: the str.contains(x) method returns a boolean)

    noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
    noZ(["hziz", "hzello", "hi"]) → ["hi"]
    noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
     */
    public static List<String> noZ(List<String> strings) {
        return strings.stream().filter(s -> s.contains("z") == false).collect(Collectors.toList());
    }

    /*
    Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.

    noTeen([12, 13, 19, 20]) → [12, 20]
    noTeen([1, 14, 1]) → [1, 1]
    noTeen([15]) → []
     */
    public static List<Integer> noTeen(List<Integer> nums) {
        return nums.stream().filter(n -> n < 13 || n > 19).collect(Collectors.toList());
    }


    /*
    Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9.
    (Note: % by 10)

    no9([1, 2, 19]) → [1, 2]
    no9([9, 19, 29, 3]) → [3]
    no9([1, 2, 3]) → [1, 2, 3]
     */
    public static List<Integer> no9(List<Integer> nums) {
        return nums.stream().filter(n -> (n % 10) != 9).collect(Collectors.toList());
    }

    /*
    Given a list of integers, return a list of the integers, omitting any that are less than 0.

    noNeg([1, -2]) → [1]
    noNeg([-3, -3, 3, 3]) → [3, 3]
    noNeg([-1, -1, -1]) → []
     */
    public static List<Integer> noNeg(List<Integer> nums) {
        return nums.stream().filter(n -> n >= 0).collect(Collectors.toList());
    }
}
