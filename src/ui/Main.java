package ui;

import model.Minimarket;
import java.util.Scanner;

import exceptions.InvalidIdException;
import exceptions.InvalidIdTypeException;

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

	public void register() {
		System.out.println("Choose your id Type:\n1. TI\n2. CC\n3. PP\n4. CE");
		int choice = lector.nextInt();
		lector.nextLine();
		System.out.println("Type your id number please");
		String id = lector.nextLine();
		try {
			minimarket.register(choice, id);
		}
		catch(InvalidIdTypeException e) {
			System.err.println(e.getMessage());
		}
		catch(InvalidIdException e) {
			System.err.println(e.getMessage());
		}
		finally {
			minimarket.setCount(minimarket.getCount()+1);
		}
	}

	public void operation(int choice) {
		switch (choice) {

		case REGISTER_CLIENT:
			register();
			break;

		case SHOW_TRY_ENTRY:
			System.out.println(minimarket.getCount());
			break;

		case EXIT:
			break;

		default: System.out.println("Select a valid choice");
		break;
		}
	}

	public void showMenu() {
		System.out.println("\nWhat do you want to do?\n 1. Register a client\n 2. Show try's of entry\n 3. Exit");
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