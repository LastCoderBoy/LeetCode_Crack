package InterviewQ;

public class ZigZagConversion {
    public static void main(String[] args) {
        System.out.println("Test 1: " + convert("PAYPALISHIRING", 3)); // Output: PAHNAPLSIIGYIR
        System.out.println("Test 1: " + convert("PAYPALISHIRING", 4)); // Output: PINALSIGYAHRPI
    }
    public static String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            currentRow += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
