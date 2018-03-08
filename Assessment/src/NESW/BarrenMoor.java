package NESW;

import java.util.Random;
import java.util.Scanner;

public class BarrenMoor {
	
	Member[][] theMoor = new Member[7][7];
	
	//theMoor[i][currentPoint]
	
	public BarrenMoor(Member player, Member treasure) {
		
		
		theMoor[3][3] = player;
		
		placeTreasure(treasure);
		
		//player.currentPoint[0] = player.startPoint[0] +1;
		
		System.out.println("game start message");
		 
		
		
	     Scanner sc = new Scanner(System.in);
	     System.out.print("> ");
	     String direction = sc.nextLine();
	     
		     switch (direction){
		     case "North":
		    	 
		    	 break;
		     case "East":
		    	 
		    	 break;
		     case "South":
		    	 
		    	 break;
		     case "West":
		    	 
		    	 break;
		     default:
		    	 System.out.println("Please enter North, East, South or West: ");
		    	 System.out.print("> ");
			     direction = sc.nextLine();
		    	 break;
		     }
	    	 
		
	}
	
	public String look() {
		String string = " ";
		return string;
	}
	
	public int[] placeTreasure(Member treasure) {
		
		Random rnd = new Random();
		
		int xAxis;
		int yAxis;
		
		do {
		xAxis = rnd.nextInt(7) + 1;
		yAxis = rnd.nextInt(7) + 1;
		} while (xAxis == 3 || yAxis == 3);
		
		theMoor[xAxis][yAxis] = treasure;
		
		treasure.currentPoint[0] = xAxis;
		treasure.currentPoint[1] = yAxis;
		
		int position[] = {xAxis, yAxis};
		
				return position;		
		//System.out.println(xAxis +" "+ yAxis);
	}
	
	public int north() {
		int moveUp = 0; // array[][-1] 
		
		return moveUp;
	}
	
	public int east() {
		int moveRight = 0; // array[+1][] 
		
		return moveRight;
	}
	
	public int south() {
		int moveDown = 0; // array[][+1] 
		
		return moveDown;
	}
	
	public int west() {
		int moveLeft = 0; // array[-1][] 
		
		return moveLeft;
	}
	
	public String compass() {
		String distanceFromEnd = " ";
		
		return distanceFromEnd; 
	}
	
	public String help() {
		String listOfCommands = " ";
		
		return listOfCommands;
	}

}
