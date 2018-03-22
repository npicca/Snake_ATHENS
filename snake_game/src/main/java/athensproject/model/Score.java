package athensproject.model;

import athensproject.GameSettings;
import athensproject.controller.GameOver;
import athensproject.controller.Restart;
import athensproject.view.MainWindow;

public class Score implements Restart{ //Singleton Score
	   private static Score scoreInstance;
	   
	   private int score;
	   private int hiscore;

	   //constructor is made private so that this class cannot be instantiated
	   
	   private Score(){
		   score = 0;
		   hiscore = 0;
	   }

	   public static Score getInstance(){
		   if(scoreInstance == null){
			   scoreInstance = new Score();
			   GameOver.addRestartable(scoreInstance);
		   }
	      return scoreInstance;
	   }
	   public int getScore(){
		   return this.score;
	   }
	   public void updateScore(){
	   	this.score++;
	   	if(score > hiscore){
	   		hiscore = score;
		}
	   }

	public void restart() {
	   	this.score = 0;
	   	this.showScore();
	}

	public void showScore(){
		  //call View Method to draw score in Window
		   MainWindow.getInstance().setTitle(GameSettings.WINDOW_TITLE+" - Score : " + score + " - HiScore : "+ hiscore);
		   System.out.println("Score : " + score);
	   }

}
