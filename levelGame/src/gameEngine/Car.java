package gameEngine;
import java.lang.*;

public class Car extends RandomMotionPiece {
	private InteractionResult carInteraction;
	
	public Car(char symbol, int location) {
		super(symbol, location);
		carInteraction = InteractionResult.NONE;
		// TODO Auto-generated constructor stub
	}

	@Override
	/* car (will kill a player that comes within 3 squares,
	 *  unless there's another object in between (a piece on the same square 
	 *  as the player also "blocks" the car's shot).(non-Javadoc)
	 * @see levelPieces.GamePiece#interact(gameEngine.Drawable[], int)
	 */
	
	//hit if 3 spaces to the right
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		return carInteraction;
	}

}
