
class King extends Piece {
    public char symbol='z';

    protected King(Color color,Coordinate coordinate) {
        super(color,coordinate);
    }

    @Override
    public char getSymbol() {
        return symbol;
    }

}
