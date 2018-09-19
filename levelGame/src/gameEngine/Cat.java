package gameEngine;

import levelPieces.GamePiece;

public class Cat extends GamePiece {
	private InteractionResult catInteraction;
	
	public Cat(char symbol, int location) {
		super(symbol, location);
		catInteraction = InteractionResult.GET_POINT;
		// TODO Auto-generated constructor stub
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		// TODO Auto-generated method stub
		int catLocation = getLocation();
		if (catLocation == playerLocation) {
			pieces[catLocation] = null;
			setLocation(-1);
			return catInteraction;
		}
		
		return null;
	}

}
