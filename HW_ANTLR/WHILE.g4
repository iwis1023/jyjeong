grammar WHILE;


// Import Packet 
@header { 
package generated;
import static main.DataObject.GetIdentValue;
}

program	: aexpr;

aexpr returns [int sv]
    // Define rules and actions for Number
	: N=Number {
		String n = $N.getText(); 
		$sv = Integer.parseInt(n);
	} #Num
	
	// Define rules and actions for IDENT
	| IDENT {
		String id = $IDENT.getText();
		$sv = (GetIdentValue(id));
	} #Ident
	
	// Define rules and actions for Multiplication
	| a1=aexpr '*' a2=aexpr	
	{
		$sv = ($a1.sv * $a2.sv);
	} #Multiplication
	
	// Define rules and actions for Addition
	| a1=aexpr '+' a2=aexpr
	{
		$sv = ($a1.sv + $a2.sv);
	} #Addition

	// Define rules and actions for Subtraction
	| a1=aexpr '-' a2=aexpr	
	{
		$sv = ($a1.sv - $a2.sv);
	} #Subtraction
	;
	

Number : ('0'..'9')
	;
	
IDENT : [x]	
	;

