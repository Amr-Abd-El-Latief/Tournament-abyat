package com.abyat.tournament.business;

import com.abyat.tournament.controller.readers.BasketBallLineReader;
import com.abyat.tournament.controller.readers.HandBallLineReader;
import com.abyat.tournament.model.pojo.BasketBallPlayer;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test BasketBallPlayer  : player 3;nick3;15;Team A;C;10;5;0
		
		
    BasketBallLineReader ballLineReader = new BasketBallLineReader();
    String inputLine = "player 3;nick3;15;Team A;C;10;5;0";
    try{
    int playerScore = ballLineReader.readLine(inputLine);
    System.out.println(" player 3;nick3;15;Team A;C;10;5;0 : "+playerScore );

    }catch (Exception e) {
		// TODO: handle exception
    	System.out.print(e);
	}
    
    

	//testhand BallPlayer  : player 3;nick3;15;Team A;C;10;5;0
	
	
    HandBallLineReader handBallLineReader = new HandBallLineReader();
    try{
    String inputLine1= "player 4;nick4;16;Team B;G;1;10";
	int playerScore = handBallLineReader.readLine(inputLine1);
    System.out.println("player 4;nick4;16;Team B;G;1;10 : "+playerScore );

    }catch (Exception e) {
		// TODO: handle exception
    	System.out.print(e);
	}
    
    
    
	}

    
    
    
    
    
	}
	
	
