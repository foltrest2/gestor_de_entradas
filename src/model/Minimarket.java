package model;

import java.util.ArrayList;
import java.time.LocalDate;

import exceptions.InvalidIdException;
import exceptions.InvalidIdTypeException;

public class Minimarket {

	private ArrayList<Client> clients;
	private String name = "Mi barrio te quiere";
	private int count = 0;

	/**
	 * 
	 * @param name
	 */
	public Minimarket() {
		clients = new ArrayList<>();
	}

	public void register(int choice, String Id) throws InvalidIdException, InvalidIdTypeException {

		int x = Id.length()-2;
		char condition = Id.charAt(x);
		
		if(choice == 1) {
			throw new InvalidIdTypeException();
		}
		if(LocalDate.now().getDayOfMonth()%2 != 0 && (int)condition%2 !=0) {
			throw new InvalidIdException();
		}
		if(LocalDate.now().getDayOfMonth()%2 == 0 && (int)condition%2 ==0) {
			throw new InvalidIdException();
		}
		switch (choice) {
		case 2:
			Client clientCC = new Client("CC", Id);
			clients.add(clientCC);
			break;

		case 3:
			Client clientPP = new Client("PP", Id);
			clients.add(clientPP);
			break;

		case 4:
			Client clientCE = new Client("CE", Id);
			clients.add(clientCE);
			break;

		default:
			break;
		}
	}

	public String getName() {
		return name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}