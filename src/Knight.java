class Knight extends Piece {

    public char symbol='K';

    protected Knight(Color color,Coordinate coordinate) {
        super(color,coordinate);
    }

    @Override
    public char getSymbol() {
        return symbol;
    }
}
