import java.util.Random;

class Turn {

    private int value;

    public Turn() {
        value = new Random().nextInt(2);
    }

    public int turnToPlay() {
        return value;
    }

    public int noTurnToPlay() {
        return (value + 1) % 2;
    }

    public void change() {
        value = this.noTurnToPlay();
    }

    public static void main(String[] args) {
        Console gestorIO = new Console();
        Turn turn;
        for (int i = 0; i < 10; i++) {
            turn = new Turn();
            gestorIO.out("Toca: " + turn.turnToPlay() + "\n");
            gestorIO.out("No toca: " + turn.noTurnToPlay() + "\n");
            turn.change();
            gestorIO.out("Cambiado\n");
            gestorIO.out("Toca: " + turn.turnToPlay() + "\n");
            gestorIO.out("No toca: " + turn.noTurnToPlay() + "\n");
            gestorIO.out("\n");
        }
    }

}
