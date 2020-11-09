abstract class Piece {

    protected Color color;

    protected Coordinate coordinate;

    protected Piece(Color color,Coordinate coordinate) {
        this.color=color;
        this.coordinate=coordinate;
    }

	protected abstract char getSymbol();

    public char symbol(){
        char symbolaux=getSymbol();
        if (color==Color.BLACK){
            return Character.toUpperCase(symbolaux);
        }
        else{
            return symbolaux;
        }
    }

	public static char getInCoordinate(Piece[][] pieces, Coordinate coordinate) {
        
        for (int i = 0; i <= Chess.NUM_PLAYERS -1; i++) {
            for (int j = 0; j <= Board.NUMPIECESPERPLAYER-1; j++) {
                if (pieces[i][j]!=null && pieces[i][j].coordinate.equal(coordinate)){
                    return pieces[i][j].symbol();
                }
            }
        }
        return '-';
    }  
}
