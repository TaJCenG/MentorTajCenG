package OOPSConcepts;

//different types of overriding.
//1. Base class provides no implementation and sub-class has to override complete method - (abstract)
//2. Base class provides default implementation and sub-class can change the behaviour
//3. Sub-class adds extension to base class implementation by calling super.methodName() as first statement
//4. Base class defines structure of the algorithm (Template method) and sub-class will override a part ofalgorithm


abstract class Game implements Runnable{
	 protected boolean runGame = true;
	 protected Player player1 = null;
	 protected Player player2 = null;
	 protected Player currentPlayer = null;
	 
	 public Game(){
	 player1 = new Player("Player 1");
	 player2 = new Player("Player 2");
	 currentPlayer = player1;
	 initializeGame();
	 }
	 
	 protected abstract void initializeGame();
	 
	 /* Type 2: Sub-class can change the behaviour. If not, base class behaviour is applicable */
	 protected void logTimeBetweenMoves(Player player){
	 System.out.println("Base class: Move Duration: player.PlayerActTime -player.MoveShownTime");
	 }

	 /* Type 3: Base class provides implementation. Sub-class can enhance base class implementation by
	 calling
	  super.methodName() in first line of the child class method and specific implementation later
	 */
	  protected void logGameStatistics(){
	  System.out.println("Base class: logGameStatistics:");
	  }

	  /* Type 4: Template method: Structure of base class can't be changed but sub-class can some part
	  of behaviour */
	   protected void runGame() throws Exception{
	   System.out.println("Base class: Defining the flow for Game:"); 
	   while (runGame) {
	   /*
	   1. Set current player
	   2. Get Player Move
	   */
	   validatePlayerMove(currentPlayer); 
	   logTimeBetweenMoves(currentPlayer);
	   Thread.sleep(500);
	   setNextPlayer();
	   }
	   logGameStatistics();
	   }

	   /* sub-part of the template method, which define child class behaviour */
	   protected abstract void validatePlayerMove(Player p);
	   
	   protected void setRunGame(boolean status){
	   this.runGame = status;
	   }
	   public void setCurrentPlayer(Player p){
	   this.currentPlayer = p;
	   }
	   public void setNextPlayer(){
		   if (currentPlayer == player1) {
		   currentPlayer = player2;
		   }else{
		   currentPlayer = player1;
		   }
		   }
		   public void run(){
		   try{
		   runGame();
		   }catch(Exception err){
		   err.printStackTrace();
		   }
		   }
		  }

class Player{
	 String name;
	 Player(String name){
	 this.name = name;
	 }
	 public String getName(){
	 return name;
	 }
	}
	/* Concrete Game implementation */
	class Chess extends Game{
	 public Chess(){
	 super();
	 }
	 public void initializeGame(){
	 System.out.println("Child class: Initialized Chess game");
	 }
	 protected void validatePlayerMove(Player p){
	 System.out.println("Child class: Validate Chess move:" + p.getName());
	 }
	 protected void logGameStatistics(){
	 super.logGameStatistics();
	 System.out.println("Child class: Add Chess specific logGameStatistics:");
	 }
	}
	class TicTacToe extends Game{
	 public TicTacToe(){
	 super();
	 }
	 public void initializeGame(){
	 System.out.println("Child class: Initialized TicTacToe game");
	 }
	 protected void validatePlayerMove(Player p){
	 System.out.println("Child class: Validate TicTacToe move:" + p.getName());
	 }
	}

public class About5PolymorphismDifferenttypesoverriding {

	public static void main(String[] args) {
		try{
			 
			 Game game = new Chess();
			 Thread t1 = new Thread(game);
			 t1.start();
			 Thread.sleep(1000);
			 game.setRunGame(false);
			 Thread.sleep(1000);
			 
			 game = new TicTacToe();
			 Thread t2 = new Thread(game);
			 t2.start();
			 Thread.sleep(1000);
			 game.setRunGame(false);
			 
			 }catch(Exception err){
			 err.printStackTrace();
			 } 
			 }
			

	}


