class Bishop extends Piece{

    public char symbol='b';

    protected Bishop(Color color,Coordinate coordinate) {
        super(color,coordinate);
    }

    @Override
    public char getSymbol() {
        return symbol;
    }
}
