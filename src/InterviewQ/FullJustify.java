package InterviewQ;

import java.util.ArrayList;
import java.util.List;

public class FullJustify {
    public List<String> Justify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        List<String> currentLine = new ArrayList<>();
        int numOfLetters = 0;

        for (String word : words) {
            // Check if adding the next word exceeds maxWidth
            if (numOfLetters + currentLine.size() + word.length() > maxWidth) {
                // Time to justify the current line
                int spacesToDistribute = maxWidth - numOfLetters;
                int gaps = currentLine.size() - 1;

                StringBuilder justifiedLine = new StringBuilder();
                if (gaps == 0) {
                    // Special case: Only one word in the line
                    justifiedLine.append(currentLine.get(0));
                    appendSpaces(justifiedLine, spacesToDistribute);
                } else {
                    int spacesPerGap = spacesToDistribute / gaps;
                    int extraSpaces = spacesToDistribute % gaps;

                    for (int i = 0; i < currentLine.size(); i++) {
                        justifiedLine.append(currentLine.get(i));
                        if (i < gaps) {
                            appendSpaces(justifiedLine, spacesPerGap + (i < extraSpaces ? 1 : 0));
                        }
                    }
                }
                result.add(justifiedLine.toString());
                currentLine.clear();
                numOfLetters = 0;
            }
            currentLine.add(word);
            numOfLetters += word.length();
        }

        // Handle the last line - left-justified
        StringBuilder lastLine = new StringBuilder(String.join(" ", currentLine));
        appendSpaces(lastLine, maxWidth - lastLine.length());
        result.add(lastLine.toString());

        return result;
    }

    private void appendSpaces(StringBuilder line, int count) {
        for (int i = 0; i < count; i++) {
            line.append(' ');
        }
    }

    public static void main(String[] args) {
        FullJustify fullJustify = new FullJustify();
        List<String> justifiedText = fullJustify.Justify(
                new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16);
        for (String line : justifiedText) {
            System.out.println("'" + line + "'");
        }
    }

}
