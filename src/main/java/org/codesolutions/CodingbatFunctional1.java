package org.codesolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CodingbatFunctional1 {
    public static void main(String[] args) {
        /*
        Functional mapping operations on lists with lambdas.
        The main computation for each of these problems can be done with 1 line of lambda code.
         */

        List<Integer> ln = new ArrayList<>(
                Arrays.asList(1, 22, 3, 564));
        List<String> ls = new ArrayList<>(
                Arrays.asList("hi", "Hello", "ABC", "xyz"));

        System.out.println(doubling(ln));
        System.out.println(square(ln));
        System.out.println(addStar(ls));
        System.out.println(copies3(ls));
        System.out.println(moreY(ls));
        System.out.println(math1(ln));
        System.out.println(rightDigit(ln));
        System.out.println(lower(ls));
        System.out.println(noX(ls));
    }

    /*
    Given a list of strings, return a list where each string has all its "x" removed.

    noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
    noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
    noX(["x"]) → [""]
     */
    public static List<String> noX(List<String> strings) {
        return strings.stream().map(s -> s.replace("x", "")).collect(Collectors.toList());
    }

    /*
    Given a list of strings, return a list where each string is converted to lower case
    (Note: String toLowerCase() method).

    lower(["Hello", "Hi"]) → ["hello", "hi"]
    lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
    lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]
     */
    public static List<String> lower(List<String> strings) {
        return strings.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
    }

    /*
    Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)

    rightDigit([1, 22, 93]) → [1, 2, 3]
    rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
    rightDigit([10, 0]) → [0, 0]
     */
    public static List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream().map(n -> n % 10).collect(Collectors.toList());
    }

    /*
    Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.

    math1([1, 2, 3]) → [20, 30, 40]
    math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
    math1([10]) → [110]
     */
    public static List<Integer> math1(List<Integer> nums) {
        return nums.stream().map(n -> (n + 1) * 10).collect(Collectors.toList());
    }

    /*
    Given a list of strings, return a list where each string has "y" added at its start and end.

    moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
    moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
    moreY(["yay"]) → ["yyayy"]
     */
    public static List<String> moreY(List<String> strings) {
        return strings.stream().map(s -> "y" + s + "y").collect(Collectors.toList());
    }

    /*
    Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.

    copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
    copies3(["24", "a", ""]) → ["242424", "aaa", ""]
    copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]
    */
    public static List<String> copies3(List<String> strings) {
        return strings.stream().map(s -> s + s + s).collect(Collectors.toList());
    }

    /*
    Given a list of strings, return a list where each string has "*" added at its end.

    addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
    addStar(["hello", "there"]) → ["hello*", "there*"]
    */
    public static List<String> addStar(List<String> strings) {
        return strings.stream().map(s -> s + "*").collect(Collectors.toList());
    }

    /*
    Given a list of integers, return a list where each integer is multiplied with itself.

    square([1, 2, 3]) → [1, 4, 9]
    square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
    square([]) → []
    */
    public static List<Integer> square(List<Integer> nums) {
        return nums.stream().map(n -> n * n).collect(Collectors.toList());
    }

    /*
    Given a list of integers, return a list where each integer is multiplied by 2.

    doubling([1, 2, 3]) → [2, 4, 6]
    doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
    */
    public static List<Integer> doubling(List<Integer> nums) {
        return nums.stream().map(n -> n * 2).collect(Collectors.toList());
    }







}
