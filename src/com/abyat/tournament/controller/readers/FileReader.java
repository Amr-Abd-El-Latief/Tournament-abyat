package com.abyat.tournament.controller.readers;

import java.util.Hashtable;

import com.abyat.tournament.exceptions.BadFileFormatException;

public abstract class FileReader {
	LineReader lineReader;
    public abstract  Hashtable<String,Integer>  readFile(String file) throws BadFileFormatException;
}
