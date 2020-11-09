class Coordinate {

    enum File
    {
        a('a'),b('b'),c('c'),d('d'),f('f'),g('g'),h('h');
    
        private char keyword;

        private File(char keyword) {
            this.keyword = keyword;
        }
        public static File valueOf(char character) {
            for (File file : values()) {
                if (file.keyword == character) {
                    return file;
                }
            }
            return null;
        }
        public char getKeyword() {
            return this.keyword;
        }
    }

    protected int row;

    protected int column;

    private static final Intervalo LIMITS = new Intervalo(1, 8);

    public Coordinate() {
    }

    public Coordinate(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public boolean equal(Coordinate coordinate) {
        assert coordinate != null;
        return row == coordinate.row && column == coordinate.column;
    }

    public void collect(String limites) {
        Console console = new Console();
        boolean error = false;
        do {
            console.out("Introduce rank " + limites + ": ");
            row = console.inInt();
            console.out("Introduce file " + limites + ": ");
            char introduceFile;
            introduceFile=console.inChar();
            column=File.valueOf(introduceFile).ordinal()+1;
            error = !this.validate();
            if (error) {
                console.out("Error!!! Values out of range\n");
            } 
        } while (error);
    }

    private boolean validate() {
        return LIMITS.incluye(row) && LIMITS.incluye(column);
    }

    public static void main(String[] args) {
        Console console = new Console();
        for (int i = 0; i < 3; i++) {
            console.out("Primera coordinate\n");
            Coordinate coordinate1 = new Coordinate();
            coordinate1.collect("");
            console.out("Column: " + coordinate1.column + "\n");
            console.out("Segunda coordinate\n");
            Coordinate coordinate2 = new Coordinate();
            coordinate2.collect("");
            console.out("Iguales: " + coordinate1.equal(coordinate2) + "\n\n");
        }
    }
}
