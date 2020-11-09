import java.awt.Color;

class Chess {

    private Board board;
    private Player[] players;
    private Turn turn;
    
    public static final int NUM_PLAYERS = 2;
    
    public Chess(){
        board = new Board();
        players = new Player[2];
        players[0] = new Player(Color.WHITE);
        players[1] = new Player(Color.BLACK);
        turn = new Turn();
    }
    
    public void play(){
        board.show();
        do {
            players[turn.turnToPlay()].movePiece(board);
            turn.change();
        } while (!board.jakeMate());
        players[turn.noTurnToPlay()].isWin();
    }
    
    public static void main(String[] args){
        new Chess().play();
    }
}
