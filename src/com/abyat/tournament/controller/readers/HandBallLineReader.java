package com.abyat.tournament.controller.readers;

import com.abyat.tournament.exceptions.BadFileFormatException;
import com.abyat.tournament.model.pojo.BasketBallPlayer;
import com.abyat.tournament.model.pojo.HandBallPlayer;

public class HandBallLineReader extends LineReader {
	
	HandBallPlayer ballPlayer;
	

	/**
	 * constructor  with no initialization
	 * @param bBPlayer the injected BasketBallPlayer object 
	 */
	
	public  HandBallLineReader() {
		// TODO Auto-generated constructor stub
		ballPlayer = new HandBallPlayer();
	}
	
	
	
	/**
	 * method to read line from the file and return the score of that player 
	 * computed from this line
	 * @param line the file line to be parsed
	 * @return the score of the player regarding that line
	 * @throws BadFileFormatException if the input Line is missing some data 
	 */
	@Override
	public int readLine(String line) throws BadFileFormatException {
		// TODO Auto-generated method stub
		String[] lineParts = line.split(";");
		int playerScore = 0;
		if(lineParts.length !=7){
            throw new BadFileFormatException("Wrong Line Format : " + line);
		}else{
			try{
//player name;nickname;number;team name;position;goals made;goals received 
				ballPlayer.setPlayerName(lineParts[0]);
				ballPlayer.setNickName(lineParts[1]);
				ballPlayer.setPlayerNumber(Integer.parseInt(lineParts[2]));
				ballPlayer.setTeamName(lineParts[3]);
				ballPlayer.setPosition(lineParts[4]);
				ballPlayer.setGoalsMade(Integer.parseInt(lineParts[5]));
				ballPlayer.setGoalsReceived(Integer.parseInt(lineParts[6]));

				if(ballPlayer.getPosition().equals("G")){//Guard 
					playerScore = 50 + 5 *ballPlayer.getGoalsMade() +(-2 *ballPlayer.getGoalsReceived());
				}else if(ballPlayer.getPosition().equals("F")){ // Forward
					playerScore = 20 + 1 *ballPlayer.getGoalsMade() +(-1 *ballPlayer.getGoalsReceived());

				}
				
			return playerScore;	
			}catch (Exception e) {
				// TODO: handle exception
	            throw new BadFileFormatException("Wrong Line Format : " + line);

			}
			
		}
		
		
	}

}
