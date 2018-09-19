package gameEngine;

import levelPieces.GamePiece;

public class Crosswalk extends GamePiece{
	private InteractionResult crosswalkInteraction;
	
	public Crosswalk(char symbol, int location) {
		super(symbol, location);
		crosswalkInteraction = InteractionResult.ADVANCE;
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * ADVANCE (interacts on same location)
	 * (non-Javadoc)
	 * @see levelPieces.GamePiece#interact(gameEngine.Drawable[], int)
	 */
	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		// TODO Auto-generated method stub
		return null;
	}

}
