package com.company;

public class Game {
    Board9 board;
    Rules rules;

    private int whose_turn;

    Game(Board9 board, Rules rules){
        board=board;
        rules=rules;
    }

    void makeTurn(String cords){

    }

    boolean needSecondCords(String cords){
        return !rules.canPlace(whose_turn, cords);
    }

    boolean canTurn(String cords){
        if(rules.canPlace(whose_turn, cords)){
            return true;
        }else{
            return false;
        }
    }

    boolean canTurn(String cords1, String cords2){
        if(rules.canMove(whose_turn, cords1, cords2)){
            return true;
        }else if(rules.canFly(whose_turn, cords1, cords2)){
            return true;
        }else if(rules.canKill(whose_turn, cords1, cords2)){
            return true;
        }else{
            return false;
        }
    }
}
