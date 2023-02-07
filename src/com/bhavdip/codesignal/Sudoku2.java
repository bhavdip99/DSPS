package com.bhavdip.codesignal;

public class Sudoku2 {
    public static void main(String[] args) {
        char[][] grid = {{'.', '.', '.', '1', '4', '.', '.', '2', '.'},
                {'.', '.', '6', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '1', '.', '.', '.', '.', '.', '.'},
                {'.', '6', '7', '.', '.', '.', '.', '.', '9'},
                {'.', '.', '.', '.', '.', '.', '8', '1', '.'},
                {'.', '3', '.', '.', '.', '.', '.', '.', '6'},
                {'.', '.', '.', '.', '.', '7', '.', '.', '.'},
                {'.', '.', '.', '5', '.', '.', '.', '7', '.'}};

        Sudoku2 sudoku = new Sudoku2();
        System.out.println(sudoku.solution(grid));
    }

    boolean solution(char[][] grid) {
        for (char[] rows : grid) {
            for (char item : rows) {
                System.out.print(item);
            }
            System.out.println();
        }
        return false;
    }

}
