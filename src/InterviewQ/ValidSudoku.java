package InterviewQ;

import java.util.HashMap;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        boolean condition = true;

        // Dupe check rows
        for (int row = 0; row < board.length; row++) {
            HashMap<Character, Integer> checkDupeForRow = new HashMap<>();
            for (int column = 0; column < board[row].length; column++) {
                if (board[row][column] == '.') continue;
                if (board[row][column] >= '1' && board[row][column] <= '9') {
                    checkDupeForRow.put(board[row][column], checkDupeForRow.getOrDefault(board[row][column], 0) + 1);
                    if (checkDupeForRow.get(board[row][column]) > 1) return false;
                }
            }
        }

        // Dupe check columns
        for (int column = 0; column < board[0].length; column++) {
            HashMap<Character, Integer> checkDupeForColumn = new HashMap<>();
            for (int row = 0; row < board.length; row++) {
                if (board[row][column] == '.') continue;
                if (board[row][column] >= '1' && board[row][column] <= '9') {
                    checkDupeForColumn.put(board[row][column], checkDupeForColumn.getOrDefault(board[row][column], 0) + 1);
                    if (checkDupeForColumn.get(board[row][column]) > 1) return false;
                }
            }
        }

        //Dupe check 3x3 matrix
        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {
                HashMap<Character, Integer> checkDupeForBox = new HashMap<>();
                for (int row = boxRow * 3; row < boxRow * 3 + 3; row++) {
                    for (int col = boxCol * 3; col < boxCol * 3 + 3; col++) {
                        if (board[row][col] == '.') continue;
                        if (board[row][col] >= '1' && board[row][col] <= '9') {
                            checkDupeForBox.put(board[row][col], checkDupeForBox.getOrDefault(board[row][col], 0) + 1);
                            if (checkDupeForBox.get(board[row][col]) > 1) return false;
                        }
                    }
                }
            }
        }
        return condition;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        char[][] board2 = {
                {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(isValidSudoku(board));
        System.out.println(isValidSudoku(board2));
    }
}
