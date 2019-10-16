package main;

public class DataObject {
	
	// Declare Map for state 
	private static int x = 100;
	
	// Function used in WHILE.g4 for IDENT
	public static int GetIdentValue(String id)
	{
		return x;	
	}
}
