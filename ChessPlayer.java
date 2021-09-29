import java.util.Random;
public class ChessPlayer {
public static void main(String[] args) {
	
}
		
		private String name;
		private int yearsExperience;
		private int eloRating;
		//true means player A wins
		//false means player B wins	
	    final static boolean player1 = true;
	    final static boolean player2 = false;
	    // declare constant K
	    public final int K = 30;
	    //randomb
	    public static boolean result;
          
	    //construct a default Chess Player
	    public ChessPlayer(){

		}

	    // Add attributes
		public ChessPlayer (String name, int yearsExperience, int eloRating) {

		this.name = name;
		this.yearsExperience = yearsExperience;
		this.eloRating = eloRating;
		}

   		// Add getters and setters
		//get name
		public String getName(){
			return this.name;
		}
		//set name
		public void setName(String name){
			this.name = name;
		}
		//get years of experience
		public int getYearsExperience(){
			return this.yearsExperience;
		}

		//set years of experience
		public void setYearsExperience(int yearsExperience){
			this.yearsExperience = yearsExperience;
		}

		//get elorating
		public int getEloRating(){
			return this.eloRating;
		}

		//set elorating
		public void setEloRating(int eloRating){
			this.eloRating = eloRating;
		}

//OTHER METHODS//

		//prob method
		double prob(int erating1, int erating2) { 
        	return 1.0 * 1.0 / (1 + 1.0 * (Math.pow(10, 1.0 * (erating1 - erating2) / 400))); 
        }

        //play method 
		public boolean play() {
    		Random random = new Random();
    		result = random.nextBoolean();
    		return result;
		}

        //elo method
        //update elo Ratings
		public void elo(int rating1, int rating2) {  
       
      	//STEP 1:
      	// Probability of Player 1 winning - using prob method
        double player1Winning = prob(rating2, rating1); 
        	System.out.println("The probabiblity of Player 1 winning is " + player1Winning);

		// Probability of Player 2 winning - using prob method
         double player2Winning = prob(rating1, rating2); 
        	System.out.println("The probability of Player 2 winning is " + player2Winning);

    	//boolean - update elo rating		
    	if (player1 == true){
        	System.out.println("Player 1 wins");
        	rating1 = (int)(rating1 + K * (1 - player1Winning)); 
			rating2 = (int)(rating2 + K * (0 - player2Winning)); 
			System.out.println("The new Elo Rating for Player 1 is: " + rating1 + " and the new Elo Rating for Player 2 is: " + rating2);
    	}
        else { 
        	System.out.println("Player 2 wins");
        	rating1 = (int)(rating1 + K * (0 - player1Winning)); 
         	rating2 = (int)(rating2 + K * (1 - player2Winning)); 
        	System.out.println("The new Elo Rating for Player 1 is: " + rating1 + " and the new Elo Rating for Player 2 is: " + rating2);
   		}    
    }
}
 




        	    	