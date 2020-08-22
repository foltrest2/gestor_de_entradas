package model;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import exceptions.InvalidIdException;
import exceptions.InvalidIdTypeException;

class MinimarketTest {

	private Minimarket mini;
	
	public void setupScenary1() throws InvalidIdException, InvalidIdTypeException {
		mini = new Minimarket();
		mini.register(2, "1234567");
	}
	
	public void setupScenary2() throws InvalidIdException, InvalidIdTypeException {
		mini = new Minimarket();
		mini.register(1, "1234567");
	}
	
	public void setupScenary3() throws InvalidIdException, InvalidIdTypeException {
		mini = new Minimarket();
		if(LocalDate.now().getDayOfMonth()%2 != 0)
			mini.register(3, "1234567");
		if(LocalDate.now().getDayOfMonth()%2 == 0)
			mini.register(4, "1234576");
	}
	
	@Test
	public void registerTest_1() throws InvalidIdException, InvalidIdTypeException {
		setupScenary1();
		
		assertEquals(1, mini.getClients().size(),"Nothing was added");	
	}
	
	@Test
	public void registerTest_2() throws InvalidIdException, InvalidIdTypeException {
		try {
			setupScenary2();
			}
			catch(InvalidIdTypeException e) {
				assertEquals("Young people can't get out of them houses", e.getMessage(),"TI registered, method failed");
			}
			
	}
	
	@Test
	public void registerTest_3() throws InvalidIdException, InvalidIdTypeException {
		try {
			setupScenary3();
			}
			catch(InvalidIdException e) {
				assertEquals("This isn't your day to get out of your house, come tomorrow", e.getMessage(),"Client registered, method failed");
			}
			
	}

}
