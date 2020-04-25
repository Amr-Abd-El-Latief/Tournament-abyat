package com.abyat.tournament.exceptions;

public class BadFileFormatException extends Exception {
  public BadFileFormatException(String message){
	  super(message);
	  System.out.println("Bad File Format: Please, Review The input file format");
	  
  }
	
	
}
