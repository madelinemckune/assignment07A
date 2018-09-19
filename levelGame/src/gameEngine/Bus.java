package gameEngine;

import levelPieces.GamePiece;

public class Bus extends GamePiece implements Moveable{
	private InteractionResult busInteraction;
	private boolean moveRight;
	
	public Bus(char symbol, int location) {
		super(symbol, location);
		busInteraction = InteractionResult.KILL;
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		// TODO Auto-generated method stub
		int busLocation = getLocation();
		if (busLocation+1 == playerLocation) {
			return busInteraction;
		}
		return null;
	}

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		int busLocation = getLocation();
		if (moveRight) {
			busLocation +=1;
		}
		else {
			busLocation -=1;
		}
		setLocation(busLocation);
		
		
	}
	
	

}
