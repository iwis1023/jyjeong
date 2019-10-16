package main;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import generated.*;

public class Interpreter {
	
	public static void main(String[] args) throws Exception {
		
		// Get Char Streaming 
		CharStream codeCharStream = CharStreams.fromFileName("test.wh");
		
		// Lexer 
		WHILELexer lexer = new WHILELexer( codeCharStream);
		
		// Token 
		CommonTokenStream tokens = new CommonTokenStream( lexer );
		
		// Parser
		WHILEParser parser		= new WHILEParser( tokens );
		
		// Tree
		ParseTree 	tree 		= parser.program();

		// Create Listener Object
		Mylistener linstener = new Mylistener();
		
		// Parser Tree Walk
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(linstener, tree);
		
	  }
}
