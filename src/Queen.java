

public class Queen extends Piece{

    public char symbol='q';

    protected Queen(Color color,Coordinate coordinate) {
        super(color,coordinate);
    }

    @Override
    public char getSymbol() {
        return symbol;
    }

}
