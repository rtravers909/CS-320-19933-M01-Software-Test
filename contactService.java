package contact;

import java.util.List;
import java.util.ArrayList;

public class contactService {
	
	int currentIdNumber = 0;
	
	//create the array list to hold the info
	public static List<Contact> contactList = new ArrayList<Contact>();
	
	//adds contact with the parameters
	
	public void addContact(String firstName, String lastName, String phoneNumber, String address) {
		
		String stringId = Integer.toString(currentIdNumber);
		
		Contact newContact = new Contact(stringId, firstName, lastName, phoneNumber, address);
		contactList.add(newContact);
		
		++currentIdNumber;
	}
	
	//method to delete contact
	public void deleteContact(String Id) {
		int intId;
		try {
			// Convert the String ID to an integer for comparison
			intId = Integer.valueOf(Id);
		} catch (NumberFormatException e) {
			// Handle case where Id is not a valid integer
			throw new IllegalArgumentException("Invalid ID format: must be a number.", e);
		}
		
		boolean foundAndRemoved = false;
		
		for(int i = 0; i < contactList.size(); i++) {
			if(contactList.get(i).getContactId() == intId) {
				contactList.remove(i);
				foundAndRemoved = true;
				break;
			}
		}
	}
	
	//update firstName
	
	public void updateFirstName(String contactId, String firstName) {
		for(Contact iter : contactList) {
			if(iter.getContactId() == Integer.valueOf(contactId)) {
				iter.setFirstName(firstName);
				break;
			}
		}
	}

	//update lastName
	
	public void updateLasttName(String contactId, String lastName) {
		for(Contact iter : contactList) {
			if(iter.getContactId() == Integer.valueOf(contactId)) {
				iter..setLastName(lastName);
				break;
			}
		}
	}
	
	//update phoneNumber
	public void updatePhoneNumner(String contactId, String phoneNumber) {
		for(Contact iter : contactList) {
			if(iter.getContactId() == Integer.valueOf(contactId)) {
				iter.setPhoneNumber(phoneNumber);
				break;
			}
		}
	}
	
	//update address
	public void updateAdress(String contactId, String address) {
		for(Contact iter : contactList) {
			if(iter.getContactId() == Integer.valueOf(contactId)) {
				iter.setAddresse(address);
				break;
			}
		}
	}
}
