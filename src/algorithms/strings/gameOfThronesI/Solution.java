package algorithms.strings.gameOfThronesI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        Map<Character, Integer> occurences = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            Character character = input.charAt(i);
            if (occurences.containsKey(character)) {
                occurences.put(character, occurences.get(character) + 1);
            } else {
                occurences.put(character, 1);
            }
        }

        int odd = 0;
        for (Character character : occurences.keySet()) {
            if (occurences.get(character) % 2 == 1) {
                odd++;
            }
        }
        if (odd > 1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

}
