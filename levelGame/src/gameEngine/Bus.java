package gameEngine;

import java.util.Random;

import levelPieces.GamePiece;

public class Bus extends GamePiece implements Moveable{
	private InteractionResult busInteraction; 
	private boolean right = true;
	private int backAndForth = 0;
	
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
		int busPosition = getLocation();
		do {
			busPosition = (busPosition+1) % (gameBoard.length);
			//System.out.println(busPosition);
		} while (gameBoard[busPosition] != null); 
		
		gameBoard[getLocation()] = null;
		setLocation(busPosition);
		gameBoard[busPosition] = this;
	}
	
	
	
	

}
