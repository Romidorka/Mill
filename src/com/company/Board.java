package com.company;

/*
 0(.) - Empty
 1(@)- White player(1)
 2(#)- Black player(2)
*/

public class Board {
    byte board[] = new byte[24];

    Board(){
        for(byte i=0;i<24;i++){
            board[i]=0;
        }
    }

    public void randomize_board(){
        for(int i=0;i<24;i++){
            board[i]=(byte) (Math.random()*3);
        }
    }

    private String[] get_board_with_chars(){
        String tmpBoard[] = new String[24];
        for(int i=0;i<24;i++){
            switch (board[i]) {
                case 0 -> tmpBoard[i] = ".";
                case 1 -> tmpBoard[i] = "@";
                case 2 -> tmpBoard[i] = "#";
            }
        }

        return tmpBoard;
    }

    public void print_board(){
        String strBoard[] = get_board_with_chars();

        System.out.printf("""
                        %s     %s     %s
                          %s   %s   %s
                            %s %S %S
                        %s %s %s   %s %s %s
                            %s %S %S
                          %s   %s   %s
                        %s     %s     %s%n""",  strBoard[0], strBoard[1], strBoard[2], strBoard[3], strBoard[4], strBoard[5],
                                strBoard[6], strBoard[7], strBoard[8], strBoard[9], strBoard[10], strBoard[11],
                                strBoard[12], strBoard[13], strBoard[14], strBoard[15], strBoard[16], strBoard[17],
                                strBoard[18], strBoard[19], strBoard[20], strBoard[21], strBoard[22], strBoard[23]);
    }
}
