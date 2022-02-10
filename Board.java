/*
 0 - Empty
 1 - White player(1)
 2 - Black player(2)
*/


public class Board {
    byte board[] = new byte[24];

    Board(){
        for(byte i=0;i<24;i++){
            board[i]=0;
        }
    }
}
