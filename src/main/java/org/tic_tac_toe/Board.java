package org.tic_tac_toe;

import org.tic_tac_toe.enums.Symbol;

public class Board {
    private int moveCount;
    private Cell[][] board;
    private int size;

    public Board(int size) {
        this.size = size;
        this.moveCount = 0;
        this.board = new Cell[size][size];
        initializeBoard();
    }

    public boolean isFull() {
        return moveCount == size * size;
    }

    public Cell getCell(int row, int col) {
        if (row < 0 || row >= size || col < 0 || col >= size) {
            throw new IndexOutOfBoundsException("Invalid cell coordinates");
        }
        return board[row][col];
    }

    public boolean setCell(int row, int col, Symbol symbol) {
        if (row < 0 || row >= size || col < 0 || col >= size) {
            throw new IndexOutOfBoundsException("Invalid cell coordinates");
        }
        if (symbol == null || symbol == Symbol.EMPTY) {
            throw new IllegalArgumentException("Invalid symbol");
        }

        if (board[row][col].getCellValue() != Symbol.EMPTY) {
            return false; // Cell already occupied
        }
        board[row][col].setCellValue(symbol);
        moveCount++;
        return true;
    }

    private void initializeBoard() {

    /**
         * Setting up the board with empty cells
         */
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = new Cell();
            }
        }
    }

    public int getSize() {
        return size;
    }

    public Cell[][] getBoard() {
        return board;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j].getCellValue() + " ");
            }
            System.out.println();
        }
    }
}
