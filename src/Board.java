class Board {

	static final int DIMENSION = 8;
	static final int NUMPIECESPERPLAYER=16;
	
	private Piece pieces[][];
	
	public Board(){
		this.pieces=new Piece[Chess.NUM_PLAYERS][NUMPIECESPERPLAYER];
		for (int nPlayer=0;nPlayer<Chess.NUM_PLAYERS;nPlayer++){
			createInitialPiecesPlayers(nPlayer);	
		}
		
	}

	private void createInitialPiecesPlayers(int nPlayer){ 
		int row;
		Color color;
		if (nPlayer==0){
			row=0;
			color=Color.WHITE;
		}
		else{
			row=DIMENSION-1;
			color=Color.BLACK;
		}

		this.pieces[nPlayer][0]=new Rook(color,new Coordinate(row,0));
		this.pieces[nPlayer][1]=new Knight(color,new Coordinate(row,1));
		this.pieces[nPlayer][2]=new Bishop(color,new Coordinate(row,2));
		this.pieces[nPlayer][3]=new Queen(color,new Coordinate(row,3));
		this.pieces[nPlayer][4]=new King(color,new Coordinate(row,4));
		this.pieces[nPlayer][5]=new Bishop(color,new Coordinate(row,5));
		this.pieces[nPlayer][6]=new Knight(color,new Coordinate(row,6));
		this.pieces[nPlayer][7]=new Rook(color,new Coordinate(row,7));
	}
	
	public void show() {
		Console console=new Console();
		for (int row = 0; row <= DIMENSION-1; row++) {
            for (int col = 0; col <= DIMENSION-1; col++) {
				console.out(Piece.getInCoordinate(pieces,new Coordinate(row,col))); 
			}
			console.out("\n");
		}
	}

	public boolean jakeMate() {
		return false;
	}
}
