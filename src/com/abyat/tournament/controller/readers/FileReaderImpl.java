package com.abyat.tournament.controller.readers;

import java.util.Hashtable;

import com.abyat.tournament.exceptions.BadFileFormatException;

public class FileReaderImpl extends FileReader {
	LineReader lineReader;
	Hashtable<String, Integer> players = new Hashtable<String, Integer>();
	FileReaderImpl(LineReader lReader){
		lineReader= lReader;
	}
	@Override
	public Hashtable<String, Integer> readFile(String file) throws BadFileFormatException {
		
		// TODO Auto-generated method stub
		
		String[] fileLines = file.split("\n");
		if(fileLines[0]=="BASKETBALL"){//basket ball algorithm 
			for (int i=1;i<fileLines.length;i++){
				//players.put(key, value)
			}
			
			
		}else if(fileLines[0]=="HANDBALL"){
			
		}else{
			throw new BadFileFormatException("Bad File Formate : "+ file);
		}
		return null;
	}
	
	
  
}
