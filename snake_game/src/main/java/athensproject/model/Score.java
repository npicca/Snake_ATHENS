package athensproject.model;

public class Score { //Singleton Score
	   private static Score scoreInstance;
	   
	   int score;
	   //constructor is made private so that this class cannot be instantiated
	   
	   private Score(){
		   score = 0;		   
	   }

	   public static Score getInstance(){
		   if(scoreInstance == null){
			   scoreInstance = new Score();
		   }
	      return scoreInstance;
	   }
	   
	   public void updateScore(){
		   Score.scoreInstance.score++;
	   }
	   public void showScore(){
		  //call View Method to draw score in Window
	      System.out.println("Score : " + score);
	   }

}
