/**
 * LevelGame Assignment
 * 
 * @author Madeline McKune
 * @author Edward Yi
 * 
 * 
 *
 */



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
		//setCurrentLevel(level);
		Drawable [] currentLevelBoard1 = new Drawable [GameEngine.BOARD_SIZE];
		Drawable [] currentLevelBoard2 = new Drawable [GameEngine.BOARD_SIZE];
		
		
		if (level == 1) {
			
			TrafficCone trafficCone1 = new TrafficCone();
			TrafficCone trafficCone2 = new TrafficCone();
			currentLevelBoard1[12] = trafficCone1;
			currentLevelBoard1[15] = trafficCone2;
			
			
			Bike bike1 = new Bike('b', 7);
			currentLevelBoard1[7] = bike1;
			movingPieces.add(bike1);
			interactingPieces.add(bike1);
			
			
			Cat cat1 = new Cat('*', 12);
			currentLevelBoard1[12] = cat1;
			interactingPieces.add(cat1);
			
			Car car1 = new Car('c', 10);
			currentLevelBoard1[10] = car1;
			movingPieces.add(car1);
			interactingPieces.add(car1);
			
			
			Crosswalk crosswalk1 = new Crosswalk ('=', 20);
			currentLevelBoard1[20] = crosswalk1;
			interactingPieces.add(crosswalk1);
			
			
			Bus bus1 = new Bus ('B', 15);
			currentLevelBoard1[15] = bus1;
			movingPieces.add(bus1);
			interactingPieces.add(bus1);
			
			Pothole potHole1 = new Pothole ('O',14);
			currentLevelBoard1[14] = potHole1;
			interactingPieces.add(potHole1);
			
			Cat cat2 = new Cat('*', 11);
			currentLevelBoard1[11] = cat2;
			interactingPieces.add(cat2);
			
			setGameBoard(currentLevelBoard1);
			
		}
		
		else if (level == 2) {
			System.out.println(level);
			movingPieces.clear();
			interactingPieces.clear(); 
			
			//currentLevelBoard = null;
			TrafficCone trafficCone1 = new TrafficCone();
			TrafficCone trafficCone2 = new TrafficCone();
			currentLevelBoard2[18] = trafficCone1;
			currentLevelBoard2[10] = trafficCone2;
			
			Pothole potHole1 = new Pothole('O',12);
			currentLevelBoard2[12]=potHole1;
			interactingPieces.add(potHole1);
			
			Pothole potHole2 = new Pothole('O',2);
			currentLevelBoard2[2]=potHole2;
			interactingPieces.add(potHole2);
	
			Cat cat1 = new Cat('*', 9);
			currentLevelBoard2[9] = cat1;
			interactingPieces.add(cat1);
			
			Cat cat2 = new Cat('*', 3);
			currentLevelBoard2[3] = cat2;
			interactingPieces.add(cat2);
			
			Cat cat3 = new Cat('*', 5);
			currentLevelBoard2[5] = cat3;
			interactingPieces.add(cat3);
			
			Bike bike1 = new Bike('b', 19);
			currentLevelBoard2[19] = bike1;
			movingPieces.add(bike1);
			interactingPieces.add(bike1);
			
			Bus bus1 = new Bus ('B', 11);
			currentLevelBoard2[11] = bus1;
			movingPieces.add(bus1);
			interactingPieces.add(bus1);
			setGameBoard(currentLevelBoard2);	
		}
		
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
