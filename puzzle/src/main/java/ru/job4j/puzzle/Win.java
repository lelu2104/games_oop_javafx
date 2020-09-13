package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int index = 0; index < extractDiagonal(board).length; index++) {
            if(board[index][index] == '1') {
                if (monoHorizontal(board, index) || monoVertical(board, index)) {
                    rsl = true;
                    break;
                }
            }
        }
        return rsl;
    }

    public static boolean monoVertical(int[][] board, int cell) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][cell] != '1') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoHorizontal(int[][] board, int row) {
        boolean result = true;
        for (int cell = 0; cell < board.length; cell++) {
            if (board[row][cell] != '1') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static int[] extractDiagonal(int [][] board) {
        int[] rsl = new int[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

}
