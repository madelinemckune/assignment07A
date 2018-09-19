package gameEngine;

import levelPieces.GamePiece;
import java.util.Random;

public abstract class RandomMotionPiece extends GamePiece implements Moveable {

	public RandomMotionPiece(char symbol, int location) {
		super(symbol, location);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		int randomPosition = -1;
		do {
			Random rand = new Random();
			randomPosition = rand.nextInt(GameEngine.BOARD_SIZE);
		} while (gameBoard[randomPosition] != null); 
		
		gameBoard[getLocation()] = null;
		setLocation(randomPosition);
		gameBoard[randomPosition] = this;
	}
	
}
