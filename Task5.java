package JavaOopsProject;

import java.util.Arrays;

/**Check if Two Strings are Anagrams: Given two strings, determine if
        they are anagrams, meaning they contain the same characters in a
        different order. For example, "listen" and "silent" are anagrams.*/

public class Task5 {
    public static void main(String[] args) {
        String s1="cat";
        String s2="act";

        char[] c1=s1.toCharArray(); //{c,a,t}
        char []c2=s2.toCharArray(); //{a,c,t}
        Arrays.sort(c1);// {a,c,t}
        Arrays.sort(c2); //{a,c,t}

        boolean isAnaGram =Arrays.equals(c1,c2);
        System.out.println(isAnaGram);
    }
}
