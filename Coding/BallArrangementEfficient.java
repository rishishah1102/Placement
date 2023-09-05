package Coding;

public class BallArrangementEfficient
 {
    public static void main(String[] args) {
        int redCount = 1;
        int blueCount = 2;
        int greenCount = 1;

        generateValidArrangements(redCount, blueCount, greenCount);
    }

    public static void generateValidArrangements(int redCount, int blueCount, int greenCount) {
        char[] arrangement = new char[redCount + blueCount + greenCount];
        backtrack(arrangement, 0, redCount, blueCount, greenCount);
    }

    public static void backtrack(char[] arrangement, int index, int redCount, int blueCount, int greenCount) {
        if (index == arrangement.length) {
            if (isValidArrangement(arrangement)) {
                System.out.println(new String(arrangement));
            }
            return;
        }

        if (redCount > 0) {
            arrangement[index] = 'R';
            backtrack(arrangement, index + 1, redCount - 1, blueCount, greenCount);
        }

        if (blueCount > 0) {
            arrangement[index] = 'B';
            backtrack(arrangement, index + 1, redCount, blueCount - 1, greenCount);
        }

        if (greenCount > 0) {
            arrangement[index] = 'G';
            backtrack(arrangement, index + 1, redCount, blueCount, greenCount - 1);
        }
    }

    public static boolean isValidArrangement(char[] arrangement) {
        for (int i = 1; i < arrangement.length; i++) {
            if (arrangement[i] == arrangement[i - 1]) {
                return false;
            }
        }
        return true;
    }
}

// This algo takes O(3^(redballs + blueballs + greenballs)) time complexity ~ 3^n