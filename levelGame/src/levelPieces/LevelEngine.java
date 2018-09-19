package levelPieces;

import java.util.ArrayList;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.Moveable;
import gameEngine.Pothole;
import levelPieces.GamePiece;
import gameEngine.TrafficCone;
import gameEngine.Bike;
import gameEngine.Bus;
import gameEngine.Car;
import gameEngine.Cat;
import gameEngine.Crosswalk;

public class LevelEngine {
	
	private int currentLevel;
	private ArrayList<Moveable> movingPieces;
	private ArrayList<GamePiece> interactingPieces;
	private int playerLocation;
	private Drawable [] gameBoard;
	
	public LevelEngine() {
		gameBoard = new Drawable [GameEngine.BOARD_SIZE];
		interactingPieces = new ArrayList <GamePiece> ();
		 movingPieces = new ArrayList<Moveable>();
		
	}
	
	public LevelEngine(int currentLevel, ArrayList<Moveable> movingPieces, ArrayList<GamePiece> interactingPieces,
			int playerLocation, Drawable[] gameBoard) {
		super();
		this.currentLevel = currentLevel;
		this.movingPieces = movingPieces;
		this.interactingPieces = interactingPieces;
		this.playerLocation = playerLocation;
		this.gameBoard = gameBoard;
	}

	public void createLevel(int level) {
		setCurrentLevel(level);
		Drawable [] currentLevelBoard = getGameBoard();
		
		if (currentLevel == 1) {
			TrafficCone trafficCone1 = new TrafficCone();
			TrafficCone trafficCone2 = new TrafficCone();
			currentLevelBoard[2] = trafficCone1;
			currentLevelBoard[6] = trafficCone2;
			
			Bike bike1 = new Bike('b', 7);
			currentLevelBoard[7] = bike1;
			movingPieces.add(bike1);
			interactingPieces.add(bike1);
			
			Cat cat1 = new Cat('*', 4);
			currentLevelBoard[4] = cat1;
			interactingPieces.add(cat1);
			
			
			Car car1 = new Car('c', 10);
			currentLevelBoard[10] = car1;
			movingPieces.add(car1);
			interactingPieces.add(car1);
			
			Crosswalk crosswalk1 = new Crosswalk ('=', 20);
			currentLevelBoard[20] = crosswalk1;
			interactingPieces.add(crosswalk1);
			
			
			Bus bus1 = new Bus ('B', 15);
			currentLevelBoard[15] = bus1;
			movingPieces.add(bus1);
			interactingPieces.add(bus1);
			
			Pothole potHole1 = new Pothole ('O',14);
			currentLevelBoard[14] = potHole1;
			interactingPieces.add(potHole1);
			
		}
		setGameBoard(currentLevelBoard);
	}
	
	
	public Drawable[] getGameBoard() {
		return gameBoard;
	}

	public void setGameBoard(Drawable[] gameBoard) {
		this.gameBoard = gameBoard;
	}

	public int getPlayerLocation() {
		return playerLocation;
	}

	public void setPlayerLocation(int playerLocation) {
		this.playerLocation = playerLocation;
	}

	public int getCurrentLevel() {
		return currentLevel;
	}

	public void setCurrentLevel(int levelNum) {
		this.currentLevel = levelNum;
	}

	public void setInteractingPieces(ArrayList<GamePiece> interactingPieces) {
		this.interactingPieces = interactingPieces;
	}

	public void setMovingPieces(ArrayList<Moveable> movingPieces) {
		this.movingPieces = movingPieces;
	}

	public Drawable [] getBoard() {
		return gameBoard;
	}
	
	public ArrayList<GamePiece> getInteractingPieces(){
		return interactingPieces;
	}
	
	public ArrayList<Moveable>getMovingPieces() {
		return movingPieces;
	}
	
	public int getPlayerStartLoc() {
		return playerLocation;
	}

}
