package generated;
import java.util.Stack;

public class Mylistener extends WHILEBaseListener {
	
	// Stack to Print Final Result
	private Stack<Integer> stack = new Stack<Integer>();
	
	// Override Addition Exit Case 
	@Override public void exitAddition(WHILEParser.AdditionContext ctx) 
	{ 
		// Print and push result
		System.out.println("Add : " + ctx.sv );
		this.stack.push(ctx.sv);
	}

	// Override Multiplication Exit Case
	@Override public void exitMultiplication(WHILEParser.MultiplicationContext ctx) 
	{
		// Print and push result
		System.out.println("Mul : " + ctx.sv );
		this.stack.push(ctx.sv);
	}

	// Override Subtraction Exit Case
	@Override public void exitSubtraction(WHILEParser.SubtractionContext ctx) 
	{
		// Print and push result
		System.out.println("Sub : " + ctx.sv );
		this.stack.push(ctx.sv);
	}

	// Override Program Exit Case 
	@Override public void exitProgram(WHILEParser.ProgramContext ctx) 
	{
		// When program is exited, print final result from ctx and stack 
		System.out.println("Result : " + ctx.getText() + " = " + this.stack.pop() );
		
	}
	
}
