package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Board9 board = new Board9();
        Rules rules = new Rules(board, 9, 3, true, false);
        Scanner scanner = new Scanner(System.in);


        Arrays.fill(board.board, 1);
        board.board[board.cordsToIndex("7a")]=2;

        board.print_board();
        System.out.println(rules.is_win(1));
        System.out.println(Arrays.toString(board.died_dots));

        board.kill(2, "7a", "7d");
        board.kill(2, "7a", "7g");
        board.kill(2, "7a", "6b");
        board.kill(2, "7a", "5d");
        board.kill(2, "7a", "6f");
        board.kill(2, "7a", "1a");
        board.kill(2, "7a", "1d");


        board.print_board();
        System.out.println(rules.is_win(2));
        System.out.println(Arrays.toString(board.died_dots));
    }
}
