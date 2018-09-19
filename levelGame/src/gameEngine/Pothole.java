package gameEngine;

import levelPieces.GamePiece;

public class Pothole extends GamePiece {
	private InteractionResult potHoleInteraction;
	
	public Pothole(char symbol, int location) {
		super(symbol, location);
		potHoleInteraction = InteractionResult.HIT;
		// TODO Auto-generated constructor stub
	}

	/*
	 *  (will kill a player that is on the same square or beside it)
	 * (non-Javadoc)
	 * @see levelPieces.GamePiece#interact(gameEngine.Drawable[], int)
	 */
	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		// TODO Auto-generated method stub
		return null;
	}

}
