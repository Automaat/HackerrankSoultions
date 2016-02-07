package javaExc.javaStringCompare;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.max;
import static java.util.Collections.min;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int k = sc.nextInt();
        List<String> strings = new LinkedList<>();
        int i = 0;
        while (i + k <= text.length()) {
            strings.add(text.substring(i, i + k));
            i++;
        }
        System.out.println(min(strings));
        System.out.println(max(strings));
    }
}
