package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Board9 board = new Board9();
        Scanner scanner = new Scanner(System.in);
        board.randomize_board();

        board.print_board();
    }
}
