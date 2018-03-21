package athensproject.model;

import athensproject.GameSettings;
import athensproject.view.MainWindow;

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
	   public int getScore(){
		   return this.score;
	   }
	   public void updateScore(){
		   this.score++;
	   }
	
	   
	   public void showScore(){
		  //call View Method to draw score in Window
		   MainWindow.getInstance().setTitle(GameSettings.WINDOW_TITLE+" - Score : " + score);
		   System.out.println("Score : " + score);
	   }

}
