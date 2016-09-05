package core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HanMat {
	Scanner scanner;
	String currentInstruction;
	String errMsg;
	Map<String,Variable> currentVariableList;
	
	//To be used for remembering and performing instructions again
	List<String> previousOperations;
	
	public static void main(String[] args) {
		new HanMat().run();
	}
	
	public void init(){
		currentVariableList = new HashMap<String,Variable>();
	}
	
	public void run(){
		scanner = new Scanner(System.in);
		init();
		
		System.out.println("Welcome to HanMat! (TM)");
		while(true){
			System.out.print("> ");
			currentInstruction = scanner.nextLine();
			errMsg = executeOperation(currentInstruction);
		}
	}
	
	public String executeOperation(String operation){
		//Ugly long method for assigning the correct operation
	}
	
	public boolean addScalarVariable(String name, double number){
		if(currentVariableList.containsKey(name)){
			return false;
		}
		currentVariableList.put(name, new Scalar(number));
		return true;
	}

}
