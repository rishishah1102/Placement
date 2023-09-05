package Coding;

import java.util.HashSet;

public class BallArrangements {
    public static HashSet<String> set = new HashSet<>();

    public static void main(String[] args) {
        int redCount = 2;
        int blueCount = 3;
        int greenCount = 1;

        String combination = stringGenerator(redCount, blueCount, greenCount);
        // System.out.println(combination);

        arrangements(combination, "");
    }

    public static String stringGenerator(int redBalls, int blueBalls, int greenBalls) {
        String combination = "";

        for (int i = 0; i < redBalls; i++) {
            combination += "R";
        }

        for (int i = 0; i < blueBalls; i++) {
            combination += "B";
        }

        for (int i = 0; i < greenBalls; i++) {
            combination += "G";
        }

        return combination;
    }

    public static void arrangements(String str, String result) {
        if (str.length() == 0) {
            if (isValidArrangement(result)) {
                if (set.contains(result)) {
                    return;
                }
                set.add(result);
                System.out.println(result);
            }
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            String newStr = str.substring(0, i) + str.substring(i + 1);

            // Appending the selected element and generating possible permutations.
            arrangements(newStr, result + str.charAt(i));
        }
    }

    public static boolean isValidArrangement(String arrangement) {
        for (int i = 0; i < arrangement.length() - 1; i++) {
            if (arrangement.charAt(i) == arrangement.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}

// This algo takes O((redballs + blueballs + greenballs)!) time complexity ~ n!