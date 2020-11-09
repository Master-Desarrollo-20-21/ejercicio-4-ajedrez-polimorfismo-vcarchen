class Rook extends Piece{
    
    public char symbol='r';

    protected Rook(Color color,Coordinate coordinate) {
        super(color,coordinate);
    }

    @Override
    public char getSymbol() {
        return symbol;
    }
}
