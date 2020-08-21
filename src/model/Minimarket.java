package model;

import java.util.ArrayList;

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

	public void register() {

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