package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contact.Contact;

class contactTest {
	
	//test constructor with valid input
	@Test
	public void testConstructorValid() {
		String contactId = "90978";
      	String firstName = "Rudolph";
        String lastName = "Jones";
        String phoneNumber = "2021874545";
        String address = "7924 Hollywood Blvd";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);
        
		assertEquals(90978, testContact.getContactId());
		assertEquals(firstName, testContact.getFirstName());
		assertEquals(lastName, testContact.getLastName());
		assertEquals(phoneNumber, testContact.getPhoneNumber());
		assertEquals(address, testContact.getAddress());
	}

	@Test
	// test constructor with bad input info
	public void testConstructorInvalid() {
        String contactId = "90979";
      	String firstName = "Rudolph";
        String lastName = "Jones";
        String phoneNumber = "21";
        String address = "7924 Hollywood Blvd";       
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(contactId, firstName, lastName, phoneNumber, address);
        });
	}

	@Test
	//test setFirstName with valid input
	public void testValidSetFirstName() {
        String contactId = "90980";
      	String firstName = "Rudolph";
        String lastName = "Jones";
        String phoneNumber = "2021874545";
        String address = "7924 Hollywood Blvd";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        testContact.setFirstName("Test");        
        assertEquals("Test", testContact.getFirstName());
	}

	@Test
	//test to make sure an error is thrown when stFirstName is null
	public void testInvalidSetFirstName() {
        String contactId = "90980";
      	String firstName = "Rudolph";
        String lastName = "Jones";
        String phoneNumber = "2021874545";
        String address = "7924 Hollywood Blvd";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setFirstName(null);
        });
	}

	@Test
	// test setFirstName with a length that is too long
	public void testLongSetFirstName() {
        String contactId = "90980";
      	String firstName = "Rudolph";
        String lastName = "Jones";
        String phoneNumber = "2021874545";
        String address = "7924 Hollywood Blvd";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setFirstName("Impossiblethatthisisaname");
        });
	}

	@Test
	//test getContactId
	public void testGetContactId() {
        String contactId = "90980";
      	String firstName = "Rudolph";
        String lastName = "Jones";
        String phoneNumber = "2021874545";
        String address = "7924 Hollywood Blvd";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        assertEquals(90980, testContact.getContactId());
	}

	@Test
	// test with contactId that is so long
	public void testlongGetContactId() {
        String contactId = "909802154568542584555584";
      	String firstName = "Rudolph";
        String lastName = "Jones";
        String phoneNumber = "2021874545";
        String address = "7924 Hollywood Blvd";
		
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(contactId, firstName, lastName, phoneNumber, address);
        });
	}
	
	@Test
	//test when setLastName
	public void testInvalidSetLastName() {
        String contactId = "90980";
      	String firstName = "Rudolph";
        String lastName = "Jones";
        String phoneNumber = "2021874545";
        String address = "7924 Hollywood Blvd";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setLastName(null);
        });
	}
	
	@Test
	//test when setLastName when is too long
	public void testlongSetLastName() {
        String contactId = "90980";
      	String firstName = "Rudolph";
        String lastName = "Jones";
        String phoneNumber = "2021874545";
        String address = "7924 Hollywood Blvd";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setLastName("thisNamethisNamelastNamelastName");
        });
	}
	
	
	@Test
	//test 
	public void testValidSetLastName() {
        String contactId = "90980";
      	String firstName = "Rudolph";
        String lastName = "Jones";
        String phoneNumber = "2021874545";
        String address = "7924 Hollywood Blvd";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        testContact.setLastName("Test");        
        assertEquals("Test", testContact.getLastName());
	}
	

	@Test
	//test when phone number is set to null
	public void testInvalidSetPhoneNumber() {
        String contactId = "90980";
      	String firstName = "Rudolph";
        String lastName = "Jones";
        String phoneNumber = "2021874545";
        String address = "7924 Hollywood Blvd";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setPhoneNumber(null);
        });
        
	}
	
	
	@Test
	//test when phone number length is not 10
	public void testInvalidLengthPhoneNumber() {
        String contactId = "90980";
      	String firstName = "Rudolph";
        String lastName = "Jones";
        String phoneNumber = "2021874545";
        String address = "7924 Hollywood Blvd";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setPhoneNumber("1");
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setPhoneNumber("22222255554442152369857412583");
        });
	}

	@Test
	//test with a good phone number input
	public void testValidPhoneNumber() {
        String contactId = "90980";
      	String firstName = "Rudolph";
        String lastName = "Jones";
        String phoneNumber = "2021874545";
        String address = "7924 Hollywood Blvd";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   

        testContact.setPhoneNumber("2021874545");        
        assertEquals("2021874545", testContact.getPhoneNumber());

	}
	
	
	@Test
	//test with setting address to null
	public void testNullSetAddress() {
        String contactId = "90980";
      	String firstName = "Rudolph";
        String lastName = "Jones";
        String phoneNumber = "2021874545";
        String address = "7924 Hollywood Blvd";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setAddress(null);
        });
        
	}
	
	@Test
	//test when the address is more then 30 characters
	public void testWrongLengthAddress() {
        String contactId = "90980";
      	String firstName = "Rudolph";
        String lastName = "Jones";
        String phoneNumber = "2021874545";
        String address = "7924 Hollywood Blvd";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setAddress("780845254 I can not believe this adrress is not butter or is it the world would never know");
        });
	}

	@Test
	//
	public void testValidAddress() {
        String contactId = "90980";
      	String firstName = "Rudolph";
        String lastName = "Jones";
        String phoneNumber = "2021874545";
        String address = "7924 Hollywood Blvd";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   

        testContact.setAddress("2025 cool place to live");        
        assertEquals("2025 cool place to live", testContact.getAddress());

	}
	
}