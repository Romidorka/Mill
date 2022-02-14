package com.company;

/*
 0(.) - Empty
 1(@)- White player(1)
 2(#)- Black player(2)

 PHASE
 0 - placing
 1 - moving
 */


public class Board9 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static int PHASE_PLACING = 0;
    public static int PHASE_MOVING = 1;

    int board[] = new int[24];
    int phase = PHASE_PLACING;
    int turnsCount = 0;

    Board9(){
        for(byte i=0;i<24;i++){
            board[i]=0;
        }
    }

    public boolean place(String cords, int player){
        int index = cordsToIndex(cords);
        if(board[index]==0){
            board[index] = (byte)player;
            return true;
        }else{
            return false;
        }
    }

    public boolean move(int player, String cords1, String cords2){
        int index1 = cordsToIndex(cords1);
        int index2 = cordsToIndex(cords2);
        if(board[index1]==player && board[index2]==0){
            board[index1]=0;
            board[index2]=player;
            return true;
        }else{
            return false;
        }
    }

    public String indexToCords(int index){
        String cordsArray[]={
                "a7", "7d", "7g",
                "6b", "6d", "6f",
                "5c", "5d", "5e",
                "4a", "4b", "4c",
                "4e", "4f", "4g",
                "3c", "3d", "3e",
                "2b", "2d", "2f",
                "1a", "1d", "1g"
        };
        return cordsArray[index];
    }

    public int cordsToIndex(String cords){
        String cordsArray[]={
                "a7", "7d", "7g",
                "6b", "6d", "6f",
                "5c", "5d", "5e",
                "4a", "4b", "4c",
                "4e", "4f", "4g",
                "3c", "3d", "3e",
                "2b", "2d", "2f",
                "1a", "1d", "1g"
        };
        for(int i=0;i<24;i++){
            if(cordsArray[i].equals(cords)){
                return i;
            }
        }
        return -1;
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
                case 0 -> tmpBoard[i] = "●";
                case 1 -> tmpBoard[i] = ANSI_GREEN + "⊙" + ANSI_RESET;
                case 2 -> tmpBoard[i] = ANSI_RED + "⊙" + ANSI_RESET;
            }
        }
        return tmpBoard;
    }

    public void print_board(){
        String strBoard[] = get_board_with_chars();

        System.out.printf("""
                        %s⎻⎻⎻⎻⎻%s⎻⎻⎻⎻⎻%s
                        | %s⎻⎻⎻%s⎻⎻⎻%s |
                        | | %s⎻%s⎻%s | |
                        %s⎻%s⎻%s   %s⎻%s⎻%s
                        | | %s⎻%s⎻%s | |
                        | %s⎻⎻⎻%s⎻⎻⎻%s |
                        %s⎻⎻⎻⎻⎻%s⎻⎻⎻⎻⎻%s%n""",  strBoard[0], strBoard[1], strBoard[2], strBoard[3], strBoard[4], strBoard[5],
                                strBoard[6], strBoard[7], strBoard[8], strBoard[9], strBoard[10], strBoard[11],
                                strBoard[12], strBoard[13], strBoard[14], strBoard[15], strBoard[16], strBoard[17],
                                strBoard[18], strBoard[19], strBoard[20], strBoard[21], strBoard[22], strBoard[23]);
    }
}
