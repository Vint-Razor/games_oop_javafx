package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        if (firstRowIndex(board) >= 0 && checkColumn(board, firstRowIndex(board))) {
            return true;
        } else if (firstColumnIndex(board) >= 0 && checkRow(board, firstColumnIndex(board))) {
            return true;
        } else {
            return false;
        }
    }

    public static int firstColumnIndex(int[][] array) {
        for (int i = 0; i < array[0].length; i++) {
            if (array[0][i] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static int firstRowIndex(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static boolean checkColumn(int[][] array, int index) {
        for (int num : array[index]) {
            if (num != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkRow(int[][] array, int index) {
        for (int i = 0; i < array.length; i++) {
            if (array[i][index] != 1) {
                return false;
            }
        }
        return true;
    }
}
