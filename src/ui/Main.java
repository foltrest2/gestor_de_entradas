package ui;

import model.Minimarket;
import java.util.Scanner;

public class Main {

	public static final int REGISTER_CLIENT = 1;
	public static final int SHOW_TRY_ENTRY = 2;
	public static final int EXIT = 3;
	
	Minimarket minimarket = new Minimarket();
	Scanner lector = new Scanner(System.in);

	public static void main(String[] args) {
		Main m;
		m = new Main();
		m.startProgram();
	}
	
	public void operation(int choice) {
		switch (choice) {

		case REGISTER_CLIENT:
			System.out.println(minimarket.getName());
			break;

		case SHOW_TRY_ENTRY:
			break;
			
		case EXIT:
			break;

		default: System.out.println("Select a valid choice");
		break;
		}
	}
	
	public void showMenu() {
		System.out.println("What do you want to do?\n 1. Register a client\n 2. Show try's of entry\n 3. Exit");
	}
	
	public int readOption() {	
		int choice = lector.nextInt();
		lector.nextLine();
		return choice;
	}
	
	public void startProgram() {
		int choice;
		do {
			showMenu();
			choice = readOption();
			operation(choice);
		}
		while(choice!=EXIT);
	}

}