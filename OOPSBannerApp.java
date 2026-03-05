
import java.util.HashMap;

public class OopsBanner {

    public static void main(String[] args) {

        // Step 1: Create the pattern registry
        HashMap<Character, String[]> patternMap = new HashMap<>();

        // Step 2: Register each character — every row MUST be exactly 8 chars
        patternMap.put('O', new String[]{
            "  ****  ",   // row 0
            "**    **",   // row 1
            "**    **",   // row 2
            "**    **",   // row 3
            "**    **",   // row 4
            "**    **",   // row 5
            "  ****  "    // row 6
        });

        patternMap.put('P', new String[]{
            "******* ",   // row 0
            "**    **",   // row 1
            "**    **",   // row 2
            "******* ",   // row 3
            "**      ",   // row 4
            "**      ",   // row 5
            "**      "    // row 6
        });

        patternMap.put('S', new String[]{
            "  ******",   // row 0
            "**      ",   // row 1
            "**      ",   // row 2
            "  ****  ",   // row 3
            "      **",   // row 4
            "      **",   // row 5
            "******  "    // row 6
        });

        // Step 3: Define the word to display
        char[] word = { 'O', 'O', 'P', 'S' };

        // Step 4: Render — loop through each row, build line with StringBuilder
        int rows = 7;

        for (int row = 0; row < rows; row++) {
            StringBuilder line = new StringBuilder();

            for (int col = 0; col < word.length; col++) {
                // O(1) HashMap lookup by character key
                String[] pattern = patternMap.get(word[col]);
                line.append(pattern[row]);

                // Three spaces between letters, nothing after last
                if (col < word.length - 1) {
                    line.append("   ");
                }
            }

            System.out.println(line.toString());
        }
    }
}
