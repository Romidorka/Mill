package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Board board = new Board();
//        board.randomize_board();
        board.fill(1);
        System.out.println(Arrays.toString(board.board));
        board.print_board();
    }
}
