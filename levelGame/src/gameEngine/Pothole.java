package gameEngine;

import levelPieces.GamePiece;

public class Pothole extends GamePiece {
	private InteractionResult potHoleInteraction;
	
	public Pothole(char symbol, int location) {
		super(symbol, location);
		potHoleInteraction = InteractionResult.KILL;
		// TODO Auto-generated constructor stub
	}

	/*
	 *  (will kill a player that is on the same square or beside it)
	 * (non-Javadoc)
	 * @see levelPieces.GamePiece#interact(gameEngine.Drawable[], int)
	 */
	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		int potHoleLocation = getLocation();
		if (potHoleLocation == playerLocation) {
			pieces[potHoleLocation] = null;
			setLocation(-1);
			return potHoleInteraction;
		}
		
		return null;
	}
}
