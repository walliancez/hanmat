package core;

public class Interp {	
	public final static int VAR_ASSIGN = 1;
	public final static int ADD_OP = 2;
	public final static int SUB_OP = 3;
	public final static int EXIT_OP = 0;
	public final static int UNKNOWN_OP = -1;

	
	public static int IdentifyOperation(String input){
		// Check if input is a variable assignment. Assumes that variable
		// assignment starts with "let". Also makes the same test for some
		// other operations. I will probably rewrite this in the future.
		
		String[] currentLine = input.split(" ");
		
		switch(currentLine[0]){
		case "let":
			return VAR_ASSIGN;
		case "add":
			return ADD_OP;
		case "sub":
			return SUB_OP;
		case "exit":
			return EXIT_OP;
		}
		
		return UNKNOWN_OP;
	}
}
