package com.abyat.tournament.controller.readers;

import com.abyat.tournament.exceptions.BadFileFormatException;
import com.abyat.tournament.model.pojo.Player;

public abstract class LineReader {
    
    Player player;
	/**
	 * method to read line from the file and return the score of that player 
	 * computed from this line
	 * @param line the file line to be parsed
	 * @return the score of the player regarding that line
	 * @throws BadFileFormatException if the input Line is missing some data 
	 */
	public abstract int readLine(String line) throws BadFileFormatException;
	
}
