package com.abyat.tournament.controller.readers;

import com.abyat.tournament.exceptions.BadFileFormatException;
import com.abyat.tournament.model.pojo.BasketBallPlayer;
import com.abyat.tournament.model.pojo.Player;

public class BasketBallLineReader extends LineReader {
   

	
	BasketBallPlayer basketBallPlayer;
	

	/**
	 * constructor must have a BasketBallPlayer Class object to oberate on 
	 * @param bBPlayer the injected BasketBallPlayer object 
	 */
	
	BasketBallLineReader(BasketBallPlayer bBPlayer) {
		basketBallPlayer = bBPlayer;
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * constructor  with no initialization
	 * @param bBPlayer the injected BasketBallPlayer object 
	 */
	
	public BasketBallLineReader( ) {
		// TODO Auto-generated constructor stub

		basketBallPlayer = new BasketBallPlayer();
		
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
		if(lineParts.length !=8){
            throw new BadFileFormatException("Wrong Line Format : " + line);
		}else{
			try{

				basketBallPlayer.setPlayerName(lineParts[0]);
				basketBallPlayer.setNickName(lineParts[1]);
				basketBallPlayer.setPlayerNumber(Integer.parseInt(lineParts[2]));
				basketBallPlayer.setTeamName(lineParts[3]);
				basketBallPlayer.setPosition(lineParts[4]);
				basketBallPlayer.setScoredPoints(Integer.parseInt(lineParts[5]));
				basketBallPlayer.setRebounds(Integer.parseInt(lineParts[6]));
				basketBallPlayer.setAssists(Integer.parseInt(lineParts[7]));

				if(basketBallPlayer.getPosition().equals("G")){//Guard 
					playerScore = 2*basketBallPlayer.getScoredPoints() + 3*basketBallPlayer.getRebounds()+2*basketBallPlayer.getAssists();
				}else if(basketBallPlayer.getPosition().equals("F")){ // Forward
					playerScore =  2*basketBallPlayer.getScoredPoints() + 2*basketBallPlayer.getRebounds()+2*basketBallPlayer.getAssists();

				}else if(basketBallPlayer.getPosition().equals("C")){ //Center
					playerScore =  2*basketBallPlayer.getScoredPoints() + 1*basketBallPlayer.getRebounds()+3*basketBallPlayer.getAssists();

				}
				
			return playerScore;	
			}catch (Exception e) {
				// TODO: handle exception
	            throw new BadFileFormatException("Wrong Line Format : " + line);

			}
			
		}
		
		
	}

	public BasketBallPlayer getBasketBallPlayer() {
		return basketBallPlayer;
	}

	public void setBasketBallPlayer(BasketBallPlayer basketBallPlayer) {
		this.basketBallPlayer = basketBallPlayer;
	}
	
}
