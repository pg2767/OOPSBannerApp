/**
 * OOPSBannerApp UC7 - Store Character Pattern in a Class
 *
 * This use case extends UC6 by implementing a CharacterPatternMap class to encapsulate
 * character-to-pattern mappings. The application retrieves and displays the "OOPS"
 * banner using these mappings. This approach enhances code organization and modularity.
 *
 * @author Developer
 * @version 7.0
 */

public class OOPSBannerApp {

    // ─── Static Inner Class ────────────────────────────────────────────────────
   /**
    * Create CharacterPatternMap class to hold character and its pattern
    */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        // Constructor: binds a character to its ASCII art pattern
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter: returns the character this map represents
        public char getCharacter() {
            return character;
        }

        // Getter: returns the banner pattern (array of rows) for this character
        public String[] getPattern() {
            return pattern;
        }
    }
    // ──────────────────────────────────────────────────────────────────────────
   /**
    * Main method to display the "OOPS" banner using CharacterPatternMap
    */

    public static void main(String[] args) {

        // 1. Define each character and its ASCII art pattern
        // Implement methods to create and retrieve character patterns
        CharacterPatternMap charO = new CharacterPatternMap('O', new String[]{
            "   ***  ",
            " **   **",
            "**     **",
            "**     **",
            "**     **",
            " **   **",
            "   ***  "
        });

        CharacterPatternMap charP = new CharacterPatternMap('P', new String[]{
            " *****  ",
            " **   **",
            "**    **",
            "**  ***   ",
            "**      ",
            " **      ",
            " **      "
        });

        CharacterPatternMap charS = new CharacterPatternMap('S', new String[]{
            "  ***********  ",
            " **    ",
            "**     ",
            " ***** ",
            "      **",
            " **   **",
            "  ***  "
        });
      
        // 2. Build the OOPS word using an array of CharacterPatternMap objects
        // Use CharacterPatternMap to display the "OOPS" banner
        CharacterPatternMap[] oops = { charO, charO, charP, charS };

        // 3. Use StringBuilder to construct each row across all characters
        // Implement modular and reusable character pattern management
        int rows = charO.getPattern().length;

        for (int row = 0; row < rows; row++) {
            StringBuilder line = new StringBuilder();

            for (int col = 0; col < oops.length; col++) {
                line.append(oops[col].getPattern()[row]);

                // Add spacing between letters (not after the last one)
                if (col < oops.length - 1) {
                    line.append("   ");
                }
            }

            System.out.println(line.toString());
        }
    }
}
