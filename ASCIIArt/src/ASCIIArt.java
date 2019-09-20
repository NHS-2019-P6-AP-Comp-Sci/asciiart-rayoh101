/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void main (String [] args) {
		System.out.println("This is my ASCII ART which says \"Hi\"");
		Htop();
		Hbottom();
		Itop();
		Imiddle(); 
		Imiddle(); 
		Imiddle(); 
		Imiddle(); 
		Imiddle(); 
		Ibottom();
		
	}
	
	public static void Htop() {
		System.out.println("\t| \\==\\\t\t|\\==\\");
		System.out.println("\t|   \\__\\\t| \\ __\\");
		System.out.println("\t|   |\t |\t|  |    | ");
		System.out.println("\t|   |\t |______ \\ |    |");
		System.out.println("\t|   |\t |_______ \\|\t|");
		System.out.println("\t|   |\t  ________\t|");
	}
		
	public static void Hbottom() {
		Hpart();
		Hpart();
		Hpart();
		System.out.println("         \\  |     |     \\  |    | ");
		System.out.println("           \\|_____|      \\ |____| ");
	}
		
		
		
	public static void Hpart() {
		System.out.println("        |   |     |     |  |    |");
	}
	
	public static void Itop() {
		System.out.println(" _______________________");
		System.out.println("| \\_____________________\\");
		System.out.println(" \\|_______      ________|");
	}
	
	public static void Imiddle() {
		System.out.println("        | |     | ");
	}
	public static void Ibottom() {
		System.out.println(" _______| |     |_______");
		System.out.println("|\\______ \\|     |_______\\");
		System.out.println(" \\|______________________|");
	}
	
	
	
	
}


		