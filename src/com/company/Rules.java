package com.company;

public class Rules {
    public int men_count;
    public int men_need_to_fly;
    public boolean allow_flying;
    public boolean can_move_while_placing;

    private Board9 board;

    Rules(Board9 board,int men_count, int men_need_to_fly, boolean allow_flying, boolean can_move_while_placing){
        this.board = board;
        this.men_count = men_count;
        this.men_need_to_fly = men_need_to_fly;
        this.allow_flying = allow_flying;
        this.can_move_while_placing = can_move_while_placing;
    }

    public boolean is_win(int player){
        for(int i=0;i<2;i++){
            if(men_count - board.died_dots[i] < 3 && i+1 == player){
                return true;
            }
        }
        return false;
    }

}
