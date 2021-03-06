package gameEngine;

import gameEngine.InteractionResult;
import levelPieces.GamePiece;

public class Bike extends GamePiece implements Moveable{

	private InteractionResult bikeInteraction;
	private boolean moveRight; 
	
	public Bike(char symbol, int location) {
		super(symbol, location);
		bikeInteraction = InteractionResult.HIT;
		moveRight = true;
		// TODO Auto-generated constructor stub
	}

	/*bike. Moves right (jumping over other pieces) until it reaches the rightmost space.
	*Then moves left (jumping over other pieces) until it reaches the leftmost space. 
	*Continues in this pattern indefinitely.
	*/
	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		//System.out.println(getLocation());
		int bikeLocation = getLocation();
		//System.out.println(bikeLocation);
		gameBoard[bikeLocation] = null;
		int plusRight = 1;
		//check if can move right
		if (isMoveRight()) {
			//is it less than the board width?
			if(bikeLocation +plusRight <GameEngine.BOARD_SIZE-2) {
				if (bikeLocation < (GameEngine.BOARD_SIZE-2)){
					//is there anything next to it? if so, move one more right
					while (gameBoard[bikeLocation+plusRight] != null) {
						if (bikeLocation < (GameEngine.BOARD_SIZE-2)) {
							plusRight +=1;
						}
						else {
							setMoveRight(false);
							break;
						}
					}
				}
			}
			//then move left
			else {
				setMoveRight(false);
			}
		}
		//if it can move left 
		if (!isMoveRight()) {
			if (bikeLocation > 0) {
				plusRight = -1;
				while (gameBoard[bikeLocation+plusRight] != null) {
					plusRight -=1;		
				}
			}
			//then move left
			else {
				setMoveRight(true);
			}
		}
		setLocation(bikeLocation+plusRight);
		gameBoard[bikeLocation+plusRight] = this;
	}
		
	
	public boolean isMoveRight() {
		return moveRight;
	}


	public void setMoveRight(boolean moveRight) {
		this.moveRight = moveRight;
	}


	@Override
	/**
	 * Bike Interaction: Bike HITS player if the player is within 3 spaces to the RIGHT of the bike
	 * AND there is no object in between bike and player
	 * 
	 */
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		int bikeLocation = this.getLocation();
		//System.out.println("BIKE LOCATION " + bikeLocation + "P LOCATION " + playerLocation);
		/**
		 * The boolean "passed" repr 
		 */
		boolean passed = false;
		if (playerLocation > bikeLocation && playerLocation - (bikeLocation +3)  <=0) {
			//System.out.println("here");
			passed = true;
			for (int i =bikeLocation+1; i < playerLocation; i++) {
				if (pieces [i] != null) {
					passed = false;
				}
			}
		}
		if (passed) {
			System.out.println("BIKE HIT");
			return bikeInteraction;
		}	
		return null;

	}
	
	

}
